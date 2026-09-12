import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {
    public static void main(String[] args) {
        Queue<String> sv = new LinkedList<String>();

        sv.add("Doan Tan Loi ");
        sv.offer("Nguyen Van A");
        sv.offer("Nguyen Van B");

        while (true) {
            String ten = sv.poll(); // poll=> lấy ra và xóa
            // peek => lấy ra và k xoa
            if (ten == null) {
                break;
            }
            System.out.println(ten);

        }

    }

}
