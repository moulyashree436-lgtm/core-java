class DominosRunner {

    public static void main(String[] args) {

        int price = 0;

        price = Dominos.checkItem("Margherita");
        System.out.println("for one plate:" + price);

        int totalPrice = Dominos.checkItem("Margherita", price, 5);
        System.out.println("toatlPrice:" + totalPrice);

    }
}