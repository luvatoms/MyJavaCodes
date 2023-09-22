package QQps;
public class OOPs {// class and objects

    public static void main(String args[]) {
        Pen p1 = new Pen();// created a pen object called p1
        p1.Setcolor("blue");
        p1.Settip(8);
        System.out.println(p1.color);
        System.out.println(p1.tip);
    }
}

 class Pen {// properties or functions dalengai isme
     String color;
int tip;

    void Setcolor(String newcolor) {
        color = newcolor;

    }

    void Settip(int newtip) {
        tip = newtip;
    }

}
