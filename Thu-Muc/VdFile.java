
import java.io.File;
import java.util.Scanner;


public class VdFile {
    File file;

    public VdFile(String tenfile) {
        this.file = new File(tenfile);
    }

    public boolean thuThi() {
        return this.file.canExecute();
    }

    public boolean coTheDoc() {
        return this.file.canRead();
    }

    public boolean coTheGhi() {
        return this.file.canWrite();
    }

    public String DuongDan() {
        return this.file.getAbsolutePath();
    }

    public String TenFile() {
        return this.file.getName();
    }

    public void KTfile() {
        if (!file.exists()) {
            System.out.println("k ton tai ");

        } else if (file.isFile()) {
            System.out.println("Day la tap tin  ");

        } else if (file.isDirectory()) {
            System.out.println("Day la thu muc ");

        }
    }

    public File getFile() {
        return file;
    }

    public void InDanhSachFileCon() {
        if (file.isDirectory()) {
            String[] mang = file.list();
            for (String cc : mang) {
                System.out.println(cc);

            }

        } else {
            System.out.println("khong co file con");
        }
    }

    public void inCayThuMuc(File file, int cap) {

        for (int i = 0; i < cap; i++) {
            System.out.print("    ");
        }

        System.out.println("|-- " + file.getName());

        if (file.isDirectory()) {

            File[] ds = file.listFiles();

            if (ds != null) {
                for (File f : ds) {
                    inCayThuMuc(f, cap + 1);
                }
            }
        }
    }



    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int luaChon = 0;
        do {
            System.out.println("MENU=============");
            System.out.println("1. Kiem tra file co the thuc thi: ");
            System.out.println("2. Kiem tra file co the doc ");
            System.out.println("3. Kiem tra file co the ghi ");
            System.out.println("4. Duong dan ");
            System.out.println(".5. In ten file");
            System.out.println("6. Kiem tra file la thu muc hoac tap tin ");
            System.out.println("7. In ra danh sach cac file con ");
            System.out.println("8. In ra cay thu muc ");
            System.out.println("0. Thoat chuong trinh ");
            System.out.println("moi ban lua chon ");
            luaChon = sc.nextInt();
            sc.nextLine();


            VdFile file = new VdFile("D:\\JAVA\\Thu-Muc");
            switch (luaChon) {

                case 1:
                    System.out.println(file.thuThi());
                    break;

                case 2:
                    System.out.println(file.coTheDoc());
                    break;

                case 3:
                    System.out.println(file.coTheGhi());
                    break;

                case 4:
                    System.out.println(file.DuongDan());
                    break;

                case 5:
                    System.out.println(file.TenFile());
                    break;

                case 6:
                    file.KTfile();
                    break;

                case 7:
                    file.InDanhSachFileCon();
                    break;
                case 8:
                    file.inCayThuMuc(file.getFile(), 0);
                    break;

                case 0:
                    System.out.println("Tam biet!");
                    break;

                default:
                    System.out.println("Lua chon khong hop le!");
            }


        } while (luaChon != 0);

    }
}
