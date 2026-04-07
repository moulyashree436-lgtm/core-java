class Spotify {
static void openApp() {
System.out.println("Open Spotify App");
login("Rahul");
}
static void login(String userName) {
System.out.println("Login with username: " + userName);
int songs = viewPlaylist();
System.out.println("Total Songs: " + songs);
}
static int viewPlaylist() {
System.out.println("Viewing Playlist");
return 150;
}
}