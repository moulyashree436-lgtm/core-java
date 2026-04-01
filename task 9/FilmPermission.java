class FilmPermission {

    static String checkPermission(String name, int age) {

        String message = "Person is allowed to watch the movie";
        System.out.println("Checking age");

        if(age >= 18) {
            System.out.println("Allowed: " + name);
            System.out.println("Age: " + age);
            return message;
        } 
        else {
            System.out.println("Not allowed: " + name);
            System.out.println("Age is less than 18: " + age);
        }

        return "Person is not allowed to watch the movie";
    }
}