import java.util.Scanner;
public class ConNguoi{
    private String hoTen;
    private int tuoi;

    public ConNguoi(String hoTen, int tuoi) {
        this.hoTen = hoTen;
        this.tuoi = tuoi;
    }
    public ConNguoi() {
        this.hoTen = "";
        this.tuoi = 0;
    }
    public void Nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập họ tên: ");
        hoTen = sc.nextLine();
        System.out.print("Nhập tuổi: ");
        tuoi = sc.nextInt();
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    @Override
    public String toString() {
        return "ConNguoi{" + "hoTen='" + hoTen + '\'' + ", tuoi=" + tuoi + '}';
    }

    public void an() {
        System.out.println( " đang ăn.");
    }
    public void ngu() {
        System.out.println( " đang ngủ.");
    }
    public void Uong () {
        System.out.println( " đang uống.");
    }
}