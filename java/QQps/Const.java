package oorienpro;

public class Const {
    public static void main(String args[]) {
        //parameter dekh kr call hoga constructor
        Student s1 = new Student("lovely");// making new student object with the help of constructor
        System.out.println(s1.name);
        Student s2 = new Student(123);
        Student s3 = new Student();// this is by default cons if not any other constructor is exist
    }
}

class Student {
    String name;
    int roll;

    // parameterises constructor//
    Student(String name) {// constructor for initialisation
        this.name = name;
    }

    Student() {// non paramaterised const.
        System.out.println("construction is called...");
    }

    Student(int roll) {// parametrised cons.
        this.roll = roll;
    }
}