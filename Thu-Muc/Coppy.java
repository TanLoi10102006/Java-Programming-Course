import java.io.File;

public class Coppy {
    public static void main(String[] args) {
        // Ví dụ đổi tên thư mục bằng renameTo
        File f0 = new File("D:\\JAVA\\Thu-Muc\\cc");
        File f1 = new File("D:\\JAVA\\Thu-Muc\\haha");

        if (f0.renameTo(f1)) {
            System.out.println("Đổi tên thành công!");
        } else {
            System.out.println("Đổi tên thất bại!");
        }

        // coppy(): tạo bảng sao mới
        // move():Di chuyển file thư mục file góc biến mất
    }
}

