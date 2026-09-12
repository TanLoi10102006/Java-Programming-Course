import java.util.Scanner;

public class MyString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s; // dùng String để lưu chuỗi
        System.out.print("Nhap vao chuoi: ");
        s = sc.nextLine();
        System.out.println("Chuoi ban vua nhap la: " + s);

        // hàm length()=> lấy độ dài của chuỗi
        System.out.println(".do dai chuoi la " + s.length());
        int doDai = s.length();


        // Hàm charAt(index)=> lấy ra ký tự tại vị trí index
        for (int i = 0; i < doDai; i++) {
            System.out.println("vi tri " + i + "la " + s.charAt(i));
        }

        // Ham getChars(index bắt đầu,index kết thúc ,mảng lưu dữ liệu,index bắt đầu lưu của mảng)
        // coppy một đoạn ký tự từ string sang mảng char[];
        char[] arrayChar = new char[100];
        s.getChars(2, 4, arrayChar, 0);
        for (int i = 0; i < arrayChar.length; i++) {
            System.out.println("gia tri cua mang tai " + i + " la " + arrayChar[i]);
        }
        String a = "helloworld";
        char[] arr = new char[5];
        s.getChars(0, 5, arr, 0);
        System.out.println("mang khi coppy la " + arr); // hello


        // Hàm getBytes()=> Chuyển string sang mảng byte[];
        String b = "Đoàn Tấn Lợi";
        byte[] by = b.getBytes();
        for (int i = 0; i < b.length(); i++) {
            System.out.println(by[i]);
        }
        String s2 = new String(by);
        System.out.println("ket qua khi chuyen tu byte sang chuoi la " + s2);
    }

}
