class Meesho {
static void openApp() {
System.out.println("Open Meesho App");
login("Mala");
}
static void login(String userName) {
System.out.println("Login with username: " + userName);
int products = viewProducts();
System.out.println("Total Products: " + products);
}
static int viewProducts() {
System.out.println("Viewing Products");
return 20;
}
}