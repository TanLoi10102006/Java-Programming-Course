import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // hiện thị menu
        System.out.println("=== MENU CA PHE ===");
        for (CoffeeMenu coffe : CoffeeMenu.values()) {
            coffe.showInfo();
        }

        // Nhập món
        System.out.println("Moi ban nhap ten mon ");
        String nhaptenmon = sc.nextLine().toUpperCase();
        CoffeeMenu Selected = CoffeeMenu.valueOf(nhaptenmon);
        // Nhap so luong
        System.out.println("Nhap so luong ");
        int n = sc.nextInt();
        int Tien = Selected.TinhTongTien(n);

        // in hóa đơn
        System.out.println("hoa don la ");
        System.out.println("ten mon " + Selected.getTen());
        System.out.println("gia " + Selected.getGia());
        System.out.println("so luong " + n);
        System.out.println("Tong tien " + Tien + "VND");

    }
}
