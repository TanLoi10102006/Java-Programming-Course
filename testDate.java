public class testDate {
    public static void main(String[] args) {
        date myDate = new date();
        myDate.Nhap();
        myDate.displayDate();
        System.out.println("Giá trị tháng bạn nhập là: " + myDate.getMonth());
        System.out.println("=========================================");

        
        date anotherDate = new date(-9, 8, 2022); // xuất hiện lỗi do ngày không hợp lệ
        anotherDate.displayDate();
        System.out.println("=========================================");

        date yetAnotherDate = new date();
        yetAnotherDate.setMonth(13); // xuất hiện lỗi do tháng không hợp lệ
        yetAnotherDate.displayDate();

    }
}