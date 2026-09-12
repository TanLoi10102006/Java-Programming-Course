public class Bird extends Animal {
    public Bird(String name) {
        super(name);
    }

    // Overriding the makeSound method
    @Override
    public void eat () {
        System.out.println("tôi ăn hạt ");
    }

    @Override
    public void makeSound() {
        System.out.println("hót hót");
    }
    
}