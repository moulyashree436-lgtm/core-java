class GooglePay {
String userName;
String transactionId;
int amount;
public GooglePay() {
}
public GooglePay(String userName, String transactionId, int amount) {
this.userName = userName;
this.transactionId = transactionId;
this.amount = amount;
}
public void display() {
System.out.println(userName);
System.out.println(transactionId);
System.out.println(amount);
System.out.println("-------------------");
}
}

