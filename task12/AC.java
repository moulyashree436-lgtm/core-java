class AC{
static boolean isACOnOrOffButton = false;
static int maxTemp = 26;
static int minTemp = -26;
static int currentTemps ;
static void checkAcIsOnOrOff(){
if(isACOnOrOffButton == false){
System.out.println("checking : AC IS OFF");
}else{
System.out.println("checking :  AC IS ON");
}
}
static void turnOnAC(){
System.out.println("Turing on the AC");
isACOnOrOffButton = true;
}
static int getCurrentTemp(){
return currentTemps;
}
static int getCurrentTemps(){
return currentTemps;
}
static void increaseTemp(){
if(isACOnOrOffButton == true){
System.out.println("Yess AC is on i am ready to Increase Temp");
if(currentTemps < 26 ){
currentTemps = currentTemps + 1;
}else{
System.out.println("AC is already in MAX TempS");
}
}else{
System.out.println("AC is OFF");
}
}
static void decreaseTemp(){
if(isACOnOrOffButton == true){
System.out.println("yess AC is on i am ready to decrease Temp");
if(currentTemps > -26){
currentTemps = currentTemps - 1;
}else{
System.out.println("AC is alreadyin MIN Temp");
}
}else{
System.out.println("AC is off");
}
}
}
