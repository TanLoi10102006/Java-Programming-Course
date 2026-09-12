public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    // Overriding the makeSound method
    @Override
    public void eat () {
        System.out.println("tôi ăn xương ");
    }

    @Override
    public void makeSound() {
        System.out.println("gâu gâu");
    }
    

   
}