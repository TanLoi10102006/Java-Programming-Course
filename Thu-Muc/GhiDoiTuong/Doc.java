
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Doc {
    public static void main(String[] args) {
        try {
            FileInputStream fl = new FileInputStream("D:\\JAVA\\File-De-VD\\h3.txt");
            ObjectInputStream ol = new ObjectInputStream(fl);

            // Ép kiểu về đối tượng ban đầu
            SinhVien sv = (SinhVien) ol.readObject();

            ol.close();
            fl.close();

            System.out.println("Đọc lại đối tượng: " + sv);

        } catch (Exception e) {

        }

    }
}
