package com.example.theradishcabbagewatermelon.ticketsquery;
class PriceList{
    String ticketTitle;
    String ticketID;
    String priceType;
    String price;
    String normalPrice;
    String num;
    String type;
    String bookUrl;
    public String getTicketTitle() {
        return ticketTitle;
    }
    public void setTicketTitle(String ticketTitle) {
        this.ticketTitle = ticketTitle;
    }
    public String getTicketID() {
        return ticketID;
    }
    public void setTicketID(String ticketID) {
        this.ticketID = ticketID;
    }
    public String getPriceType() {
        return priceType;
    }
    public void setPriceType(String priceType) {
        this.priceType = priceType;
    }
    public String getPrice() {
        return price;
    }
    public void setPrice(String price) {
        this.price = price;
    }
    public String getNormalPrice() {
        return normalPrice;
    }
    public void setNormalPrice(String normalPrice) {
        this.normalPrice = normalPrice;
    }
    public String getNum() {
        return num;
    }
    public void setNum(String num) {
        this.num = num;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String getBookUrl() {
        return bookUrl;
    }
    public void setBookUrl(String bookUrl) {
        this.bookUrl = bookUrl;
    }
}
class Ticket{
    private PriceList priceList;
    String spotName;
    String alias;
    String spotID;
    String description;
    String detailUrl;
    String address;
    String province;
    String city;
    String coordinates;
    String imageUrl;
    String comments;
    public Ticket(){}
    public Ticket(String spotName, String alias, String spotID,
                  String description, String detailUrl, String address,
                  String province, String city, String coordinates,
                  String imageUrl,String comments) {
        this.spotName = spotName; this.alias = alias; this.spotID = spotID;
        this.description = description; this.detailUrl = detailUrl;
        this.address = address; this.province = province; this.city = city;
        this.coordinates = coordinates; this.imageUrl = imageUrl;
        this.comments = comments;
    }
    public PriceList getPriceList() {
        return priceList;
    }
    public void setPriceList(PriceList priceList) {
        this.priceList = priceList;
    }
    public String getSpotName() {
        return spotName;
    }
    public void setSpotName(String spotName) {
        this.spotName = spotName;
    }
    public String getAlias() {
        return alias;
    }
    public void setAlias(String alias) {
        this.alias = alias;
    }
    public String getSpotID() {
        return spotID;
    }
    public void setSpotID(String spotID) {
        this.spotID = spotID;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getDetailUrl() {
        return detailUrl;
    }
    public void setDetailUrl(String detailUrl) {
        this.detailUrl = detailUrl;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getProvince() {
        return province;
    }
    public void setProvince(String province) {
        this.province = province;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getCoordinates() {
        return coordinates;
    }
    public void setCoordinates(String coordinates) {
        this.coordinates = coordinates;
    }
    public String getImageUrl() {
        return imageUrl;
    }
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
    public String getComments() {
        return comments;
    }
    public void setComments(String comments) {
        this.comments = comments;
    }
}

class Display{
    private Ticket ticket;
    String category;
    String subcate;
    String source;
    public Display(){}
    public Display(Ticket ticket, String category, String subcate,
            String source) {
        this.ticket = ticket;
        this.category = category; this.subcate = subcate;
    }
    public Ticket getTicket() {
        return ticket;
    }
    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public String getSubcate() {
        return subcate;
    }
    public void setSubcate(String subcate) {
        this.subcate = subcate;
    }
    public String getSource() {
        return source;
    }
    public void setSource(String source) {
        this.source = source;
    }
}

class Data{
    private Display display;
    public Data(){}
    public Data(Display display){
        this.display = display;
    }
    public Display getDisplay() {
        return display;
    }
    public void setDisplay(Display display) {
        this.display = display;
    }
}

class TicketDetail{
    private Data data;
    String loc;
    String lastmod;
    String changefreq;
    String priority;
    public TicketDetail(){}
    public TicketDetail(Data data, String loc, String lastmod,
                        String changefreq ,String priority){
        this.data = data; this.loc = loc;
        this.lastmod = lastmod; this.changefreq = changefreq;
        this.priority = priority;
    }
    public Data getData() {
        return data;
    }
    public void setData(Data data) {
        this.data = data;
    }
    public String getLoc() {
        return loc;
    }
    public void setLoc(String loc) {
        this.loc = loc;
    }
    public String getLastmod() {
        return lastmod;
    }
    public void setLastmod(String lastmod) {
        this.lastmod = lastmod;
    }
    public String getChangefreq() {
        return changefreq;
    }
    public void setChangefreq(String changefreq) {
        this.changefreq = changefreq;
    }
    public String getPriority() {
        return priority;
    }
    public void setPriority(String priority) {
        this.priority = priority;
    }

}
class RetData{
    private TicketDetail ticketDetail;
    String id;
    public RetData(){}
    public RetData(TicketDetail ticketDetail, String id) {
        this.ticketDetail = ticketDetail;
        this.id = id;
    }
    public TicketDetail getTicketDetail() {
        return ticketDetail;
    }
    public void setTicketDetail(TicketDetail ticketDetail) {
        this.ticketDetail = ticketDetail;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

}
public class LandmarkTicket{
    private RetData retData;
    int errNum;
    String errMsg;
    public LandmarkTicket(){}
    public LandmarkTicket(RetData retData,int errNum, String errMsg){
        this.retData = retData; this.errNum = errNum; this.errMsg = errMsg;
    }
    public RetData getRetData() {
        return retData;
    }
    public void setRetData(RetData retData) {
        this.retData = retData;
    }
    public int getErrNum() {
        return errNum;
    }
    public void setErrNum(int errNum) {
        this.errNum = errNum;
    }
    public String getErrMsg() {
        return errMsg;
    }
    public void setErrMsg(String errMsg) {
        this.errMsg = errMsg;
    }
}