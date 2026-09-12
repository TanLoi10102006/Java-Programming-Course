import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class setVd {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Set<String> tapHopPhieuDuThuong = new HashSet<String>();
        int luachon = 0;
        do {
            System.out.println("==============================");
            System.out.println("MENU");
            System.out.println("1. Them ma so du thuong ");
            System.out.println("2. Xoa ma so du thuong ");
            System.out.println("3. kiem tra ma so trung thuong co ton tai hay khong ");
            System.out.println("4. Xoa tat ca cac ma");
            System.out.println("5. So luong ma trung thuong ");
            System.out.println("6. Rut tham trung thuong ");
            System.out.println("7. In ra tat ca cac ma ");
            System.out.println("0. Thoat khoi chuong trinh ");
            System.out.println("Moi ban chon");
            luachon = sc.nextInt();
            sc.nextLine();

            switch (luachon) {
                case 1:
                    System.out.println("Nhap ma so trung thuong ");
                    String maSo = sc.nextLine().toUpperCase();
                    if (tapHopPhieuDuThuong.add(maSo)) {
                        System.out.println("ban da them thanh cong ");

                    } else {
                        System.out.println("ban da them that bai");
                    }
                    break;
                case 2:
                    System.out.println("Nhap ma can xoa ");
                    String maCanXoa = sc.nextLine().toUpperCase();
                    if (tapHopPhieuDuThuong.remove(maCanXoa)) {
                        System.out.println("Ban da so thanh cong");

                    } else {
                        System.out.println("khong tim thay ma de xoa");
                    }

                    break;
                case 3:
                    System.out.println("Nhap ma can kiem tra ");
                    String maKT = sc.nextLine().toUpperCase();
                    if (tapHopPhieuDuThuong.contains(maKT)) {
                        System.out.println("ma " + maKT + " co ton tai ");
                    } else {
                        System.out.println("ma khong ton tai ");

                    }

                    break;
                case 4:
                    tapHopPhieuDuThuong.clear();
                    System.out.println("ban da xoa tat ca cac ma phieu trung thuong");

                    break;
                case 5:
                    System.out.println(
                            "so luong cac ma trung thuong la " + tapHopPhieuDuThuong.size());
                    break;
                case 6:
                    if (tapHopPhieuDuThuong.isEmpty()) {
                        System.out.println("k co ma phieu trung thuong");
                        break;
                    }
                    Random rd = new Random();
                    ArrayList<String> dsTrungThuong = new ArrayList<>(tapHopPhieuDuThuong);
                    int vitri = rd.nextInt(dsTrungThuong.size());
                    String maTrungThuong = dsTrungThuong.get(vitri);
                    System.out.println("========================");
                    System.out.println(
                            "CHUC MUNG NGUOI MANG MA " + maTrungThuong + " DA TRUNG THUONG");
                    tapHopPhieuDuThuong.remove(maTrungThuong);
                    System.out.println("ma trung thuong " + maTrungThuong + " da bi xoa");
                    break;
                case 7:
                    System.out.println(tapHopPhieuDuThuong);
                    break;
                default:
                    System.out.println("ban da thoat khoi chuong trinh ");
            }

        } while (luachon != 0);

    }
}
