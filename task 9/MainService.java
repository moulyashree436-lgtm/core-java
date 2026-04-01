class MainService {

    public static void main(String[] args) {

        // FilmPermission
        String result1 = FilmPermission.checkPermission("Rahul",20);
        System.out.println(result1);

        // MovieCheck
        String result2 = MovieCheck.checkMovie("Anu",17);
        System.out.println(result2);

        // FilmEntry
        String result3 = FilmEntry.checkEntry("Kiran",19);
        System.out.println(result3);

        // MovieAccess
        String result4 = FilmEntry.MovieAccess.checkAccess("Deepu",16);
        System.out.println(result4);

        // CinemaTicket
        String result5 = CinemaTicket.checkTicket("Ravi",22);
        System.out.println(result5);

    }

}