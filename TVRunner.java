class TVRunner {
public static void main(String[] args) {
TV.checkTVIsOnOrOff();
TV.turnOnTV();
TV.checkTVIsOnOrOff();
int currentVolume = TV.getCurrentVolume();
System.out.println("Current Volume is : " + currentVolume);
System.out.println("INCREASE VOLUM");
TV.increaseVolum();
TV.increaseVolum();
TV.increaseVolum();
TV.increaseVolum();
TV.increaseVolum();
System.out.println("DECREASE VOLUM");
TV.decreaseVolum();
TV.decreaseVolum();
TV.decreaseVolum();
TV.decreaseVolum();
TV.decreaseVolum();
TV.decreaseVolum();
TV.decreaseVolum();
}
}