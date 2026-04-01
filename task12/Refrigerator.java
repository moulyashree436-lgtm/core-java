class Refrigerator {
static boolean isFridgeOnOrOffButton = false;
static int maxTemp = 10;
static int minTemp = -5;
static int currentTemp;
static void checkFridgeIsOnOrOff() {
if (isFridgeOnOrOffButton == false) {
System.out.println("Checking : REFRIGERATOR IS OFF");
} else {
System.out.println("Checking : REFRIGERATOR IS ON");
}
}
static void turnOnFridge() {
System.out.println("Turning ON the REFRIGERATOR");
isFridgeOnOrOffButton = true;
}
static int getCurrentTemp() {
return currentTemp;
}
static int getCurrentTemps(){
return currentTemps;
}
static void increaseTemp(){
if(isRefrigeratorOnOrOffButton == true){
System.out.println("Yess Refrigerator is on i am ready to Increase Temp");
if(currentTemps < 26 ){
currentTemps = currentTemps + 1;
}else{
System.out.println("Refrigerator is already in MAX TempS");
}
}else{
System.out.println("Refrigerator is OFF");
}
}
static void decreaseTemp(){
if(isRefrigeratorOnOrOffButton == true){
System.out.println("yess Refrigerator is on i am ready to decrease Temp");
if(currentTemps > -26){
currentTemps = currentTemps - 1;
}else{
System.out.println("Refrigerator is alreadyin MIN Temp");
}
}else{
System.out.println("Refrigerator is off");
}
}
}


