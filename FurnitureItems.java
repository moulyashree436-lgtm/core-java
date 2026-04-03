class FurnitureItems {
String itemName;
String material;
int price;
boolean isAvailable;
public FurnitureItems() {
}
public FurnitureItems(String itemName, String material, int price, boolean isAvailable) {
this.itemName = itemName;
this.material = material;
this.price = price;
this.isAvailable = isAvailable;
System.out.println("4 parameter constructor");
}
public FurnitureItems(String itemName, int price) {
this.itemName = itemName;
this.price = price;
System.out.println("2 parameter constructor");
}
public FurnitureItems(String material) {
this.material = material;
System.out.println("1 parameter constructor");
}
public void display() {
System.out.println(itemName);
System.out.println(material);
System.out.println(price);
System.out.println(isAvailable);
System.out.println("------------------");
}
}