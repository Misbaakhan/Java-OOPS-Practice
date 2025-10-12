
class Animal {
    void sound() {
        System.out.println("animals make sound");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
       super.sound();
    }

    void Meow() {
         System.out.println("Cat Meows");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        super.sound();
    }

    void bark() {
        System.out.println("barking");
    }
}

public class Upcasting {
    public static void main(String[] args) {
        Animal a = new Cat();    //Upcasting
        a.sound();
        Cat c = (Cat) a;        //downcasting
        c.Meow();
        c.sound();
        Animal a1 = new Dog();
        a1.sound();
        Dog d = (Dog) a1;
        d.bark();
        d.sound();
    }

}
