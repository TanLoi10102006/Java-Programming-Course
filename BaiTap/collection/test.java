
import java.util.ArrayList;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<SinhVien> sv = new ArrayList<>();
        int n;
        do {


            System.out.println("=== MENU ===");
            System.out.println("1.cho phep them sinh vien vao danh sach");
            System.out.println("2.kiem tra danh sach co rong hay khong ");
            System.out.println("3.lam rong danh sach sinh vien");
            System.out.println("4. lay ra so luong sinh vien trong danh sach ");
            System.out.println("5.xuat ra manh hinh ");
            System.out.println("6.thoat chuong trinh");
            System.out.println("moi ban nhap so ban can lam ");
            n = sc.nextInt();
            switch (n) {
                case 1:
                    SinhVien e = new SinhVien();
                    e.Nhap();
                    sv.add(e);
                    System.out.println("Da them sinh vien");
                    break;
                case 2:
                    if (sv.isEmpty()) {
                        System.err.println("Danh sach chua co ai ");

                    } else {
                        System.out.println("Danh sach da co nguoi");
                    }
                    break;
                case 3:
                    sv.clear();
                    System.out.println("Da lam rong danh sach");
                    break;
                case 4:
                    System.out.println("So luong trong danh sach sinh vien la " + sv.size());
                    break;
                case 5:
                    for (SinhVien sinhVien : sv) {
                        sinhVien.Xuat();
                    }
                default:
                    System.out.println("ban da thoat chuong trinh ");
            }
        } while (n != 6);



    }
}
