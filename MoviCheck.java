class MovieCheck {

    static String checkMovie(String name, int age) {

        String result = "Person can watch the movie";
        System.out.println("Checking the age");

        if(age >= 18) {
            System.out.println("Allowed to watch movie: " + name);
            System.out.println("Age: " + age);
            return result;
        } 
        else {
            System.out.println("Not allowed to watch movie: " + name);
            System.out.println("Age is less than 18: " + age);
        }

        return "Person cannot watch the movie";
    }
}