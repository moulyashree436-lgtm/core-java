class Pinterest {
static void openApp() {
System.out.println("Open Pinterest App");
login("Neha");
}
static void login(String userName) {
System.out.println("Login with username: " + userName);
int pins = viewPins();
System.out.println("Total Pins: " + pins);
}
static int viewPins() {
System.out.println("Viewing Pins");
return 75;
}
}