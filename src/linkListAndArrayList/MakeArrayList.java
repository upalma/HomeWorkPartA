package linkListAndArrayList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class MakeArrayList {
    public static void main(String[] args) {

        List<Integer> list = new LinkedList<>();
        list.add(100);
        list.add(120);
        list.add(240);
        list.add(340);

        for (Integer st: list)
            System.out.println(st);
        System.out.println(" ");

        ((LinkedList<Integer>) list).remove(2); //Remove index no 2

        ((LinkedList<Integer>) list).addFirst(12);// add 12 at the beginning
        for (Integer st: list)
            System.out.println(st);



        }
    }



