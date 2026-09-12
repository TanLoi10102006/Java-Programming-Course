public class VDSoSanhString {
    public static void main(String[] args){
        String s1="tanloi.vn";
        String s2="TANLOI.VN";
        String s3="tanloi.vn";

        // Hàm equals => so sáng 2 chuỗi, có phân biệt hoa với thường
        System.out.println("so sanh s1 va s2:"+s1.equals(s2));
        System.out.println("so sanh s1 va s3 "+s1.equals(s3));


        // Hàm eqalsIgnore=> so sánh 2 chuỗi k phân biệt hpa thường 
        System.out.println("ham equalsIgnore");
        System.out.println("so sanh s1 va s2:"+s1.equalsIgnoreCase(s2));
        System.out.println("so sanh s1 va s3 "+s1.equalsIgnoreCase(s3));


        // Hàm compareTo => so sánh kiểu: > < = ;
        System.out.println("so sanh compareTo");
        String sv1="Nguyễn văn A";
        String sv2="Nguyễn Văn B";
        String sv3="Nguyễn Văn";
        String sv4="Nguyễn Văn A";
        System.out.println("sv1 so voi sv2"+" "+sv1.compareTo(sv2));
        System.out.println("sv1 so sanh voi sv3"+" "+sv1.compareTo(sv3));
        System.out.println("sv1 so sanh voi sv4"+" "+sv1.compareTo(sv4));

        // Hàm compareToIgnoreCase => Không phân biệt hoa thường ;
        System.out.println("so sanh compareToIgnoreCase");
        System.out.println("sv1 so voi sv2"+" "+sv1.compareToIgnoreCase(sv2));
        System.out.println("sv1 so sanh voi sv3"+" "+sv1.compareToIgnoreCase(sv3));
        System.out.println("sv1 so sanh voi sv4"+" "+sv1.compareToIgnoreCase(sv4));


        // Hàm regionMatches => so sánh 1 đoạn trong chuỗi
        // boolean regionMatches(vị trí bắt đầu chuỗi góc , chuỗi so sánh , vị trí bắt đầu trong chuỗi kia , số ký tự cần so sánh );
        String url = "https://facebook.com/profile";
        String face="facebook";
        boolean isFacebook = url.regionMatches(8, face, 0, 8);
        System.out.println(isFacebook); // true

        // Hàm starWith => Hàm kiểm tra chuỗi bắt đầu bằng
        System.out.println("kiem tra startsWith");
        String sdt="0393924965";
        System.out.println("so dien thoai co bat dau bang 03 "+sdt.startsWith("03"));

        // Hàm endWith => Hàm kiểm tra chuỗi kết thúc ;
        System.out.println("kiem tra endWith");
        String tenFile="I love you.PDF";
        if(tenFile.endsWith(".PDF")){
            System.out.println("file cua ban la 1 file PDF");
        }else{
            System.out.println("file cua ban k phai la file PDF");
        }

    }
}