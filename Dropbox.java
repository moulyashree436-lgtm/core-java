class Dropbox {
static void openApp() {
System.out.println("Open Dropbox App");
login("Snehal");
}
static void login(String userName) {
System.out.println("Login with username: " + userName);
int files = viewFiles();
System.out.println("Total Files: " + files);
}
static int viewFiles() {
System.out.println("Viewing Files");
return 55;
}
}