public class testEqual {
    public static void main(String[] args) {
        equal obj1 = new equal(1, "Alice");
        equal obj2 = new equal(1, "Alice");
        equal obj3 = new equal(2, "Bob");

        // Kiểm tra phương thức equals()
        System.out.println("obj1.equals(obj2): " + obj1.equals(obj2)); // true
        System.out.println("obj1.equals(obj3): " + obj1.equals(obj3)); // false

        // Kiểm tra phương thức hashCode()
        System.out.println("obj1.hashCode(): " + obj1.hashCode());
        System.out.println("obj2.hashCode(): " + obj2.hashCode());
        System.out.println("obj3.hashCode(): " + obj3.hashCode());
    }
}