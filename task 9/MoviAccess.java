class MovieAccess {

    static String checkAccess(String personName, int personAge) {

        String message = "Person can watch the movie";
        System.out.println("Checking age for movie access");

        if(personAge >= 18) {
            System.out.println("Access granted for: " + personName);
            System.out.println("Age: " + personAge);
            return message;
        } 
        else {
            System.out.println("Access denied for: " + personName);
            System.out.println("Age is below 18: " + personAge);
        }

        return "Person cannot watch the movie";
    }
}