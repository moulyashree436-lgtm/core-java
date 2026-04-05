class FlipkartRunner {
    public static void main(String[] args) {
        FlipkartOrder f1 = new FlipkartOrder();
        FlipkartOrder f2 = new FlipkartOrder("T-Shirt");
        FlipkartOrder f3 = new FlipkartOrder("Watch", 1002);
        FlipkartOrder f4 = new FlipkartOrder("Bag", 1003, true);
        FlipkartOrder f5 = new FlipkartOrder("Laptop", 1004, false, 2);

    }
}