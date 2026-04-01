class HospitalPatientProfile {
    public static void main(String[] args) {
        
        char ward;
        int patientId;
        String patientName;
        double billAmount;
        boolean isAdmitted;

        ward = 'C';
        patientId = 301;
        patientName = "Ravi";
        billAmount = 15000.50;
        isAdmitted = true;

        System.out.println("Ward: " + ward);
        System.out.println("Patient ID: " + patientId);
        System.out.println("Patient Name: " + patientName);
        System.out.println("Bill Amount: " + billAmount);
        System.out.println("Admitted: " + isAdmitted);
      
        ward = 'D';
        patientId = 302;
        patientName = "Sneha";
        billAmount = 22000.75;
        isAdmitted = false;
        
        System.out.println("---- After Changing Values ----");

        System.out.println("Ward: " + ward);
        System.out.println("Patient ID: " + patientId);
        System.out.println("Patient Name: " + patientName);
        System.out.println("Bill Amount: " + billAmount);
        System.out.println("Admitted: " + isAdmitted);
    }
}