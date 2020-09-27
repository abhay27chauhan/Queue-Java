// FIFO

import java.util.Queue;
import java.util.ArrayDeque;
class queue{

    public static void main(String[] args){
        Queue<Integer> q = new ArrayDeque<>();
        // add
        q.add(10);
        q.add(20);
        q.add(30);

        // display
        System.out.println(q);

        //remove
        System.out.println(q.remove());
        System.out.println(q);

        // top
        System.out.println(q.peek());

        // size
        System.out.println(q.size());
    }
}