
abstract class Animal{
    abstract void walk();
    public void eat(){
        System.out.println("can eat food");
    }

}

class Horse extends Animal {
    public void walk() {
        System.out.println("Wals on four legs");
    }
}

class Duck extends Animal {
    public void walk() {
        System.out.println("Wals on 2 legs");
    }
}


public class abstraction {
    public static void main(String [] args) {
        Horse horse = new Horse();
        horse.walk();
        Duck duck = new Duck();
        duck.walk();
        duck.eat();
    }

}
