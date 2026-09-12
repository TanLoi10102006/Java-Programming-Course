public class Box2test {
    public static void main(String[] args) {
        Box2 b1 = new Box2<Integer>(15);
        System.out.println("gia tri " + b1.getValue());
        Box2 b2 = new Box2<String>("hello");
        System.out.println("gia tri " + b2.getValue());


    }
}
