class Camera {
static boolean isCameraOnOrOffButton = false;
static int maxZoom = 10;
static int minZoom = 0;
static int currentZoom;
static void checkCameraIsOnOrOff() {
if (isCameraOnOrOffButton == false) {
System.out.println("Checking : CAMERA IS OFF");
} else {
System.out.println("Checking : CAMERA IS ON");
}
}
static void turnOnCamera() {
System.out.println("Turning ON the CAMERA");
isCameraOnOrOffButton = true;
}
static int getCurrentZoom() {
return currentZoom;
}
static int getCurrentTemps(){
return currentTemps;
}
static void increaseTemp(){
if(isCameraOnOrOffButton == true){
System.out.println("Yess Camera is on i am ready to Increase Temp");
if(currentTemps < 26 ){
currentTemps = currentTemps + 1;
}else{
System.out.println("Camera is already in MAX TempS");
}
}else{
System.out.println("Camera is OFF");
}
}
static void decreaseTemp(){
if(isCameraOnOrOffButton == true){
System.out.println("yess Camera is on i am ready to decrease Temp");
if(currentTemps > -26){
currentTemps = currentTemps - 1;
}else{
System.out.println("Camera is alreadyin MIN Temp");
}
}else{
System.out.println("Camera is off");
}
}
}


