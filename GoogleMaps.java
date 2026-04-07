class GoogleMaps {
static void openApp() {
System.out.println("Open Google Maps App");
login("Sneha");
}
static void login(String userName) {
System.out.println("Login with username: " + userName);
int locations = viewSavedPlaces();
System.out.println("Total Saved Places: " + locations);
}
static int viewSavedPlaces() {
System.out.println("Viewing Saved Places");
return 18;
}
}