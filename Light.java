class Light {
static boolean isLightOnOrOffButton = false;
static int maxBrightness = 10;
static int minBrightness = 0;
static int currentBrightness;
static void checkLightIsOnOrOff() {
if (isLightOnOrOffButton == false) {
System.out.println("Checking : LIGHT IS OFF");
} else {
System.out.println("Checking : LIGHT IS ON");
}
}
static void turnOnLight() {
System.out.println("Turning ON the LIGHT");
isLightOnOrOffButton = true;
}
static int getCurrentBrightness() {
return currentBrightness;
}
static void increaseTemp(){
if(isLightOnOrOffButton == true){
System.out.println("Yess Light is on i am ready to Increase Temp");
if(currentTemps < 26 ){
currentTemps = currentTemps + 1;
}else{
System.out.println("Light is already in MAX TempS");
}
}else{
System.out.println("Light is OFF");
}
}
static void decreaseTemp(){
if(isCameraOnOrOffButton == true){
System.out.println("yess Light is on i am ready to decrease Temp");
if(currentTemps > -26){
currentTemps = currentTemps - 1;
}else{
System.out.println("Light is alreadyin MIN Temp");
}
}else{
System.out.println("Light is off");
}
}
}