import java.io.File;

public class Xoa {
    public static void xoaFile(File fx) {
        if (fx.isFile()) {
            // Xóa nếu là tập tin
            fx.delete();
        } else if (fx.isDirectory()) {
            File[] mangCon = fx.listFiles();
            for (File f : mangCon) {
                // xóa các file con
                xoaFile(f);

            }
            // xóa bản thân thư mục sau khi đã xóa các file con
            fx.delete();
        }
    }

    public static void main(String[] args) {
        File fo = new File("D:\\JAVA\\Thu-Muc\\ccc");
        File f1 = new File("D:\\JAVA\\Thu-Muc\\ccc\\c2");
        File f2 = new File("D:\\JAVA\\Thu-Muc\\ccc\\c3");

        xoaFile(fo);


    }

}
