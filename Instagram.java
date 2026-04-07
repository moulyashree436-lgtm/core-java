class Instagram {
static void openApp() {
System.out.println("Open Instagram App");
login("Rakshitha");
}
static void login(String userName) {
System.out.println("Login with username: " + userName);
int Comments = viewProfile();
System.out.println("Total Comments: " + Comments);
}
static int viewProfile() {
System.out.println("Viewing Profile");
return 800;
}
}