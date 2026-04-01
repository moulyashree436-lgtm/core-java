class FilmEntry {

    static String checkEntry(String personName, int personAge) {

        String result = "Person is allowed to watch the movie";
        System.out.println("Checking age");

        if(personAge >= 18) {
            System.out.println("Allowed: " + personName);
            System.out.println("Age: " + personAge);
            return result;
        } 
        else {
            System.out.println("Not allowed: " + personName);
            System.out.println("Age is below 18: " + personAge);
        }

        return "Person is not allowed to watch the movie";
    }
}