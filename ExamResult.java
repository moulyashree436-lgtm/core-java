class ExamResult {
    public static void main(String[] args) {
        
        char grade;
        int studentId;
        String studentName;
        double percentage;
        boolean isPass;

        grade = 'A';
        studentId = 901;
        studentName = "Karthik";
        percentage = 88.75;
        isPass = true;

        System.out.println("Grade: " + grade);
        System.out.println("Student ID: " + studentId);
        System.out.println("Student Name: " + studentName);
        System.out.println("Percentage: " + percentage);
        System.out.println("Pass: " + isPass);

        grade = 'C';
        studentId = 902;
        studentName = "Nisha";
        percentage = 45.50;
        isPass = false;

        System.out.println("---- After Changing Values ----");

        System.out.println("Grade: " + grade);
        System.out.println("Student ID: " + studentId);
        System.out.println("Student Name: " + studentName);
        System.out.println("Percentage: " + percentage);
        System.out.println("Pass: " + isPass);
    }
}