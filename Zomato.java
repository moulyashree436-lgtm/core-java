class Zomato {
static void openApp() {
System.out.println("Open Zomato App");
login("Spoorthi");
}
static void login(String userName) {
System.out.println("Login with username: " + userName);
int orders = viewOrders();
System.out.println("Total Orders: " + orders);
}
static int viewOrders() {
System.out.println("Viewing Food Orders");
return 7;
}
}