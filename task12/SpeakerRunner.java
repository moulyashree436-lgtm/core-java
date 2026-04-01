class SpeakerRunner {
public static void main(String[] args) {
Speaker.checkSpeakerIsOnOrOff();
Speaker.turnOnSpeaker();
Speaker.checkSpeakerIsOnOrOff();
int currentVolume = Speaker.getCurrentVolume();
System.out.println("Current Volume is : " + currentVolume);
}
}