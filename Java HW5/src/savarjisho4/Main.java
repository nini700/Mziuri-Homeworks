package savarjisho4;

public class Main {
    public static void main(String[] args) {
        // Tanamsromlebis shekmneba
        WignebisGamcemi gamcemi = new WignebisGamcemi("Luka", "Gegeshidze", "T001", 9, 18);
        WignebisDamlagebeli damlagebeli = new WignebisDamlagebeli("Nino", "Gviniashvili", "T002");
        SichumisKontroliori kontroliori = new SichumisKontroliori("Deiv", "Kingi", "T003", 8.5);
        WignebisMrcheveli mrcheveli = new WignebisMrcheveli("Madlena", "Chxaidze", "T004", 9.2);

        BibliotekisTanamsromeli[] tanamsromlebi = new BibliotekisTanamsromeli[4];
        tanamsromlebi[0] = gamcemi;
        tanamsromlebi[1] = damlagebeli;
        tanamsromlebi[2] = kontroliori;
        tanamsromlebi[3] = mrcheveli;

        // Wignebis shekmneba
        SatavgadasavloWigni wigni1 = new SatavgadasavloWigni("Pirate Island", 320, "Robert Stevenson", true);
        SamecnieroWigni wigni2 = new SamecnieroWigni("Cosmos", 450, "Carl Sagan", true, "Astronomia");
        PentezisWigni wigni3 = new PentezisWigni("Nordic Gods", 280, "Neil Gaiman", false, "Skandinavia");
        SatavgadasavloWigni wigni4 = new SatavgadasavloWigni("Treasure Hunt", 250, "Jules Verne", true);
        SamecnieroWigni wigni5 = new SamecnieroWigni("Physics Explained", 520, "Richard Feynman", true, "Fizika");

        Wigni[] wignebi = new Wigni[5];
        wignebi[0] = wigni1;
        wignebi[1] = wigni2;
        wignebi[2] = wigni3;
        wignebi[3] = wigni4;
        wignebi[4] = wigni5;
        Biblioteka biblioteka = new Biblioteka("Centrali Biblioteka", tanamsromlebi, wignebi);
        mrcheveli.setBiblioteka(biblioteka);
        System.out.println(biblioteka);
        System.out.println("\nTanamsromlebi:");
        for (BibliotekisTanamsromeli t : tanamsromlebi) {
            System.out.println(t);
        }

        System.out.println("\nWignebi:");
        for (Wigni w : wignebi) {
            System.out.println(w);
        }

        System.out.println("\n--- Mrchevelis Rekomendascia ---");
        Wigni archevaniWigni = mrcheveli.mirchieWigni();
        if (archevaniWigni != null) {
            System.out.println("Mrcheveli " + mrcheveli.getSaxeli() + " girkchevt: ");
            System.out.println(archevaniWigni);
            archevaniWigni.wakitxva();
        }
    }
}