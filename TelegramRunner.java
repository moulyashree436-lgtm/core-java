class TelegramRunner {
    public static void main(String[] args) {

        Telegram t1 = new Telegram("Raki", 901, true, 15, 1.2);
        t1.show();

        Telegram t2 = new Telegram("Ammu", 902, false, 20, 2.5);
        t2.show();

        Telegram t3 = new Telegram("Kushi", 903, true, 10, 0.8);
        t3.show();

        Telegram t4 = new Telegram("Deepu", 904, true, 25, 3.0);
        t4.show();

        Telegram t5 = new Telegram("moulya", 905, false, 12, 1.0);
        t5.show();

        Telegram t6 = new Telegram("Moni", 906, true, 18, 2.2);
        t6.show();

        Telegram t7 = new Telegram("Vara", 907, false, 14, 1.5);
        t7.show();
    }
}