class CollegeStudentProfile {
    public static void main(String[] args) {
        
        char grade;
        int rollNumber;
        String studentName;
        double examFees;
        boolean isHosteller;

        grade = 'A';
        rollNumber = 401;
        studentName = "Manoj";
        examFees = 18000.75;
        isHosteller = true;

        System.out.println("Grade: " + grade);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Student Name: " + studentName);
        System.out.println("Exam Fees: " + examFees);
        System.out.println("Hosteller: " + isHosteller);

        grade = 'B';
        rollNumber = 402;
        studentName = "Pooja";
        examFees = 20000.50;
        isHosteller = false;

        System.out.println("---- After Changing Values ----");

        System.out.println("Grade: " + grade);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Student Name: " + studentName);
        System.out.println("Exam Fees: " + examFees);
        System.out.println("Hosteller: " + isHosteller);
    }
}