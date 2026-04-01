class MobileRunner {
public static void main(String[] args) {
Mobile.checkMobileIsOnOrOff();
Mobile.turnOnMobile();
Mobile.checkMobileIsOnOrOff();
int currentVolume = Mobile.getCurrentVolume();
System.out.println("Current Volume is : " + currentVolume);
}
}