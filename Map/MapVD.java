import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class MapVD {
    private Map<String, String> dulieu = new TreeMap<>();
    public static Scanner sc = new Scanner(System.in);


    public String Xoa(String tukhoa) {
        return dulieu.remove(tukhoa);
    }

    public String Them(String tukhoa, String ynghia) {
        return dulieu.put(tukhoa, ynghia);

    }

    public String timNghia(String tuKhoa) {
        return dulieu.get(tuKhoa);
    }

    public void inDanhSach() {
        if (!dulieu.isEmpty()) {
            for (String key : dulieu.keySet()) {
                System.out.println(key);
            }

        } else {
            System.out.println("danh sach rong");
        }

    }

    public int inSoLuongTu() {
        return dulieu.size();
    }

    public void XoaTatCa() {
        dulieu.clear();
    }

    public static void main(String[] args) {
        MapVD tuDien = new MapVD();

        int luachon = 0;
        do {
            System.out.println("==================");
            System.out.println("MENU");
            System.out.println("Tra tu dien Anh-Viet: ");
            System.out.println("1. Them tu (Tu khoa,Y nghia)");
            System.out.println("2. Xoa tu");
            System.out.println("3. Tim y nghia cua tu khoa =>tra tu dien ");
            System.out.println("4. in ra danh sach tu khoa ");
            System.out.println("5. In ra so luong tu ");
            System.out.println("6. Xoa tat ca cac tu khoa");
            System.out.println("0. thoa khoi MENU ");
            luachon = sc.nextInt();
            sc.nextLine();
            switch (luachon) {
                case 1:
                    System.out.println("Moi ban nhap tu khoa ");
                    String tuKhoa = sc.nextLine();
                    System.out.println("Moi ban nhap y nghia ");
                    String yNghia = sc.nextLine();
                    tuDien.Them(tuKhoa, yNghia);
                    break;
                case 2:
                    System.out.println("Nhap tu khoa can xoa ");
                    String tuKhoaCanXoa = sc.nextLine();
                    tuDien.Xoa(tuKhoaCanXoa);
                    break;
                case 3:
                    System.out.println("Moi ban nhap tu khoa can tra ");
                    String tuCanTim = sc.nextLine();
                    String nghia = tuDien.timNghia(tuCanTim);
                    if (nghia != null) {
                        System.out.println("Y nghia: " + nghia);
                    } else {
                        System.out.println("Khong tim thay tu!");
                    }
                    break;
                case 4:
                    System.out.println("Danh sach tu khoa ");
                    tuDien.inDanhSach();
                    break;
                case 5:
                    System.out.println("Tong cac so luong phan tu la " + tuDien.inSoLuongTu());
                    break;
                case 6:
                    tuDien.XoaTatCa();
                    System.out.println("Ban da xoa tat ca cac phan tu");
                    break;
                default:
                    System.out.println("Ban da thoat khoi menu");

            }
        } while (luachon != 0);
    }


}
