
import java.util.Scanner;

public class SinhVien {
    private String MSV;
    private String HovaTen;
    private int namSinh;
    private double DiemTB;

    public SinhVien(String MSV, String HovaTen, int namSinh, double DiemTB) {
        this.MSV = MSV;
        this.HovaTen = HovaTen;
        this.namSinh = namSinh;
        this.DiemTB = DiemTB;

    }

    public SinhVien() {
        this.MSV = "";
        this.HovaTen = "";
        this.namSinh = 0;
        this.DiemTB = 0;
    }

    public void Nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi ban nhap MSV");
        MSV = sc.nextLine();
        System.out.println("Moi ban nhap ho ten ");
        HovaTen = sc.nextLine();
        System.out.println("moi ban nhap vao nam sinh");
        namSinh = sc.nextInt();
        System.out.println("moi ban nhap vao diem trung binh ");
        DiemTB = sc.nextDouble();
    }

    public void getMSV() {
        this.MSV = MSV;
    }

    public String setMSV() {
        return this.MSV;
    }

    public void getHovaTen() {
        this.HovaTen = HovaTen;
    }

    public String setHovaTen() {
        return this.HovaTen;
    }

    public void getnamSinh() {
        this.namSinh = namSinh;
    }

    public int setnamSinh() {
        if (this.namSinh > 0) {
            return this.namSinh;

        } else {
            return -1;
        }
    }

    public void getDiemTB() {
        this.DiemTB = DiemTB;

    }

    public double setDiemTB() {
        if (this.DiemTB > 0) {
            return this.DiemTB;
        } else {
            return -1;
        }
    }

    public void Xuat() {
        System.out.println("ma so sinh vien la  " + this.MSV);
        System.out.println("ten sinh vien la " + this.HovaTen);
        System.out.println("nam sinh " + this.namSinh);
        System.out.println("Diem trung binh la " + this.DiemTB);
    }
}


