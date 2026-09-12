public class ThoiKhoaBieu {
    private DayOfWeek thu;
    private String cacMonHoc;

    public ThoiKhoaBieu(DayOfWeek thu, String cacMonHoc) {
        this.thu = thu;
        this.cacMonHoc = cacMonHoc;

    }

    public DayOfWeek getthu() {
        return thu;
    }

    public void setThu() {
        this.thu = thu;
    }

    public String getCacMonHoc() {
        return cacMonHoc;
    }

    public void setCacMonHoc() {
        this.cacMonHoc = cacMonHoc;
    }

    @Override
    public String toString() {
        return "thoi khoa bieu [thu=" + thu + ",cacMonHoc=" + cacMonHoc + "]";
    }
}
