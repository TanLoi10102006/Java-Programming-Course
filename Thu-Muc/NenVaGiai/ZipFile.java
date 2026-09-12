package NenVaGiai;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

public class ZipFile {
    public static void main(String[] args) throws FileNotFoundException {
        String sourceFile = "sinhvien.txt";
        String fileZip = "sinhvien.zip";
        try {
            FileOutputStream ww = new FileOutputStream(sourceFile);
            ww.write("ma sv 25110600063\n".getBytes());
            ww.write("tên: Đoàn Tấn Lợi".getBytes());
            System.out.println("da tao file goc " + sourceFile);
            ww.close();
        } catch (Exception e) {
            System.out.println(".loi ghi file");
            e.printStackTrace();
        }

        // nén file
        try {
            FileInputStream fis = new FileInputStream(sourceFile);
            FileOutputStream fos = new FileOutputStream(fileZip);
            ZipOutputStream zos = new ZipOutputStream(fos);
            ZipEntry entry = new ZipEntry(sourceFile);
            zos.putNextEntry(entry);


            byte[] buffer = new byte[1024];
            int length;
            while ((length = fis.read(buffer)) != -1) {
                zos.write(buffer, 0, length);
            }

            zos.closeEntry();
            fis.close();
            zos.close();


        } catch (Exception e) {
            System.out.println("loi nen file");
            e.printStackTrace();
        }
        // =======================
        // GIẢI NÉN FILE


        String fileGiaiNen = "sinhvien.zip";
        String thuMucGiaiNen = "GiaiNen";

        try {
            // Tạo thư mục GiaiNen nếu chưa có
            File folder = new File(thuMucGiaiNen);

            if (!folder.exists()) {
                folder.mkdir();
            }

            // Mở file ZIP
            FileInputStream fis = new FileInputStream(fileGiaiNen);

            // Tạo luồng giải nén
            ZipInputStream zis = new ZipInputStream(fis);

            // Lấy file bên trong ZIP
            ZipEntry entry = zis.getNextEntry();

            while (entry != null) {

                System.out.println("Đang giải nén: " + entry.getName());

                // Tạo file đích
                FileOutputStream fos =
                        new FileOutputStream(thuMucGiaiNen + File.separator + entry.getName());

                byte[] buffer = new byte[1024];

                int length;

                // Đọc dữ liệu từ ZIP
                while ((length = zis.read(buffer)) != -1) {

                    // Ghi dữ liệu ra file
                    fos.write(buffer, 0, length);
                }

                fos.close();

                // Đóng entry hiện tại
                zis.closeEntry();

                // Lấy entry tiếp theo
                entry = zis.getNextEntry();
            }

            zis.close();
            fis.close();

            System.out.println("Đã giải nén thành công!");

        } catch (Exception e) {
            System.out.println("Lỗi giải nén file");
            e.printStackTrace();
        }



    }

}
