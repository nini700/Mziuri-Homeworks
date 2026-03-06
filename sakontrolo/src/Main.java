//1 b
//2 a
//3 a, b, d
//4 c
//5 a, c
//6 b
//7 c
//8 b
//9 b
//10 c
//11 c
//12 b
//13 a, b, c, d
//14 d, b
//15 b, c

import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args){
        String teqsturiFaili = "students.txt";
        String binaruliFaili = "shemajameneli.dat";
        List<Student> studentebisSia = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(teqsturiFaili))){
            String xazi;
            while ((xazi = br.readLine()) != null) {

                String[] monacemebi = xazi.split(",");
                if (monacemebi.length < 6) continue;

                int aidi = Integer.parseInt(monacemebi[0].trim());
                String saxeli = monacemebi[1].trim();
                String gvari = monacemebi[2].trim();
                int weli = Integer.parseInt(monacemebi[3].trim());
                double qula = Double.parseDouble(monacemebi[4].trim());

                String[] sagnebisMasivi = monacemebi[5].trim().split(" ");
                studentebisSia.add(new Student(aidi, saxeli, gvari, weli, qula, sagnebi));
                catch (IOException e){
                    e.printStackTrace();
                }

                Collections.sort(studentebisSia);

                List<String> sagnebi = Array.asList(sagnebisMasivi);

                Student st = new Student(aidi, saxeli, gvari, weli, qula, sagnebi);
                studentebisSia.add(st);
            }
        } catch (IOException e){
            e.printStackTrace();
        }

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(binaruliFaili))){
            oos.writeObject((studentebisSia));
            System.out.println("Serializacia warmatebit dasrulda");
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(binaruliFaili))){
            List<Student> wakitxuliSIa = (List<Student>)ois.readObject();
            System.out.println("Deserializirebuli ukve monacemebi");
            for (Student s : wakitxuliSIa){
                System.out.println(s);
            }
        }catch (IOException e) {
            e.printStackTrace();
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
        }
    }
}










