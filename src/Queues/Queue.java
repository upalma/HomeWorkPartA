package Queues;



import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Queue {
    public static void main(String[] args) {

        List<String> queue = new LinkedList<String>();
        queue.add("North");
        queue.add("South");
        queue.add("East");
        queue.add("West");
// process is first in first out
// We can use "for-loop" or "ITERATOR"  for calling the linked list

        for (String st : queue) {
            System.out.println(st);
        }

//        Iterator it = queue.iterator();
//         while (it.hasNext()) {
//        System.out.println(it.next());
         }
    }
