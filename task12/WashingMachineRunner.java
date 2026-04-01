class WashingMachineRunner {
public static void main(String[] args) {
WashingMachine.checkMachineIsOnOrOff();
WashingMachine.turnOnMachine();
WashingMachine.checkMachineIsOnOrOff();
int currentSpeed = WashingMachine.getCurrentSpeed();
System.out.println("Current Speed is : " + currentSpeed);
}
}