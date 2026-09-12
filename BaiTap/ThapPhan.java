import java.util.Scanner;
public class ThapPhan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số nhị phân mà bạn mún đổi: ");
        String binary = scanner.nextLine(); // Chuỗi nhị phân cần chuyển đổi
        int decimal = 0; // Biến để lưu kết quả thập phân
        int length = binary.length(); // Độ dài của chuỗi nhị phân
        for (int i = 0; i < length; i++) {
            char bit = binary.charAt(length - 1 - i); // Lấy từng bit từ phải sang trái
            if (bit == '1') {
                decimal += Math.pow(2, i); // Nếu bit là 1, cộng giá trị tương ứng vào thập phân
            }
        }
        System.out.println("Số thập phân tương ứng là: " + decimal);
    }
}