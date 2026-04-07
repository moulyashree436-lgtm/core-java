class Notion {
static void openApp() {
System.out.println("Open Notion App");
login("Siddharth");
}
static void login(String userName) {
System.out.println("Login with username: " + userName);
int pages = viewPages();
System.out.println("Total Pages: " + pages);
}
static int viewPages() {
System.out.println("Viewing Pages");
return 35;
}
}