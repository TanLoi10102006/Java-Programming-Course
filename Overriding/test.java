public class test {
    public static void main(String[] args) {
        Animal myDog = new Dog("Buddy");
        Animal myCat = new Cat("Whiskers");
        Animal myBird = new Bird("Tweety");
        System.out.println("test dog "); 
        myDog.eat(); // Output: tôi ăn xương
        myDog.makeSound(); // Output: gâu gâu
        myDog.sleep();
        System.out.println("test cat "); 
        myCat.eat(); // Output: tôi ăn cá
        myCat.makeSound(); // Output: meo meo
        myCat.sleep();
        System.out.println("test bird "); 
        myBird.eat(); // Output: tôi ăn hạt
        myBird.makeSound(); // Output: hót hót
        myBird.sleep();
    }
}