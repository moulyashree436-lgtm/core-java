class Swiggy {
static void openApp() {
System.out.println("Open Swiggy App");
login("Honu");
}
static void login(String userName) {
System.out.println("Login with username: " + userName);
int orders = viewOrders();
System.out.println("Total Orders: " + orders);
}
static int viewOrders() {
System.out.println("Viewing Orders");
return 10;
}
}