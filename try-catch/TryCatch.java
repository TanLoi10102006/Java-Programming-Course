import java.util.Scanner;

public class TryCatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean DK = false;
        String binary = ""; // Khai báo ngoài try để có thể dùng sau

        while (!DK) {
            try {
                System.out.print("Nhập một số nguyên: ");
                int number = scanner.nextInt(); 

                binary = ""; // reset chuỗi mỗi lần nhập
                while (number > 0) {
                    int remainder = number % 2; 
                    binary = remainder + binary; 
                    number = number / 2; 
                }

                DK = true; // nhập đúng thì thoát vòng lặp
            } catch (Exception e) {
                System.out.println("Lỗi: Vui lòng nhập một số nguyên hợp lệ.");
                scanner.nextLine(); // Xóa dữ liệu sai
            } finally { // Phần này sẽ luôn được thực thi, dù có lỗi hay không
                System.out.println("Đây là phần finally, sẽ luôn được thực thi.");
            }
        }

        System.out.println("Số nhị phân là: " + binary);
    }
}