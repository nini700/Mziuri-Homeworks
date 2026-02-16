import java.util.Scanner;

public class Main {
    private static PhoneContact[] contacts = new PhoneContact[30];
    private static int contactCount = 0;
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        loadContacts();
        boolean running = true;
        while (running) {
            showMenu();
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    addContact();
                    break;
                case 2:
                    viewContacts();
                    break;
                case 3:
                    editContact();
                    break;
                case 4:
                    deleteContact();
                    break;
                case 5:
                    running = false;
                    System.out.println("programa dasrulda!");
                    break;
                default:
                    System.out.println("araswori archevani!");
            }
        }
    }

    private static void showMenu() {
        System.out.println("\ntelefonebis wignaki");
        System.out.println("1. axali kontaktis damateba");
        System.out.println("2. yvela kontaktis naxva  ");
        System.out.println("3. konyaktis redaqtireba ");
        System.out.println("4. kontaktis washla ");
        System.out.println("5. exit");
        System.out.print("airchiet: ");
    }

    private static void addContact() {
        if (contactCount >= 30) {
            System.out.println("kontaktrebis sia savsea!");
            return;
        }

        System.out.print("saxeli: ");
        String firstName = scanner.nextLine();

        System.out.print("gvari: ");
        String lastName = scanner.nextLine();

        System.out.print("telefonis nomeri: ");
        String phoneNumber = scanner.nextLine();

        System.out.print("el.fosta: ");
        String email = scanner.nextLine();

        contacts[contactCount] = new PhoneContact(firstName, lastName, phoneNumber, email);
        contactCount++;

        Data.serializeContacts(contacts);
        System.out.println("kontakti damatebulia");
    }

    private static void viewContacts() {
        if (contactCount == 0) {
            System.out.println("kontaktebi ar aris!");
            return;
        }

        System.out.println("\nyvela kontakti");
        for (int i = 0; i < contactCount; i++) {
            System.out.println((i + 1) + ". " + contacts[i]);
        }
    }

    private static void editContact() {
        if (contactCount == 0) {
            System.out.println("kontakti ar aris");
            return;
        }

        viewContacts();
        System.out.print("airchiet kontaktis nomeri redaktirebistvis: ");
        int index = scanner.nextInt() - 1;
        scanner.nextLine();

        if (index < 0 || index >= contactCount) {
            System.out.println("araswori nomeri!!");
            return;
        }

        System.out.print("axali saxeli: ");
        String firstName = scanner.nextLine();
        System.out.print("axali gvari: ");
        String lastName = scanner.nextLine();
        System.out.print("axali telefonis nomeri: ");
        String phoneNumber = scanner.nextLine();
        System.out.print("axali el-fosta: ");
        String email = scanner.nextLine();
        contacts[index] = new PhoneContact(firstName, lastName, phoneNumber, email);
        Data.serializeContacts(contacts);
        System.out.println("kontakti ganaxlebulia");
    }

    private static void deleteContact() {
        if (contactCount == 0) {
            System.out.println("kontakti ar aris");
            return;
        }

        viewContacts();
        System.out.print("airchiet kontaktis nomeri wasashlelad: ");
        int index = scanner.nextInt() - 1;
        scanner.nextLine();

        if (index < 0 || index >= contactCount) {
            System.out.println("arasworia nomeri!");
            return;
        }

        for (int i = index; i < contactCount - 1; i++) {
            contacts[i] = contacts[i + 1];
        }
        contacts[contactCount - 1] = null;
        contactCount--;

        Data.serializeContacts(contacts);
        System.out.println("kontaqti washlilia!");
    }

    private static void loadContacts() {
        PhoneContact[] loadedContacts = Data.deserializeContacts();
        if (loadedContacts != null) {
            contacts = loadedContacts;
            for (int i = 0; i < contacts.length; i++) {
                if (contacts[i] != null) {
                    contactCount++;
                } else {
                    break;
                }
            }
            System.out.println("kontaktebi chaitvirta: " + contactCount);
        }
    }
}