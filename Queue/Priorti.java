
import java.util.PriorityQueue;
import java.util.Queue;

public class Priorti {
    public static void main(String[] args) {
        Queue<String> sv = new PriorityQueue<>();
        sv.offer("nguyen van b");
        sv.offer("nguyen van a");
        sv.offer("9");
        sv.offer("3");
        while (!sv.isEmpty()) {
            System.out.println(sv.poll());
        }
    }
}
