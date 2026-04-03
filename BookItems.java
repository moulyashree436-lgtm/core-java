class BookItems {
String bookName;
String author;
int price;
boolean isAvailable;
public BookItems() {
}
public BookItems(String bookName, String author, int price, boolean isAvailable) {
this.bookName = bookName;
this.author = author;
this.price = price;
this.isAvailable = isAvailable;
System.out.println("4 parameter constructor");
}
public BookItems(String bookName, int price) {
this.bookName = bookName;
this.price = price;
System.out.println("2 parameter constructor");
}
public BookItems(String author) {
this.author = author;
System.out.println("1 parameter constructor");
}
public void display() {
System.out.println(bookName);
System.out.println(author);
System.out.println(price);
System.out.println(isAvailable);
System.out.println("------------------");
}
}