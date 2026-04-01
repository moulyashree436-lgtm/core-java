class TV {
static boolean isTVOnOrOffButton = false;
static int maxVolume = 100;
static int minVolume = 0;
static int currentVolume;
static void checkTVIsOnOrOff() {
if (isTVOnOrOffButton == false) {
System.out.println("Checking : TV IS OFF");
} else {
System.out.println("Checking : TV IS ON");
}
}
static void turnOnTV() {
System.out.println("Turning ON the TV");
isTVOnOrOffButton = true;
}
static int getCurrenttVolum() {
return currentVolume;
}
static int getCurrentVolum(){
return currentVolume;
static void increaseVolum(){
if(isACOnOrOffButton == true){
System.out.println("Yess AC is on i am ready to Increase Volum");
if(currentTemps < 26 ){
currentTemps = currentVolums + 1;
}else{
System.out.println("AC is already in MAX VolumS");
}
}else{
System.out.println("AC is OFF");
}
}
static void decreaseVolum(){
if(isACOnOrOffButton == true){
System.out.println("yess AC is on i am ready to decrease Volum");
if(currentVolums > -26){
currentVolums= currentVolums - 1;
}else{
System.out.println("AC is alreadyin MIN Temp");
}
}else{
System.out.println("AC is off");
}
}
}
