class PhonePe {
static void openApp() {
System.out.println("Open PhonePe App");
login("somya");
}
static void login(String userName) {
System.out.println("Login with username: " + userName);
int transactions = viewHistory();
System.out.println("Total Transactions: " + transactions);
}
static int viewHistory() {
System.out.println("Viewing Transaction History");
return 30;
}
}