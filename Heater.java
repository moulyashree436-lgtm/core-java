class Heater {
static boolean isHeaterOnOrOffButton = false;
static int maxTemp = 40;
static int minTemp = 0;
static int currentTemp;
static void checkHeaterIsOnOrOff() {
if (isHeaterOnOrOffButton == false) {
System.out.println("Checking : HEATER IS OFF");
} else {
System.out.println("Checking : HEATER IS ON");
}
}
static void turnOnHeater() {
System.out.println("Turning ON the HEATER");
isHeaterOnOrOffButton = true;
}
static int getCurrentTemp() {
return currentTemp;
}
}