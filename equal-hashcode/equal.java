public class equal {
    private int id;
    private String name;

    public equal(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true; // Kiểm tra nếu hai đối tượng là cùng một tham chiếu
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false; // Kiểm tra nếu đối tượng so sánh là null hoặc không cùng lớp
        }
        equal other = (equal) obj; // Ép kiểu đối tượng so sánh về lớp equal
        return id == other.id && name.equals(other.name); // So sánh các thuộc tính để xác định sự bằng nhau
    }

    @Override
    public int hashCode() {
        int result = Integer.hashCode(id); // Tính hash code dựa trên thuộc tính id
        result = 31 * result + name.hashCode(); // Kết hợp hash code của thuộc tính name
        return result; // Trả về hash code cuối cùng
    }
}