package ss5_accessmodifier_static_method_static_property.thuchanh;

public class Hotel {
    private int id;
    private String roomtype;
    private double price;

    public Hotel(){

    }
    public Hotel(int id,String roomtype,double price){
        this.id=id;
        this.roomtype =roomtype;
        this.price=price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRoomtype() {
        return roomtype;
    }

    public void setRoomtype(String roomtype) {
        this.roomtype = roomtype;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "id=" + id +
                ", roomtype='" + roomtype + '\'' +
                ", price=" + price +
                '}';
    }
}
