import java.util.Random;
import java.util.Scanner;

public class TaiXiu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("CHAO MUNG BAN DEN VOI GAME TAI XIU");
        System.out.println("CHUC BAN MAY MAN ");
        System.out.println("Nha cai cho ban 10000");
        int money = 10000;
        int chonChucNang;

        do {
            menu();
            chonChucNang = sc.nextInt();

            switch (chonChucNang) {
                case 1 -> money = NapTien(money, sc);
                case 2 -> money = RutTien(money, sc);
                case 3 -> System.out.println("So tien hien tai la " + money);
                case 4 -> {
                    if (money <= 0) {
                        System.out.println("Ban khong co tien de choi!");
                    } else {
                        money = PlayRound(money, sc);
                    }
                }
            }
        } while (chonChucNang != 5);

        System.out.println("Game ket thuc");
        System.out.println("So tien hien tai ban co la " + money);
    }

    public static int xucxac() {
        return new Random().nextInt(6) + 1;
    }

    public static int Random3vien() {
        int x1 = xucxac(), x2 = xucxac(), x3 = xucxac();
        System.out.println("Xúc xắc 1: " + x1 + ", Xúc xắc 2: " + x2 + ", Xúc xắc 3: " + x3);
        return x1 + x2 + x3;
    }

    public static boolean NhaCaiWin(int sum) {
        return sum == 3 || sum == 18;
    }

    public static boolean NguoiChoiWin(int sum, String Chon) {
        if (NhaCaiWin(sum))
            return false;
        if (sum >= 11 && sum <= 17 && Chon.equals("tai"))
            return true;
        if (sum >= 4 && sum <= 10 && Chon.equals("xiu"))
            return true;
        return false;
    }

    public static int PlayRound(int money, Scanner sc) {
        System.out.println("Tien hien tai: " + money);
        String Chon;
        do {
            System.out.print("Chon (tai/xiu): ");
            Chon = sc.next().toLowerCase();
        } while (!Chon.equals("tai") && !Chon.equals("xiu"));

        int TienCuoc;
        do {
            System.out.print("Nhap so tien cuoc: ");
            TienCuoc = sc.nextInt();
        } while (TienCuoc <= 0 || TienCuoc > money);

        int sum = Random3vien();
        System.out.println("Tong: " + sum);

        if (NhaCaiWin(sum)) {
            System.out.println("Ra bo ba, nha cai win!");
            return money - TienCuoc;
        }
        if (NguoiChoiWin(sum, Chon)) {
            System.out.println("Ban win!");
            return money + TienCuoc;
        }
        System.out.println("Ban thua!");
        return money - TienCuoc;
    }

    public static int NapTien(int money, Scanner sc) {
        int tiennap;
        do {
            System.out.print("Nhap so tien muon nap: ");
            tiennap = sc.nextInt();
        } while (tiennap < 0);
        System.out.println("Nap tien thanh cong!");
        return money + tiennap;
    }

    public static int RutTien(int money, Scanner sc) {
        int soTienRut;
        do {
            System.out.print("Nhap so tien muon rut: ");
            soTienRut = sc.nextInt();
        } while (soTienRut < 0 || soTienRut > money);
        System.out.println("Rut tien thanh cong!");
        return money - soTienRut;
    }

    public static void menu() {
        System.out.println("\n===== MENU CO BAC MANG =====");
        System.out.println("1. Nap tien vao choi");
        System.out.println("2. Rut tien");
        System.out.println("3. Xem so tien hien tai");
        System.out.println("4. Choi tai xiu");
        System.out.println("5. Thoat");
        System.out.print("Moi ban chon: ");
    }
}
