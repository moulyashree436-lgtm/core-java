class WashingMachine {
static boolean isMachineOnOrOffButton = false;
static int maxSpeed = 1200;
static int minSpeed = 0;
static int currentSpeed;
static void checkMachineIsOnOrOff() {
if (isMachineOnOrOffButton == false) {
System.out.println("Checking : WASHING MACHINE IS OFF");
} else {
System.out.println("Checking : WASHING MACHINE IS ON");
}
}
static void turnOnMachine() {
System.out.println("Turning ON the WASHING MACHINE");
isMachineOnOrOffButton = true;
}
static int getCurrentSpeed() {
return currentSpeed;
}
}