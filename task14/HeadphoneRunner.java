class HeadphoneRunner {
public static void main(String[] args){
Headphone.brand();
Headphone.customerName("Moulya");
double price = Headphone.priceOfHeadphone();
System.out.println("The price of Headphone : " + price);
int headphoneOrdered = Headphone.numberOfHeadphoneOrdered(2, 5);
System.out.println("The total number of Headphones Ordered: " + headphoneOrdered);
}
}