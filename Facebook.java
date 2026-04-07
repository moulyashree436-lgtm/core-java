class Facebook {
static void openApp() {
System.out.println("Open Facebook App");
login("Moulya");
}
static void login(String userName) {
System.out.println("Login with username: " + userName);
int likes = viewProfile();
System.out.println("Total Likes: " + likes);
}
static int viewProfile() {
System.out.println("Viewing Profile");
return 500;
}
}