class GitDirectRunner {

    public static void main(String[] args) {

        int price = 0;

        price = GitDirect.checkItem("Laptop");
        System.out.println("for one item: " + price);

        int totalPrice = GitDirect.checkItem("Laptop", price, 5);
        System.out.println("totalPrice: " + totalPrice);

    }
}