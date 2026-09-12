public class Animal {
    protected String name;
    public Animal(String name) {
        this.name = name;
    }
    public String getNam(){
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public void eat () {
        System.out.println(name + " is eating.");
    }
    public void makeSound() {
        System.out.println(".................");
    }
    public void sleep() {
        System.out.println( " zzzzzzzzzzzzzz");
    }
}