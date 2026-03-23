public class Main {
    public static void main(String[] args) {
        IntLinkedList list = new IntLinkedList();

        System.out.println("ცარიელი ლისტი");
        System.out.println("ზომა: " + list.size());
        System.out.println("isEmpty: " + list.isEmpty());
        try { list.removeFirst(); } catch (java.util.NoSuchElementException e) { System.out.println("removeFirst throws: " + e.getMessage()); }
        try { list.get(0); } catch (IndexOutOfBoundsException e) { System.out.println("get(0) throws: " + e.getMessage()); }

        System.out.println("\n1 ელემენტიანი");
        list.add(10);
        System.out.println("დაამატე(10): " + list);
        System.out.println("head=" + list.getFirst() + " tail=" + list.getLast());
        System.out.println("removeLast returns: " + list.removeLast());
        System.out.println("after removeLast: " + list + " size=" + list.size());

        System.out.println("\nდაუმატე პირველი / დაუმატე ბოლო");
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addFirst(0);
        System.out.println("ლისტი: " + list);

        System.out.println("\nდაუმატე(ინდექსი)");
        list.add(2, 99);
        System.out.println("დამატებული(2, 99): " + list);

        System.out.println("\nget / set");
        System.out.println("get(2): " + list.get(2));
        System.out.println("set(2, 55) old value: " + list.set(2, 55));
        System.out.println("ლისტი: " + list);

        System.out.println("\nწაშლა");
        System.out.println("წაშალე(2): " + list.remove(2));
        System.out.println("ლისტი: " + list);

        System.out.println("\nindexOf / contains");
        System.out.println("indexOf(3): " + list.indexOf(3));
        System.out.println("contains(3): " + list.contains(3));
        System.out.println("contains(99): " + list.contains(99));

        System.out.println("\nremoveValue");
        System.out.println("removeValue(2): " + list.removeValue(2));
        System.out.println("ლისტი: " + list);

        System.out.println("\nმასივში");
        int[] arr = list.toArray();
        System.out.print("მასივი: ");
        for (int v : arr) System.out.print(v + " ");
        System.out.println();

        System.out.println("\nBonus");
        list.addLast(1);
        System.out.println("შებრუნებამდე: " + list);
        list.reverse();
        System.out.println("შებრუნების მერე: " + list);

        list.add(1);
        list.add(1);
        System.out.println("count(1): " + list.count(1));

        IntLinkedList list2 = new IntLinkedList();
        for (int v : list.toArray()) list2.add(v);
        System.out.println("უდრის: " + list.equals(list2));
    }
}