import java.util.ArrayList;

public class Davaleba2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(25);
        list.add(2);
        list.add(4);
        list.add(11);
        list.add(87);

        printList(list);
    }
    public static void printList(ArrayList<Integer> list) {
        System.out.print("List of {");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
            if (i < list.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("}");
    }
}