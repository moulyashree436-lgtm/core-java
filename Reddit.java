class Reddit {
static void openApp() {
System.out.println("Open Reddit App");
login("Aarav");
}
static void login(String userName) {
System.out.println("Login with username: " + userName);
int posts = viewPosts();
System.out.println("Total Posts: " + posts);
}
static int viewPosts() {
System.out.println("Viewing Posts");
return 120;
}
}