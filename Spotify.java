class Spotify {
String songName;
String artistName;
int duration; 
public Spotify() {
}
public Spotify(String songName, String artistName, int duration) {
this.songName = songName;
this.artistName = artistName;
this.duration = duration;
}
public void display() {
System.out.println(songName);
System.out.println(artistName);
System.out.println(duration);
System.out.println("-------------------");
}
}

