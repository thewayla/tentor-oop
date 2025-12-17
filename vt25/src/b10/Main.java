package b10;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        UList<String> list = new UList<String>();
        System.out.println(list.add("1"));
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        list.add("6");
        list.add("7");
        list.add("8");
        list.add("9");
        list.add("10");
        System.out.println(list.toString());
        list.add("11");
        list.add("12");

        System.out.println(list.get(3));
        System.out.println(list.size());

        System.out.println(list.toString());

        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        for (String s : list) {
            System.out.println(s);
        }
    }
}