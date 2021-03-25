import list.LinkedList;

public class Program {
    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        l.addFirst(1);
        l.addLast(2);
        l.addFirst(3);
        l.add(1, 4);

        for (int i = 0; i < l.size(); i++) {
            System.out.println(l.get(i));
        }
    }
}
