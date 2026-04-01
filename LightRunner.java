class LightRunner {
public static void main(String[] args) {
Light.checkLightIsOnOrOff();
Light.turnOnLight();
Light.checkLightIsOnOrOff();
int currentBrightness = Light.getCurrentBrightness();
System.out.println("Current Brightness is : " + currentBrightness);
}
}