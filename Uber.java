class Uber {
static void openApp() {
System.out.println("Open Uber App");
login("Adhi");
}
static void login(String userName) {
System.out.println("Login with username: " + userName);
int rides = viewRides();
System.out.println("Total Rides: " + rides);
}
static int viewRides() {
System.out.println("Viewing Rides");
return 12;
}
}