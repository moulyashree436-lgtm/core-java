class CinemaTicket {

    static String checkTicket(String name, int age) {

        String output = "Yes this person can watch the movie";
        System.out.println("Checking the age");

        if(age >= 18) {
            System.out.println("Yes this person CAN watch the movie. Name: " + name);
            System.out.println("Age: " + age);
            return output;
        } else {
            System.out.println("No this person CANNOT watch the movie. Name: " + name);
            System.out.println("Age is less than 18: " + age);
        }

        return "This person cannot watch the movie";
    }
}