class SchoolStudentProfile {
    public static void main(String[] args) {

        char section;
        int studentId;
        String studentName;
        double feesAmount;
        boolean isRegular;

        section = 'A';
        studentId = 101;
        studentName = "Kiran";
        feesAmount = 25000.00;
        isRegular = true;

        System.out.println("Section: " + section);
        System.out.println("Student ID: " + studentId);
        System.out.println("Student Name: " + studentName);
        System.out.println("Fees Amount: " + feesAmount);
        System.out.println("Regular: " + isRegular);

        section = 'B';
        studentId = 102;
        studentName = "Divya";
        feesAmount = 30000.50;
        isRegular = false;

        System.out.println("---- After Changing Values ----");

        System.out.println("Section: " + section);
        System.out.println("Student ID: " + studentId);
        System.out.println("Student Name: " + studentName);
        System.out.println("Fees Amount: " + feesAmount);
        System.out.println("Regular: " + isRegular);
    }
}