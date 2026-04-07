class LinkedIn {
static void openApp() {
System.out.println("Open LinkedIn App");
login("Anjali");
}
static void login(String userName) {
System.out.println("Login with username: " + userName);
int connections = viewConnections();
System.out.println("Total Connections: " + connections);
}
static int viewConnections() {
System.out.println("Viewing Connections");
return 350;
}
}