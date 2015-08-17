package com.example.theradishcabbagewatermelon.ticketsquery;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import android.os.Handler;
import android.os.Message;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class MainActivity extends Activity {

    String  httpUrl = "http://apis.baidu.com/apistore/qunaerticket/querydetail";
    String  httpArg = "id=1361653183";

    private TextView responseText;

    public final static int SHOW_RESPONSE = 1;

    private Handler handler = new Handler() {

        public void handleMessage(Message msg) {
            switch(msg.what) {
                case SHOW_RESPONSE:
                    String response = (String)msg.obj;
                    responseText.setText(response);
            }
        }
    };

    private TextView ticketsQuery = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        responseText = (TextView)findViewById(R.id.ticket_query);
        request(httpUrl, httpArg);

    }

    public void request(final String httpUrl, final String httpArg) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                BufferedReader reader = null;
                String result = null;
                StringBuffer sbf = new StringBuffer();
                String http_Url = httpUrl + "?" + httpArg;

                try {
                    URL url = new URL(http_Url);
                    HttpURLConnection connection = (HttpURLConnection) url
                            .openConnection();
                    connection.setRequestMethod("GET");
                    connection.setRequestProperty("apikey", "e82bbac358dfd0f351d981ee23a943bf");
                    connection.connect();
                    InputStream is = connection.getInputStream();
                    reader = new BufferedReader(new InputStreamReader(is,"UTF-8"));
                    String strRead = null;
                    while ((strRead = reader.readLine()) != null) {
                        sbf.append(strRead);
                        sbf.append("\r\n");
                    }
                    reader.close();
                    result = (sbf.toString());

                    Message message = new Message();
                    message.what = SHOW_RESPONSE;
                    message.obj = result;
                    handler.sendMessage(message);
                    ParseJSONWithGSON.parseJSON(result);

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }

}
