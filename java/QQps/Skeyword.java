package oorienpro;



public class Skeyword {//static keyword mai kisi bhi class ya object mai agr changes hue toh vo sbhi mai change ho jaega 
    public static void main(String args[]){
        Student s1 = new Student();
        s1.schoolName = " kmv";
        Student s2 = new Student();
        
        Student s3 = new Student();
        s3.schoolName = "dav";
        System.out.println(s2.schoolName);

    }
    
} 
class Student{
    String name;
    int roll;
    static String schoolName;
    void setName(String name){
        this.name = name;

    }
    String getName(){
        return this.name;
    }
}