class Laptop {
static boolean isLaptopOnOrOffButton = false;
static int maxBrightness = 100;
static int minBrightness = 0;
static int currentBrightness;
static void checkLaptopIsOnOrOff() {
if (isLaptopOnOrOffButton == false) {
System.out.println("Checking : LAPTOP IS OFF");
} else {
System.out.println("Checking : LAPTOP IS ON");
}
}
static void turnOnLaptop() {
System.out.println("Turning ON the LAPTOP");
isLaptopOnOrOffButton = true;
   }
static int getCurrentBrightness() {
return currentBrightness;
}
}