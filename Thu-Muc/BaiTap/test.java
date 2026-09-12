import java.io.PrintWriter;

public class test {
    public static void main(String[] args) {
        try {
            HoaDon hd = new HoaDon();
            hd.nhap(); // nhập thông tin hóa đơn

            // In ra console để kiểm tra
            System.out.println(hd);

            // Ghi ra file
            PrintWriter f0 = new PrintWriter("D:\\JAVA\\Thu-Muc\\BaiTap\\hoaDon.txt");
            f0.println(hd.toString()); // ghi nội dung hóa đơn
            f0.close(); // đóng file sau khi ghi

            System.out.println("Hóa đơn đã được lưu thành công!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
