public class VDTimKiemString {
    public static void main(String[] args) {
        String s1 = "xin chao co chu, xin chao cac ban,xin chao co chu! ";
        String s2 = "co chu";
        String s3 = "Xin Chao 123";
        char s4 = 'o';

        // Hàm indexOf: tìm kiếm vị trí
        System.out.println("vi tri cua s2 trong s1 la " + s1.indexOf(s2));
        System.out.println("vi tri cua s3 trong s1 la " + s1.indexOf(s3));

        // Sử dụng vị trí bắt đầu
        System.out.println("vi tri cua s2 trong s1 la: " + s1.indexOf(s2, 13));

        // tìm kiếm char
        System.out.println("vi tri cua s4 trong s3 la " + s3.indexOf(s4));
        System.out.println("vi tri cua s4 trong s3 la " + s3.indexOf(s4, 8));

        // Hàm lastIndexOf: Tìm vị trí cuối
        String s = "banana";
        int index = s.lastIndexOf('a');
        System.out.println(index);

        // Sử dụng vị trí kết thúc 
        String s5 = "abc abc abc";
        int index5 = s5.lastIndexOf("abc", 7);
        System.out.println(index5);


    }
}