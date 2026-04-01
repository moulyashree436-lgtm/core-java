class HeadPhoneRunner {
public static void main(String[] args){
Headphone:brand();
Headphone.setVolume(10);
int headphonePrice = Headphone.Price();
System.out.println("price: " + headphonePrice);
String headphoneColor = Headphone.color("Blue");
System.out.println("Color: " + headphoneColor);
}
}