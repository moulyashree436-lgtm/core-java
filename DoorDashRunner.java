class DoorDashRunner {

    public static void main(String[] args) {

        int price = 0;

        price = DoorDash.checkItem("RiceBag");
        System.out.println("for one item: " + price);

        int totalPrice = DoorDash.checkItem("RiceBag", price, 3);
        System.out.println("totalPrice: " + totalPrice);

    }
}