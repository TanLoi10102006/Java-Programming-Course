
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class GhiObject {
    public static void main(String[] args) {
        try {
            SinhVien sv = new SinhVien("Doan Tan Loi", 111, 10);
            // FileOutputStream: mở một file để ghi dữ liệu dạng byte.
            FileOutputStream f0 = new FileOutputStream("D:\\JAVA\\File-De-VD\\h3.txt");
            // ObjectOutputStream:bọc quanh FileOutputStream để cho phép ghi đối tượng (serialize)
            // thay vì chỉ byte thôi
            ObjectOutputStream oos = new ObjectOutputStream(f0);
            oos.writeObject(sv);
            oos.close();
            System.out.println("Da ghi doi tuong ");


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
