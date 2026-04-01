class ElectricBill {
    public static void main(String[] args) {
        
        char billType;
        int billNumber;
        String customerName;
        double amount;
        boolean isPaid;

        billType = 'D';
        billNumber = 1301;
        customerName = "Ravi";
        amount = 2450.75;
        isPaid = true;

        System.out.println("Bill Type: " + billType);
        System.out.println("Bill Number: " + billNumber);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Amount: " + amount);
        System.out.println("Paid: " + isPaid);

        billType = 'C';
        billNumber = 1302;
        customerName = "Meera";
        amount = 3200.50;
        isPaid = false;

        System.out.println("---- After Changing Values ----");

        System.out.println("Bill Type: " + billType);
        System.out.println("Bill Number: " + billNumber);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Amount: " + amount);
        System.out.println("Paid: " + isPaid);
    }
}