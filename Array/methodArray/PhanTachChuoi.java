
import java.util.Arrays;

public class PhanTachChuoi {
    public static void main(String[] agrs) {
        String s = "Xin chao cac ban, tui la tan loi ";
        String[] a = s.split(" ");
        System.out.println("ket qua cua a " + Arrays.toString(a));
        String[] b = s.split(",");
        System.out.println("ket qua cua b la " + Arrays.toString(b));
        String s2 = "xin chao, minh la tan loi. minh la lap trinh vien";
        String[] c = s2.split("\\.|\\,"); // dấu | dùng để chia ra giữa 2 dấu
        System.out.println("ket qua cua x la " + Arrays.toString(c));
        String[] e = s2.split("minh");
        System.out.println("ket qua cua e la " + Arrays.toString(e));
        String s3 = "Doan Tan Loi";
        String[] d = s3.split(" ");
        System.out.println("ket qua cua d " + Arrays.toString(d));
        System.out.println("Ten tui la  " + d[d.length - 1]);
    }
}
