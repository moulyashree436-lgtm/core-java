class YouTube {
static void openApp() {
System.out.println("Open YouTube App");
login("Kushal");
}
static void login(String userName) {
System.out.println("Login with username: " + userName);
int likes = viewChannel();
System.out.println("Total Likes: " + likes);
}
static int viewChannel() {
System.out.println("Viewing Channel");
return 1200;
}
}