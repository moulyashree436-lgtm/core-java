class LaptopRunner {
public static void main(String[] args){
Laptop.brand();
Laptop.customerName("Moulya");
double price = Laptop.priceOfLaptop();
System.out.println("The price of Laptop : " + price);
int laptopOrdered = Laptop.numberOfLaptopOrdered(4, 6);
System.out.println("The total number of Laptops Ordered: " + laptopOrdered);
}
}