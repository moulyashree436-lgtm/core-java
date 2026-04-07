class Tesla {
static void openApp() {
System.out.println("Open Tesla App");
login("Ananya");
}
static void login(String userName) {
System.out.println("Login with username: " + userName);
int cars = viewCars();
System.out.println("Total Cars: " + cars);
}
static int viewCars() {
System.out.println("Viewing Cars");
return 12;
}
}