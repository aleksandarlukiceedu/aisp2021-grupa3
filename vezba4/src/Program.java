import list.LinkedList;

public class Program {
    public static void main(String[] args) {
        LinkedList<String> l = new LinkedList<>();
        l.addFirst("1");
        l.addLast("2");
        l.addFirst("3");
        l.add(1, "4");


        String x = l.getFirst() + l.getLast();
        System.out.println(x);
        l.remove("4");
        System.out.println();
        System.out.println(l.indexOf("14"));

        l.clear();
        for (String s: l) {
            System.out.println(s);
        }
    }
}
