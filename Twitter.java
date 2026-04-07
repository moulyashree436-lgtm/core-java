class Twitter {
static void openApp() {
System.out.println("Open Twitter App");
login("Bindhu");
}
static void login(String userName) {
System.out.println("Login with username: " + userName);
int tweets = viewProfile();
System.out.println("Total Tweets: " + tweets);
}
static int viewProfile() {
System.out.println("Viewing Profile");
return 320;
}
}