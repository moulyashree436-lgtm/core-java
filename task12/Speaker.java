class Speaker {
static boolean isSpeakerOnOrOffButton = false;
static int maxVolume = 50;
static int minVolume = 0;
static int currentVolume;
static void checkSpeakerIsOnOrOff() {
if (isSpeakerOnOrOffButton == false) {
System.out.println("Checking : SPEAKER IS OFF");
} else {
System.out.println("Checking : SPEAKER IS ON");
}
}
static void turnOnSpeaker() {
System.out.println("Turning ON the SPEAKER");
isSpeakerOnOrOffButton = true;
}
static int getCurrentVolume() {
return currentVolume;
}
}
