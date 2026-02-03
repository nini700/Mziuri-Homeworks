import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            byte[] data = new byte[100];
            int length = 0;

            System.out.println("შეიყვანეთ თქვენი სახელი გვარი და ასაკი");
            while (true) {
                int b = System.in.read();
                if (b == 10 || b == -1) break;
                data[length] = (byte) b;
                length++;
            }
            String input = new String(data, 0, length).trim();
            String[] parts = input.split(" ");

            if (parts.length < 3) {
                System.out.println("შეიყვანეთ თქვენი სახელი გვარი დდა ასაკი");
                return;
            }
            String name = parts[0];
            String surname = parts[1];
            int age = Integer.parseInt(parts[2]);
            Human h1 = new Human(name, surname, age);
            Human h2 = new Human("ნინი", "ბადრიძე", 16);
            h1.walk();
            h1.hangOut(h2);
            h2.walk();

        } catch (IOException e) {
            System.err.println("შეყვანის ერრორი");
        }
    }
}
