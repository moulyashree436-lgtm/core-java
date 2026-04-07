class Telegram {
static void openApp() {
System.out.println("Open Telegram App");
login("Arjun");
}
static void login(String userName) {
System.out.println("Login with username: " + userName);
int groups = viewGroups();
System.out.println("Total Groups: " + groups);
}
static int viewGroups() {
System.out.println("Viewing Groups");
return 85;
}
}