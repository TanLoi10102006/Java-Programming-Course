
import java.util.Scanner;

public class date {

    private int day;
    private int month;
    private int year;

    public date(int day, int month, int year) {
        if (day > 0 && day <= 31 && month > 0 && month <= 12 && year > 0) {
            this.day = day;
            this.month = month;
            this.year = year;
        } else {
            System.out.println("Ngày, tháng hoặc năm không hợp lệ. Vui lòng nhập lại.");

        }
    }

    public date() {
        this.day = 0;
        this.month = 0;
        this.year = 0;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int d) {
        if (d > 0 && d <= 31) {
            this.day = d;
        } else {
            System.out.println("Ngày không hợp lệ. Vui lòng nhập lại.");
        }
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int M) {
        if (M > 0 && M <= 12) {
            this.month = M;
        } else {
            System.out.println("Tháng không hợp lệ. Vui lòng nhập lại.");
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int y) {
        if (y > 0) {
            this.year = y;
        } else {
            System.out.println("Năm không hợp lệ. Vui lòng nhập lại.");
        }
    }

    public void Nhap() {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Nhập ngày: ");
            day = sc.nextInt();
        } while (day <= 0 || day > 31);

        do {
            System.out.print("Nhập tháng: ");
            month = sc.nextInt();
        } while (month <= 0 || month > 12);

        do {
            System.out.print("Nhập năm: ");
            year = sc.nextInt();
        } while (year <= 0);
    }

    public void displayDate() {
        System.out.println("Ngày: " + day + "/" + month + "/" + year);
    }

}
