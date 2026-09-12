
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class TimeDate {
    public static void main(String[] args) {

        // Hàm System.currentTimeMillis(): Hàm lấy thời gian hiện tại
        long t1 = System.currentTimeMillis();
        for (long i = 0; i < 1000; i++) {
            System.out.println("test");
        }
        long t2 = System.currentTimeMillis();
        System.out.println("truoc khi chay for " + t1);
        System.out.println("sau khi chay for " + t2);
        System.out.println("thoi gian: " + (t2 - t1) + " ms");
        System.out.println("thoi gian " + (t2 - t1) / 1000 + "s");

        // TimeUnit:
        System.out.println("3000 nam = " + TimeUnit.DAYS.toSeconds(3000 * 365) + "s");
        System.out.println("doi giay qua ngay " + TimeUnit.MILLISECONDS.toDays(t1));

        // Date
        Date d = new Date(System.currentTimeMillis());
        System.out.println("date la " + d);

        // Calendar
        Calendar c = Calendar.getInstance();
        System.out.println(c.get(Calendar.DATE));


    }
}
