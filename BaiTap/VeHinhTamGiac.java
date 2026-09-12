import java.util.Scanner;
public class VeHinhTamGiac {
    public static void main(String[] args) {
        // Tam giác vuông
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chiều cao của tam giác: ");
        int height = scanner.nextInt(); // Chiều cao của tam giác
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        // Tam giác cân
        System.out.println("Nhập chiều cao của tam giác cân: ");
        int h = scanner.nextInt(); // Chiều cao của tam giác cân
        for (int i = 1; i <= h; i++) {
            // in khoảng trắng để căn giữa
            for (int j = i; j < h; j++) {
                System.out.print(" ");
            }
            // in dấu *
            for (int k = 1; k <= (2*i - 1); k++) {
                System.out.print("*");
            }
            // xuống dòng sau mỗi hàng
            System.out.println();
        }
        // vẽ hình vuông 
        System.out.print("Nhập kích thước của hình vuông: ");
        int size = scanner.nextInt(); // Kích thước của hình vuông
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        
    }
}