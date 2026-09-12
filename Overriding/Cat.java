public class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    // Overriding the makeSound method
    @Override
    public void eat () {
        System.out.println("tôi ăn cá ");
    }

    @Override
    public void makeSound() {
        System.out.println("meo meo");
    }
    
}