package savarjisho1;

public class Main {
    public static void main(String[] args) {
        Adamiani adamiani1 = new Adamiani("Giorgi", "Beridze", 30);
        System.out.println("Adamiani: " + adamiani1.getSaxeli() + " " + adamiani1.getGvari() + ", asaki: " + adamiani1.getAsaki());

        Tanamsromeli tanamsromeli1 = new Tanamsromeli("Nino", "Gelashvili", 25, "EMP001");
        System.out.println("Tanamsromeli: " + tanamsromeli1.getSaxeli() + " " + tanamsromeli1.getGvari() + ", ID: " + tanamsromeli1.getTanamsromeliID());

        Menejeri menejeri1 = new Menejeri("Lasha", "Maisuradze", 35, "EMP002", "MNG001");
        System.out.println("Menejeri: " + menejeri1.getSaxeli() + " " + menejeri1.getGvari() + ", Menejeri ID: " + menejeri1.getMenejeriID());
    }
}