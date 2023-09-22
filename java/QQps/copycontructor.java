package QQps;
public class copycontructor{
    //code is correct
    
    
        public static void main(String args[]) {
            Student s1 = new Student();
            s1.name = "lovely";
            s1.roll = 123;
            s1.marks[0] = 100;
            s1.marks[1] = 90;
            s1.marks[2] = 90;
            Student s2 = new Student(s1);
            // s1.marks[0] = 90;
            // s1.marks[1] = 80;
            s1.marks[2] = 60;
            for (int i = 0; i < 3; i++) {
                System.out.println(s2.marks[i]);
            }
        }
    }
    class Student {
        String name;
        int roll;
        String password;
        int marks[];
        Student(Student s1) {
            marks = new int[3];
            this.name = s1.name;
            this.roll = s1.roll;
            this.password = s1.password;
            for (int i = 0; i < marks.length; i++) {
                this.marks[i] = s1.marks[i];
            }
        }
        Student() {
            marks = new int[3];
            System.out.println("construction is called...");
    
         
    }}
    
 