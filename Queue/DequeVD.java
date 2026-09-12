
import java.util.ArrayDeque;
import java.util.Deque;

public class DequeVD {
    public static void main(String[] args) {
        Deque<String> sv = new ArrayDeque<>();
        sv.addFirst("doan tan loi ");
        sv.addLast("nguyen van a");
        sv.offerFirst("doremon");
        sv.offerLast("nobita");
        System.out.println("lay dau " + sv.getFirst());
        System.out.println("lay cuoi " + sv.getLast());
        while (!sv.isEmpty()) {
            System.out.println(sv.poll());

        }


    }
}
