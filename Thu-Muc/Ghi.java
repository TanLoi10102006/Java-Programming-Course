
import java.io.PrintWriter;



public class Ghi {
    public static void main(String[] args) {
        try {
            PrintWriter pw = new PrintWriter("D:\\JAVA\\File-De-VD\\h1.txt", "UTF-8");
            pw.println("Xin chao ");
            pw.println("du lieu ");
            pw.println(3.14);
            SinhVien sv = new SinhVien(111, "Loi");
            pw.println(sv);
            pw.close();



        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
