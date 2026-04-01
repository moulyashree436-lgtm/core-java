public ststic void main(String[] args){
Fan.checkFanIsOnOrOff();
Fan.turnOnFan();
Fan.checkFanIsOnOrOff();
int volume = Fan.getCurrentVolume();
System.out.println("Current Volume is: " + volume);
Fan.invFanVolume();
int volumes = Fan.getCurrentVolume();
System.out.println("Current Volume is: " + Volumes);
}

