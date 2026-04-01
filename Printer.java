class Printer {
static boolean isPrinterOnOrOffButton = false;
static int maxPages = 100;
static int minPages = 0;
static int currentPages;
static void checkPrinterIsOnOrOff() {
if (isPrinterOnOrOffButton == false) {
System.out.println("Checking : PRINTER IS OFF");
} else {
System.out.println("Checking : PRINTER IS ON");
}
}
static void turnOnPrinter() {
System.out.println("Turning ON the PRINTER");
isPrinterOnOrOffButton = true;
}
static int getCurrentPages() {
return currentPages;
}
static int getCurrentTemps(){
return currentTemps;
}
static void increaseTemp(){
if(isPrinterOnOrOffButton == true){
System.out.println("Yess Printer is on i am ready to Increase Temp");
if(currentTemps < 26 ){
currentTemps = currentTemps + 1;
}else{
System.out.println("Printer is already in MAX TempS");
}
}else{
System.out.println("Printer is OFF");
}
}
static void decreaseTemp(){
if(isPrinterOnOrOffButton == true){
System.out.println("yess Printer is on i am ready to decrease Temp");
if(currentTemps > -26){
currentTemps = currentTemps - 1;
}else{
System.out.println("Printer is alreadyin MIN Temp");
}
}else{
System.out.println("Printer is off");
}
}
}
