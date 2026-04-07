class GooglePay {
static void openApp() {
System.out.println("Open GooglePay App");
login("Priya");
}
static void login(String userName) {
System.out.println("Login with username: " + userName);
int transactions = viewTransactions();
System.out.println("Total Transactions: " + transactions);
}
static int viewTransactions() {
System.out.println("Viewing Transactions");
return 25;
}
}