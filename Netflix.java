class Netflix {
static void openApp() {
System.out.println("Open Netflix App");
login("Deepu");
}
static void login(String userName) {
System.out.println("Login with username: " + userName);
int movies = viewLibrary();
System.out.println("Total Movies: " + movies);
}
static int viewLibrary() {
System.out.println("Viewing Library");
return 75;
}
}

