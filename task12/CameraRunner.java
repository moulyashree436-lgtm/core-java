class CameraRunner {
public static void main(String[] args){
Camera.checkCameraIsOnOrOff();
Camera.turnOnCamera();
Camera.checkCameraIsOnOrOff();
int currentTemp = Camera.getCurrentTemp();
System.out.println("Current Temp is : " + currentTemp);
System.out.println("INCREASE TEMP");
Camera.increaseTemp();
Camera.increaseTemp();
Camera.increaseTemp();
Camera.increaseTemp();
Camera.increaseTemp();
System.out.println("DECREASE TEMP");
Camera.decreaseTemp();
Camaera.decreaseTemp();
Camera.decreaseTemp();
Camera.decreaseTemp();
Camera.decreaseTemp();
Camera.decreaseTemp();
Camera.decreaseTemp();
}
}