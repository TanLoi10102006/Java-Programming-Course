
import java.io.BufferedReader;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Scanner;

public class DocDuLieu {
    public static void main(String[] args) {
        try {
            // BufferedReader: chỉ nhận Path không nhận String
            BufferedReader rd = Files.newBufferedReader(Path.of("D:\\JAVA\\File-De-VD\\h1.txt"),
                    StandardCharsets.UTF_8);
            String line = null;
            while (true) {
                line = rd.readLine(); // redLine(): đọc 1 dòng văn bản
                if (line == null) {
                    break;

                } else {
                    System.out.println(line);
                }

            }


        } catch (Exception e) {
            e.printStackTrace();
        }

        // cách 2: sử dụng readAllLines
        System.out.println("=============");
        try {
            List<String> allText = Files.readAllLines(Path.of("D:\\JAVA\\File-De-VD\\h2.txt"),
                    StandardCharsets.UTF_8);
            for (String line : allText) {
                System.out.println(line);

            }


        } catch (Exception e) {
            e.printStackTrace();
        }


        // cách 3 : sử dụng Scanner
        System.out.println("===================");
        File f0 = new File("D:\\JAVA\\File-De-VD\\h1.txt");
        try {
            Scanner sc = new Scanner(f0);
            while (sc.hasNext()) { // hasNext (): kiểm tra coi dữ liệu còn để đọc không
                String Line = sc.nextLine();
                System.out.println(Line);

            }
            sc.close();


        } catch (Exception e) {
            e.printStackTrace();
        }

        // in từng kí tự
        try {

            Scanner sc = new Scanner(f0);
            while (sc.hasNext()) {
                String L = sc.nextLine();
                for (int i = 0; i < L.length(); i++) {
                    char ch = L.charAt(i);
                    int code = (int) ch;
                    System.out.println("ky tu " + ch + " bang ma unicode " + code);

                }

            }
            sc.close();

        } catch (Exception e) {
            e.printStackTrace();
        }



    }

}
