class ElectronicsItems {
String itemName;
String brand;
int price;
boolean isAvailable;
public ElectronicsItems() {
}
public ElectronicsItems(String itemName, String brand, int price, boolean isAvailable) {
this.itemName = itemName;
this.brand = brand;
this.price = price;
this.isAvailable = isAvailable;
System.out.println("4 parameter constructor");
}
public ElectronicsItems(String itemName, int price) {
this.itemName = itemName;
this.price = price;
System.out.println("2 parameter constructor");
}
public ElectronicsItems(String brand) {
this.brand = brand;
System.out.println("1 parameter constructor");
}
public void display() {
System.out.println(itemName);
System.out.println(brand);
System.out.println(price);
System.out.println(isAvailable);
System.out.println("------------------");
}
}