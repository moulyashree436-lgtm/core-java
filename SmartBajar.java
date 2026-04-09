class SmartBajar {
    public static void main(String[] args) {

        String[] snacks = new String[10];
        snacks[0] = "chips";
        snacks[2] = "biscuits";
        snacks[4] = "popcorn";
        snacks[6] = "chocolate";
        snacks[8] = "nachos";

        for (String sec : snacks) {
            System.out.println("snacks section items ");
            System.out.println(sec);
        }

        for (int i = 0; i < snacks.length; i++) {
            System.out.println("snacks item index :" + i);
            System.out.println(snacks[i]);
        }
		
        String[] stationery = new String[10];
        stationery[1] = "pen";
        stationery[3] = "pencil";
        stationery[5] = "notebook";
        stationery[7] = "eraser";
        stationery[9] = "sharpener";

        for (String sec : stationery) {
            System.out.println("stationery section items ");
            System.out.println(sec);
        }

        for (int j = 0; j < stationery.length; j++) {
            System.out.println("stationery item index :" + j);
            System.out.println(stationery[j]);
        }
		
        String[] clothing = new String[8];
        clothing[0] = "shirt";
        clothing[2] = "jeans";
        clothing[4] = "jacket";
        clothing[6] = "tshirt";

        for (String sec : clothing) {
            System.out.println("clothing section items ");
            System.out.println(sec);
        }

        for (int k = 0; k < clothing.length; k++) {
            System.out.println("clothing item index :" + k);
            System.out.println(clothing[k]);
        }

        String[] kitchen = new String[10];
        kitchen[1] = "plate";
        kitchen[3] = "spoon";
        kitchen[5] = "knife";
        kitchen[7] = "pan";
        kitchen[9] = "bottle";

        for (String sec : kitchen) {
            System.out.println("kitchen section items ");
            System.out.println(sec);
        }

        for (int m = 0; m < kitchen.length; m++) {
            System.out.println("kitchen item index :" + m);
            System.out.println(kitchen[m]);
        }

        String[] sports = new String[9];
        sports[0] = "cricket bat";
        sports[2] = "football";
        sports[4] = "tennis racket";
        sports[6] = "basketball";
        sports[8] = "badminton shuttle";

        for (String sec : sports) {
            System.out.println("sports section items ");
            System.out.println(sec);
        }

        for (int n = 0; n < sports.length; n++) {
            System.out.println("sports item index :" + n);
            System.out.println(sports[n]);
        }
    }
}