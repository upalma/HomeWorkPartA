package linkListAndArrayList;


import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class MakeLinkList {
        public static void main(String[] args) {

        List<String> list = new LinkedList<String>();

        list.add("Dhaka");
        list.add("Chittagong");
        list.add("Rajshahi");
        list.add("Khulna");
        list.add("Sylhet");

        for (String st: list)
        System.out.println(st);
        System.out.println(" ");

        list.size();
        System.out.println("size of list:  "+ list.size());
        System.out.println(" ");

        list.remove(3);

        Iterator it = list.iterator();
        while(it.hasNext()){
        System.out.println(it.next());
            }
        }
    }
