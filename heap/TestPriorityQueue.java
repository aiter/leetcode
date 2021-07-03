import java.util.Arrays;
import java.util.Iterator;
import java.util.PriorityQueue;

/**
 * @author 乐牙
 * @date 2021/07/03 8:54 PM
 */
public class TestPriorityQueue {

    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue(Arrays.asList(3,7,4,6,5,2,9,10,99,50));

        System.out.println(Arrays.toString(priorityQueue.toArray()));

        for(Iterator<Integer> iterator=priorityQueue.iterator(); iterator.hasNext();) {
            System.out.println(iterator.next());
        }

        while (priorityQueue.size()>0) {
            System.out.println(priorityQueue.poll());
            System.out.println(Arrays.toString(priorityQueue.toArray()));
        }
    }
}
