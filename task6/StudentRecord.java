class StudentRecord {
    public static void main(String[] args) {
        char section;
        int rollNumber;
        String studentName;
        double marks;
        boolean isPassed;
		
        section = 'A';
        rollNumber = 101;
        studentName = "Rahul";
        marks = 85.75;
        isPassed = true;

        System.out.println("Section: " + section);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Student Name: " + studentName);
        System.out.println("Marks: " + marks);
        System.out.println("Passed: " + isPassed);

        section = 'B';
        rollNumber = 102;
        studentName = "Ananya";
        marks = 72.40;
        isPassed = false;

        System.out.println("---- After Changing Values ----");

        System.out.println("Section: " + section);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Student Name: " + studentName);
        System.out.println("Marks: " + marks);
        System.out.println("Passed: " + isPassed);
    }
}