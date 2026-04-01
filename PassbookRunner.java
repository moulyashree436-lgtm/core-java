class PassbookRunner {

    public static void main(String[] args) {

        Passbook p1 = new Passbook();
        p1.accountHolderName = "Rahul Sharma";
        p1.accountNumber = "1234567890";
        p1.bankName = "SBI";
        p1.branch = "BTM Layout";
        p1.balance = 25000.50;
        p1.IFSCcode = "SBIN0001234";
        p1.accountType = "Savings";

        System.out.println("---- PASSBOOK 1 ----");
        System.out.println("Account Holder Name: " + p1.accountHolderName);
        System.out.println("Account Number: " + p1.accountNumber);
        System.out.println("Bank Name: " + p1.bankName);
        System.out.println("Branch: " + p1.branch);
        System.out.println("Balance: " + p1.balance);
        System.out.println("IFSC Code: " + p1.IFSCcode);
        System.out.println("Account Type: " + p1.accountType);


        Passbook p2 = new Passbook();
        p2.accountHolderName = "Priya Reddy";
        p2.accountNumber = "9876543210";
        p2.bankName = "HDFC";
        p2.branch = "Whitefield";
        p2.balance = 50000.00;
        p2.IFSCcode = "HDFC0005678";
        p2.accountType = "Current";

        System.out.println("---- PASSBOOK 2 ----");
        System.out.println("Account Holder Name: " + p2.accountHolderName);
        System.out.println("Account Number: " + p2.accountNumber);
        System.out.println("Bank Name: " + p2.bankName);
        System.out.println("Branch: " + p2.branch);
        System.out.println("Balance: " + p2.balance);
        System.out.println("IFSC Code: " + p2.IFSCcode);
        System.out.println("Account Type: " + p2.accountType);


        Passbook p3 = new Passbook();
        p3.accountHolderName = "Kiran Kumar";
        p3.accountNumber = "1122334455";
        p3.bankName = "ICICI";
        p3.branch = "Davangere";
        p3.balance = 15000.75;
        p3.IFSCcode = "ICIC0009012";
        p3.accountType = "Savings";

        System.out.println("---- PASSBOOK 3 ----");
        System.out.println("Account Holder Name: " + p3.accountHolderName);
        System.out.println("Account Number: " + p3.accountNumber);
        System.out.println("Bank Name: " + p3.bankName);
        System.out.println("Branch: " + p3.branch);
        System.out.println("Balance: " + p3.balance);
        System.out.println("IFSC Code: " + p3.IFSCcode);
        System.out.println("Account Type: " + p3.accountType);


        Passbook p4 = new Passbook();
        p4.accountHolderName = "Sneha Patil";
        p4.accountNumber = "5566778899";
        p4.bankName = "Axis Bank";
        p4.branch = "Mysore";
        p4.balance = 30000.00;
        p4.IFSCcode = "UTIB0003456";
        p4.accountType = "Savings";

        System.out.println("---- PASSBOOK 4 ----");
        System.out.println("Account Holder Name: " + p4.accountHolderName);
        System.out.println("Account Number: " + p4.accountNumber);
        System.out.println("Bank Name: " + p4.bankName);
        System.out.println("Branch: " + p4.branch);
        System.out.println("Balance: " + p4.balance);
        System.out.println("IFSC Code: " + p4.IFSCcode);
        System.out.println("Account Type: " + p4.accountType);

    }
}