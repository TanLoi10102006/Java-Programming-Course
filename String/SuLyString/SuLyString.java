public class SuLyString {
    public static void main(String[] args) {

        String s1 = "Doan Tan ";
        String s2 = "Loi";
        String s3 = s1 + s2;
        // Hàm concat: Cộng 1 chuỗi lại
        String s4 = s1.concat(s2); // s1 và s2 k bị thay đổi
        System.out.println("s3 la " + s3);
        System.out.println("s4 la " + s4);

        // Hàm replace => thay thế ;
        System.out.println("ham replace");
        String s5 = "loi.vn";
        System.out.println("chuoi sau khi thay the " + s5.replace("l", "c"));
        String s6 = s5.replaceAll("vn", "hu");
        System.out.println("chuoi sau thay the " + s6);
        System.out.println("chuoi s5 van giu nguyen " + s5);

        // toLowerCase => chuyển chữ hoa thành chữ thường
        // toUpperCase => chuyển chữ thường thành chữ viết hoa

        String chuThuong = "DOAN TAN LOI DEP TRAI";
        System.out.println("chu khi duoc chuyen tu hoa sang thuong la  " + chuThuong.toLowerCase());
        String chuHoa = "loi hot boy ";
        System.out.println("chu sao khi duoc viet hoa la: " + chuHoa.toUpperCase());


        // Trim => cắt khoảng trắng

        String khoangTrang = "  Doan Tan loi   ";
        System.out.println("chuoi sao khi cat khoan trang la: " + khoangTrang.trim());

        // Hàm Subtring => cắt chuỗi con;

        String s7 = "xin chao cac ban minh la doan tan loi";
        String s8 = s7.substring(10);
        System.out.println("chuoi sao khi cat la:" + s8);
        System.out.println(s7.substring(10, 15));



    }
}
