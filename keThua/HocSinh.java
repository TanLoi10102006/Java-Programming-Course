import java.util.Scanner;
public class HocSinh extends ConNguoi {
    private String lop;
    private String truong;

    public HocSinh(String hoTen, int tuoi, String lop, String truong) {
        super(hoTen, tuoi); // gọi constructor của lớp cha ConNguoi
        this.lop = lop;
        this.truong = truong;
    }
    public HocSinh (){
        super();
        this.lop = "";
        this.truong = "";
    }
    public void Nhap() {
        super.Nhap(); // gọi phương thức Nhap() của lớp cha ConNguoi để nhập họ tên và tuổi
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập lớp: ");
        lop = sc.nextLine();
        System.out.print("Nhập trường: ");
        truong = sc.nextLine();
    }
    @Override
    public String toString() {
        return "HocSinh{" + "hoTen='" + getHoTen() + '\'' + ", tuoi=" + getTuoi() + ", lop='" + lop + '\'' + ", truong='" + truong + '\'' + '}';
    }
    

    
    public String getLop() {
        return lop;
    }

    public String getTruong() {
        return truong;
    }
    public void LamBaiTap(){
        System.out.println( " đang làm bài tập.");
    }
}