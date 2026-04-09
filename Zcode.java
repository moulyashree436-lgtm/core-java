class Zcode {
    public static void main(String[] args) {

        String[] books = new String[10];
        books[0] = "java book";
        books[2] = "python book";
        books[4] = "c book";
        books[6] = "data science book";
        books[8] = "ai book";

        for (String sec : books) {
            System.out.println("books section items ");
            System.out.println(sec);
        }

        for (int i = 0; i < books.length; i++) {
            System.out.println("books item index :" + i);
            System.out.println(books[i]);
        }

        String[] vehicles = new String[10];
        vehicles[1] = "car";
        vehicles[3] = "bike";
        vehicles[5] = "scooter";
        vehicles[7] = "bus";
        vehicles[9] = "truck";

        for (String sec : vehicles) {
            System.out.println("vehicles section items ");
            System.out.println(sec);
        }

        for (int j = 0; j < vehicles.length; j++) {
            System.out.println("vehicles item index :" + j);
            System.out.println(vehicles[j]);
        }

        String[] gym = new String[8];
        gym[0] = "dumbbell";
        gym[2] = "treadmill";
        gym[4] = "yoga mat";
        gym[6] = "skipping rope";

        for (String sec : gym) {
            System.out.println("gym section items ");
            System.out.println(sec);
        }

        for (int k = 0; k < gym.length; k++) {
            System.out.println("gym item index :" + k);
            System.out.println(gym[k]);
        }

        String[] tools = new String[10];
        tools[1] = "hammer";
        tools[3] = "screwdriver";
        tools[5] = "wrench";
        tools[7] = "plier";
        tools[9] = "drill machine";

        for (String sec : tools) {
            System.out.println("tools section items ");
            System.out.println(sec);
        }

        for (int m = 0; m < tools.length; m++) {
            System.out.println("tools item index :" + m);
            System.out.println(tools[m]);
        }

        String[] pets = new String[9];
        pets[0] = "dog food";
        pets[2] = "cat toy";
        pets[4] = "pet shampoo";
        pets[6] = "leash";
        pets[8] = "pet bed";

        for (String sec : pets) {
            System.out.println("pet section items ");
            System.out.println(sec);
        }

        for (int n = 0; n < pets.length; n++) {
            System.out.println("pet item index :" + n);
            System.out.println(pets[n]);
        }
    }
}