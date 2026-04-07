class McDonaldsRunner {

    public static void main(String[] args) {

        int price = 0;

        price = McDonalds.checkItem("Burger");
        System.out.println("for one item: " + price);

        int totalPrice = McDonalds.checkItem("Burger", price, 4);
        System.out.println("totalPrice: " + totalPrice);

    }
}