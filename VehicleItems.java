class VehicleItems {
String vehicleName;
String brand;
int price;
boolean isAvailable;
public VehicleItems() {
}
public VehicleItems(String vehicleName, String brand, int price, boolean isAvailable) {
this.vehicleName = vehicleName;
this.brand = brand;
this.price = price;
this.isAvailable = isAvailable;
System.out.println("4 parameter constructor");
}
public VehicleItems(String vehicleName, int price) {
this.vehicleName = vehicleName;
this.price = price;
System.out.println("2 parameter constructor");
}
public VehicleItems(String brand) {
this.brand = brand;
System.out.println("1 parameter constructor");
}
public void display() {
System.out.println(vehicleName);
System.out.println(price);
System.out.println("------------------");
}
}