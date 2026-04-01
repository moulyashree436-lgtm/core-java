class LibraryBookProfile {
    public static void main(String[] args) {
        
        char section;
        int bookId;
        String bookTitle;
        double price;
        boolean isAvailable;

        section = 'L';
        bookId = 801;
        bookTitle = "Java Programming";
        price = 550.75;
        isAvailable = true;

        System.out.println("Section: " + section);
        System.out.println("Book ID: " + bookId);
        System.out.println("Book Title: " + bookTitle);
        System.out.println("Price: " + price);
        System.out.println("Available: " + isAvailable);

        section = 'M';
        bookId = 802;
        bookTitle = "Data Structures";
        price = 620.50;
        isAvailable = false;

        System.out.println("---- After Changing Values ----");

        System.out.println("Section: " + section);
        System.out.println("Book ID: " + bookId);
        System.out.println("Book Title: " + bookTitle);
        System.out.println("Price: " + price);
        System.out.println("Available: " + isAvailable);
    }
}