class RefrigeratorRunner {
public static void main(String[] args) {
Refrigerator.checkFridgeIsOnOrOff();
Refrigerator.turnOnFridge();
Refrigerator.checkFridgeIsOnOrOff();
int currentTemp = Refrigerator.getCurrentTemp();
System.out.println("Current Temperature is : " + currentTemp);
System.out.println("INCREASE TEMP");
Refrigerator.increaseTemp();
Refrigerator.increaseTemp();
Refrigerator.increaseTemp();
Refrigerator.increaseTemp();
Refrigerator.increaseTemp();
System.out.println("DECREASE TEMP");
Refrigerator.decreaseTemp();
Refrigerator.decreaseTemp();
Refrigerator.decreaseTemp();
Refrigerator.decreaseTemp();
Refrigerator.decreaseTemp();
Refrigerator.decreaseTemp();
Refrigerator.decreaseTemp();
}
}