class DrivingLicenseRunner {

    public static void main(String[] args) {

        DrivingLicense d1 = new DrivingLicense();
        d1.name = "Rahul Sharma";
        d1.licenseNumber = "DL12345678";
        d1.vehicleType = "MCWG";
        d1.dob = "12/05/1998";
        d1.issueDate = "01/01/2020";
        d1.expiryDate = "01/01/2030";
        d1.address = "Bangalore";

        System.out.println("---- DRIVING LICENSE 1 ----");
        System.out.println("Name: " + d1.name);
        System.out.println("License No: " + d1.licenseNumber);
        System.out.println("Vehicle Type: " + d1.vehicleType);
        System.out.println("DOB: " + d1.dob);
        System.out.println("Issue Date: " + d1.issueDate);
        System.out.println("Expiry Date: " + d1.expiryDate);
        System.out.println("Address: " + d1.address);


        DrivingLicense d2 = new DrivingLicense();
        d2.name = "Priya Reddy";
        d2.licenseNumber = "DL87654321";
        d2.vehicleType = "LMV";
        d2.dob = "23/09/2000";
        d2.issueDate = "15/03/2021";
        d2.expiryDate = "15/03/2031";
        d2.address = "Hyderabad";

        System.out.println("---- DRIVING LICENSE 2 ----");
        System.out.println("Name: " + d2.name);
        System.out.println("License No: " + d2.licenseNumber);
        System.out.println("Vehicle Type: " + d2.vehicleType);
        System.out.println("DOB: " + d2.dob);
        System.out.println("Issue Date: " + d2.issueDate);
        System.out.println("Expiry Date: " + d2.expiryDate);
        System.out.println("Address: " + d2.address);


        DrivingLicense d3 = new DrivingLicense();
        d3.name = "Kiran Kumar";
        d3.licenseNumber = "DL11223344";
        d3.vehicleType = "HMV";
        d3.dob = "10/01/1997";
        d3.issueDate = "10/06/2019";
        d3.expiryDate = "10/06/2029";
        d3.address = "Mysore";

        System.out.println("---- DRIVING LICENSE 3 ----");
        System.out.println("Name: " + d3.name);
        System.out.println("License No: " + d3.licenseNumber);
        System.out.println("Vehicle Type: " + d3.vehicleType);
        System.out.println("DOB: " + d3.dob);
        System.out.println("Issue Date: " + d3.issueDate);
        System.out.println("Expiry Date: " + d3.expiryDate);
        System.out.println("Address: " + d3.address);


        DrivingLicense d4 = new DrivingLicense();
        d4.name = "Sneha Patil";
        d4.licenseNumber = "DL55667788";
        d4.vehicleType = "LMV";
        d4.dob = "15/08/1999";
        d4.issueDate = "20/07/2022";
        d4.expiryDate = "20/07/2032";
        d4.address = "Pune";

        System.out.println("---- DRIVING LICENSE 4 ----");
        System.out.println("Name: " + d4.name);
        System.out.println("License No: " + d4.licenseNumber);
        System.out.println("Vehicle Type: " + d4.vehicleType);
        System.out.println("DOB: " + d4.dob);
        System.out.println("Issue Date: " + d4.issueDate);
        System.out.println("Expiry Date: " + d4.expiryDate);
        System.out.println("Address: " + d4.address);

    }
}