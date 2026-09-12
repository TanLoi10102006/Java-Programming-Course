public class test {
    public static void main(String[] args) {
        ThoiKhoaBieu tkb1 = new ThoiKhoaBieu(DayOfWeek.Monday, "Toan,ly,hoa");
        ThoiKhoaBieu tkb2 = new ThoiKhoaBieu(DayOfWeek.Thursday, "su,dia,giao duc cong dan");
        System.out.println(tkb1);
        System.out.println("cac mon hoc la " + tkb1.getCacMonHoc());
        int x = Thang.Thang1.Days(); // note the parentheses
        System.out.println("Tháng 1 có " + x + " ngày.");

        DayOfWeek[] days = DayOfWeek.values(); // .values() trả về một mảng chứa tất cả các hằng số
        for (DayOfWeek day : days) {
            System.out.println(day);
        }
        for (DayOfWeek day : DayOfWeek.values()) {
            {
                System.out.println(day.ordinal()); // .ordinal() trả về vị trí của hằng số trong
            }
        }

    }
}
