class KFC {

    public static int getPrice(String name, int size) {

        if (name.equals("Smoky Red Chicken") && size == 1) {
            return 150;

        } else if (name.equals("Smoky Red Chicken") && size == 2) {
            return 300;

        } else if (name.equals("Smoky Red Chicken") && size == 3) {
            return 450;

        } else if (name.equals("Smoky Hot Chicken") && size == 1) {
            return 120;

        } else if (name.equals("Smoky Hot Chicken") && size == 2) {
            return 240;

        } else if (name.equals("Smoky Hot Chicken") && size == 3) {
            return 360;

        } else if (name.equals("Smoky Hot Wings") && size == 1) {
            return 100;

        } else if (name.equals("Smoky Hot Wings") && size == 2) {
            return 200;

        } else if (name.equals("Smoky Hot Wings") && size == 3) {
            return 300;

        } else {
            return 0; // if not found
        }
    }
}