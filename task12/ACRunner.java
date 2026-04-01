class ACRunner {
public static void main(String[] args){
AC.checkAcIsOnOrOff();
AC.turnOnAC();
AC.checkAcIsOnOrOff();
int currentTemp = AC.getCurrentTemp();
System.out.println("Current Temp is : " + currentTemp);
System.out.println("INCREASE TEMP");
AC.increaseTemp();
AC.increaseTemp();
AC.increaseTemp();
AC.increaseTemp();
AC.increaseTemp();
System.out.println("DECREASE TEMP");
AC.decreaseTemp();
AC.decreaseTemp();
AC.decreaseTemp();
AC.decreaseTemp();
AC.decreaseTemp();
AC.decreaseTemp();
AC.decreaseTemp();
}
}