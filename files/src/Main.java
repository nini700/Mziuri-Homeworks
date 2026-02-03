import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("vefxistyaosani.txt");

            String text =
                    "შიგან ასრე გავერივე, გნოლის ჯოგსა ვითა ქორი,\n" +
                            "კაცი კაცსა შემოვსტყორცი, ცხენ-კაცისა დავდგი გორი;\n" +
                            "კაცი, ჩემგან განატყორცი ბრუნავს ვითა ტანაჯორი,\n" +
                            "ერთობ სრულად ამოვწყვიდე წინა კერძო რაზმი ორი.";

            fos.write(text.getBytes());
            fos.flush();
            fos.close();
        } catch (IOException e) {
            System.err.println("ფაილში ჩაწერის ერორი");
        }

        try {
            FileInputStream fis = new FileInputStream("vefxistyaosani.txt");

            byte[] data = fis.readAllBytes();
            fis.close();

            String content = new String(data);
            String[] words = content.split("\\s+");

            System.out.println("სიტყვების რაოდენობა: " + words.length);
        } catch (IOException e) {
            System.err.println("ფაილის წაკითხვის ერორი");
        }

        try {
            String searchWord = "ჩემგან";

            FileInputStream fis = new FileInputStream("vefxistyaosani.txt");
            String content = new String(fis.readAllBytes());
            fis.close();

            if (content.contains(searchWord)) {
                System.out.println("სიტყვა ნაპოვნია");
            } else {
                System.out.println("სიტყვა ვერ მოიძებნა");
            }
        } catch (IOException e) {
            System.err.println("ძიების ერორი");
        }

        try {
            FileOutputStream fos = new FileOutputStream("text.txt");

            String text =
                    "Assure polite his real and other figures though. " +
                            "Day age advantages and sufficient eating expression traveling. " +
                            "Of on am father by agreed supply rather either. " +
                            "Own handsome delicate property mistresses her end appetite. " +
                            "Mean are sons too sold nor said. " +
                            "Son share three men power by you. " +
                            "Now merits wonder effect garret own.";

            fos.write(text.getBytes());
            fos.flush();
            fos.close();
        } catch (IOException e) {
            System.err.println("text.txt ვერ შევქმენი");
        }

        try {
            FileInputStream fis = new FileInputStream("text.txt");
            String content = new String(fis.readAllBytes());
            fis.close();

            FileOutputStream fos = new FileOutputStream("text_upper.txt");
            fos.write(content.toUpperCase().getBytes());
            fos.flush();
            fos.close();
        } catch (IOException e) {
            System.err.println("CAPITAL ფაილის ერორი");
        }

        try {
            FileOutputStream fos = new FileOutputStream("merged.txt");

            fos.write("1 ფაილი\n".getBytes());

            FileInputStream f1 = new FileInputStream("vefxistyaosani.txt");
            fos.write(f1.readAllBytes());
            f1.close();

            fos.write("\n\n2 ფაილი\n".getBytes());

            FileInputStream f2 = new FileInputStream("text_upper.txt");
            fos.write(f2.readAllBytes());
            f2.close();

            fos.flush();
            fos.close();
        } catch (IOException e) {
            System.err.println("ფაილების გაერთიანების ერორი");
        }
    }
}
