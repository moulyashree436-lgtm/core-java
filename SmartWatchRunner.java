class SmartWatchRunner {
public static void main(String[] args){
SmartWatch.brand();
SmartWatch.customerName("Moulya");
double price = SmartWatch.priceOfSmartWatch();
System.out.println("The price of SmartWatch : " + price);
int smartWatchOrdered = SmartWatch.numberOfSmartWatchOrdered(1, 4);
System.out.println("The total number of SmartWatches Ordered: " + smartWatchOrdered);
}
}