class LaptopRunner {
public static void main(String[] args) {
Laptop.checkLaptopIsOnOrOff();
Laptop.turnOnLaptop();
Laptop.checkLaptopIsOnOrOff();
int currentBrightness = Laptop.getCurrentBrightness();
System.out.println("Current Brightness is : " + currentBrightness);
}
}