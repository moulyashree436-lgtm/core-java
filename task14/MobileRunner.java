class MobileRunner {
public static void main(String[] mobile){
Mobile.brand();
Mobile.customerName("Moulya");
double price = Mobile.priceOfMobile();
System.out.println("The price of Mobile : " + price);
int mobileOrdered = Mobile.numberOfMobileOrdered(3, 7);
System.out.println("The total number of Mobiles Ordered: " + mobileOrdered);
}
}