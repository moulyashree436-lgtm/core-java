class HeaterRunner {
public static void main(String[] args) {
Heater.checkHeaterIsOnOrOff();
Heater.turnOnHeater();
Heater.checkHeaterIsOnOrOff();
int currentTemp = Heater.getCurrentTemp();
System.out.println("Current Temperature is : " + currentTemp);
}
}