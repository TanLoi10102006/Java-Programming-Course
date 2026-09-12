public class test{
    public static void main(String[] args) {
        Ngay ngaySinh1 = new Ngay(1, 1, 1990);
        Ngay ngaySinh2 = new Ngay(2, 2, 1995);
        Ngay ngaySinh3 = new Ngay(3, 3, 2000);
        TacGia tacGia1 = new TacGia("Nguyen Van A", ngaySinh1);
        TacGia tacGia2 = new TacGia("Tran Van B", ngaySinh2);
        TacGia tacGia3 = new TacGia("Le Van C", ngaySinh3);
        Sach sach1 = new Sach  ("Java Programming", 50000, 2020, tacGia1);
        Sach sach2 = new Sach("Python Programming", 60000, 2021, tacGia2);
        Sach sach3 = new Sach("C++ Programming", 70000, 2022, tacGia3);

        System.out.println(sach1);
        System.out.println(sach2);
        System.out.println(sach3);
        // gọi phương thức in tên sách
        sach1.inTenSach();
        sach2.inTenSach();
        sach3.inTenSach();
        // kiểm tra năm xuất bản
        System.out.println("Sach 1 và Sach 2 có cùng năm xuất bản không? " + sach1.kiemTraNamXuatBan(sach2));
         System.out.println("Sach 1 và Sach 3 có cùng năm xuất bản không? " + sach1.kiemTraNamXuatBan(sach3));   
        // tính giá sau khi giảm giá 10%
        System.out.println("Giá sau khi giảm giá 10% của Sach 1: " + sach1.giaSauGiamGia(10));
        System.out.println("Giá sau khi giảm giá 10% của Sach 2: " + sach2.giaSauGiamGia(10));
        System.out.println("Giá sau khi giảm giá 10% của Sach 3: " + sach3.giaSauGiamGia(10));

    }
}