class Figma {
static void openApp() {
System.out.println("Open Figma App");
login("Aisha");
}
static void login(String userName) {
System.out.println("Login with username: " + userName);
int designs = viewDesigns();
System.out.println("Total Designs: " + designs);
}
static int viewDesigns() {
System.out.println("Viewing Designs");
return 28;
}
}