class Netflix {
String movieName;
String genre;
int duration;
public Netflix() {
}
public Netflix(String movieName, String genre, int duration) {
this.movieName = movieName;
this.genre = genre;
this.duration = duration;
}
public void display() {
System.out.println(movieName);
System.out.println(genre);
System.out.println(duration);
System.out.println("-------------------");
}
}

