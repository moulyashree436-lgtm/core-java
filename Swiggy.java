class Swiggy {
String itemName;
String hotelName;
int deliveryTime;
public Swiggy() {
}
public Swiggy(String itemName, String hotelName, int deliveryTime) {
this.itemName = itemName;
this.hotelName = hotelName;
this.deliveryTime = deliveryTime;
}
public void display() {
System.out.println(itemName);
System.out.println(hotelName);
System.out.println(deliveryTime);
System.out.println("-------------------");
}
}

