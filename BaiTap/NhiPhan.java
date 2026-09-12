import java.util.Scanner;
public class NhiPhan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập một số nguyên: ");
        int number = scanner.nextInt(); // Số nguyên cần chuyển đổi
        String binary = ""; // Chuỗi để lưu kết quả nhị phân
       while(number > 0) {
            int remainder = number % 2; // Lấy phần dư khi chia cho 2
             binary =remainder+binary; // Thêm phần dư vào chuỗi nhị phân
            number = number / 2; // Chia số cho 2 để tiếp tục
        }
        System.out.println("Số nhị phân là: "+binary); // In xuống dòng sau khi in xong chuỗi nhị phân
    }
}