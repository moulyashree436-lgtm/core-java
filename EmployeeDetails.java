class EmployeeDetails {
    public static void main(String[] args) {
       
        char department;
        int employeeId;
        String employeeName;
        double salary;
        boolean isPermanent;

        department = 'H';
        employeeId = 601;
        employeeName = "Arun";
        salary = 45000.80;
        isPermanent = true;

        System.out.println("Department: " + department);
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Salary: " + salary);
        System.out.println("Permanent: " + isPermanent);

        department = 'F';
        employeeId = 602;
        employeeName = "Meena";
        salary = 38000.50;
        isPermanent = false;

        System.out.println("---- After Changing Values ----");

        System.out.println("Department: " + department);
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Salary: " + salary);
        System.out.println("Permanent: " + isPermanent);
    }
}