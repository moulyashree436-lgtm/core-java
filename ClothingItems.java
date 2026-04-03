class ClothingItems {
String itemName;
String brand;
int price;
boolean isAvailable;
public ClothingItems() {
}
public ClothingItems(String itemName, String brand, int price, boolean isAvailable) {
this.itemName = itemName;
this.brand = brand;
this.price = price;
this.isAvailable = isAvailable;
System.out.println("4 parameter constructor");
}
public ClothingItems(String itemName, int price) {
this.itemName = itemName;
this.price = price;
System.out.println("2 parameter constructor");
}
public ClothingItems(String brand) {
this.brand = brand;
System.out.println("1 parameter constructor");
}
public void display() {
System.out.println(itemName);
System.out.println(price);
System.out.println("------------------");
}
}