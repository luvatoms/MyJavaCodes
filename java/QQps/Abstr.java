package QQps;

public class Abstr {
    public static void main(String args[]) {
        Horse h = new Horse();
        Chicken c = new Chicken();
        h.eat();
        h.walk();
        h.color();

        System.out.println(h.color);// find out why it is showing null value not any color --> bcoz animal ke
                                    // constructor mai tha color define thats why

        System.out.println(c.color);// find out why it is showing null value not any color

        // Animal a = new Animal();//objext can not be created as we used abstract
        // keyword with animal
    }

}

abstract class Animal {
    String color;

    Animal() {// intitialisation of color to all children
        System.out.println("animal constructor called...");
    }

    void eat() {
        System.out.println("animal eats");
    }// yha jo walk hai bss idea de ra hai k walk krega but how it'll do that ye ni
     // bta ra implementation ni de ra bss idea

    abstract void walk();// ye yha pr implement ni hoga but ye baakio ke liye compulsory hoga ke isko
                         // implementation mai laao

}

class Horse extends Animal {
    Horse() {
        System.out.println("horse const called...");
    }

    void walk() {
        System.out.println("walk on 4 legs");
    }

    void color() {

    }

}

class Chicken extends Animal {
    void walk() {
        System.out.println("walks on 2 legs");
    }

    void Color() {
        this.color = "dark brown ";
    }
}