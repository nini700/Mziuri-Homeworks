package savarjisho1;

public class Main {
    public static void main(String[] args) {
        Music music1 = new Music("ჩემი ქალაქი", 3.5, "პოპ");
        Music music2 = new Music("მთვარე", 4.2, "როკ");
        Music music3 = new Music("ზღვა", 3.8, "ჯაზი");
        Music music4 = new Music("მთები", 5.1, "როკ");
        Music music5 = new Music("ვარსკვლავები", 3.3, "პოპ");
        Music music6 = new Music("სიზმარი", 4.7, "ელექტრონული");

        Album album1 = new Album("პირველი ალბომი", 2020);
        Album album2 = new Album("ახალი დასაწყისი", 2022);
        Album album3 = new Album("საუკეთესო ჰიტები", 2023);

        album1.addMusic(music1);
        album1.addMusic(music2);

        album2.addMusic(music3);
        album2.addMusic(music4);

        album3.addMusic(music5);
        album3.addMusic(music6);

        Artist artist1 = new Artist("გიორგი");
        Artist artist2 = new Artist("ნინო");

        artist1.addAlbum(album1);
        artist1.addAlbum(album2);

        artist2.addAlbum(album3);

        MusicLibrary library = new MusicLibrary();

        library.addArtist(artist1);
        library.addArtist(artist2);

        library.addAlbum(album1);
        library.addAlbum(album2);
        library.addAlbum(album3);

        System.out.println("\n" + "=".repeat(50));

        library.displayAllInfo();

        System.out.println("\n" + "=".repeat(50));
        System.out.println("სიმღერის ძებნა:");
        System.out.println("=".repeat(50));

        Music foundMusic = library.searchMusic("მთვარე");
        if (foundMusic != null) {
            foundMusic.displayInfo();
        }

        System.out.println("\n" + "=".repeat(50));
        System.out.println("შემთხვევითი სიმღერა:");
        System.out.println("=".repeat(50));

        Music randomMusic = library.giveRandomMusic();
        if (randomMusic != null) {
            randomMusic.displayInfo();
        }

        System.out.println("\n" + "=".repeat(50));
        System.out.println("მუსიკის დაკვრა:");
        System.out.println("=".repeat(50));

        music1.play();
        music1.displayInfo();
        music1.stop();

        System.out.println();

        music4.play();
        music4.displayInfo();
        music4.stop();

        System.out.println("\n" + "=".repeat(50));
        System.out.println("ალბომის დეტალური ინფო:");
        System.out.println("=".repeat(50));

        album1.displayInfo();

        System.out.println("\n" + "=".repeat(50));
        System.out.println("არტისტის დეტალური ინფო:");
        System.out.println("=".repeat(50));

        artist1.displayInfo();

        System.out.println("\n" + "=".repeat(50));
        System.out.println("მუსიკის წაშლა ალბომიდან:");
        System.out.println("=".repeat(50));

        album1.removeMusic(music2);
        album1.displayInfo();

        System.out.println("\n" + "=".repeat(50));
        System.out.println("ბიბლიოთეკის სტატისტიკა:");
        System.out.println("=".repeat(50));

        System.out.println("სულ არტისტები: " + library.getArtists().size());
        System.out.println("სულ ალბომები: " + library.getAlbums().size());
        System.out.println("სულ სიმღერები: " + library.getSongs().size());
    }
}