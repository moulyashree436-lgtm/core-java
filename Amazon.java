class Amazon {
String productName;
String category;
int price;
public Amazon() {
}
public Amazon(String productName, String category, int price) {
this.productName = productName;
this.category = category;
this.price = price;
}
public void display() {
System.out.println(productName);
System.out.println(category);
System.out.println(price);
System.out.println("-------------------");
}
}

