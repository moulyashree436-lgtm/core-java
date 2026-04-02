class Flipkart {
String productName;
String brand;
int price;
public Flipkart() {
}
public Flipkart(String productName, String brand, int price) {
this.productName = productName;
this.brand = brand;
this.price = price;
}
public void display() {
System.out.println(productName);
System.out.println(brand);
System.out.println(price);
System.out.println("-------------------");
}
}

