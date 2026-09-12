import java.io.File;
import java.io.IOException;

public class VDTaoTapTinVaThuMuc {
    public static void main(String[] args) {
        // Lưu ý:
        // MS Windows: \=>\\
        // Linux,MacOS /

        // Kiểm tra thư mục hoặc tập tin có tồn tại hay không?
        File folder1 = new File("D:\\JAVA\\Thu-Muc\\cc.txt");

        if (folder1.exists()) {
            System.out.println("Foder 1 co ton tai hay k ");
        } else {
            System.out.println("Foder 1 khong ton tai ");
        }
        // tao thư muc
        // phương thức mkdir() => Tạo 1 thư mục
        File foder = new File("D:\\JAVA\\Thu-Muc\\hello");
        foder.mkdir();

        // Phương thức mkdirs()=> tạo nhiều thư mục cùng lúc

        File foder1 = new File("D:\\JAVA\\Thu-Muc\\hello\\hello1\\hello2\\hello3");
        foder1.mkdirs();

        // Tao tập tin (có phần mở rộng: .exe, .txt,......)

        File file1 = new File("D:\\JAVA\\Thu-Muc\\hello.txt");
        try {
            file1.createNewFile();


        } catch (IOException e) {
            // Không có quyền tạo tập tin
            // Ổ cứng bị đầy
            // Đường dẫn sai
            e.printStackTrace();
        }



    }
}
