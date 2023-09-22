package QQps;


public class INherit {//like our geans
    public static void main(String args[])

    {
    fish shark = new fish();
    shark.eat();
    }
}

class Animal {//all animals have same prop like ear breathe etc...
    String color;

    void eat() {
        System.out.println("eat");

    }

    void breathe() {
        System.out.println("breathes");
    }

}

// derived class
class fish extends Animal {//all fish has prop of animal' 
    int Fins;

    void swim() {
        System.out.println("swims in water");
    }

}