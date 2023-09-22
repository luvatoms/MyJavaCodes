package oorienpro;

public class GetSet {

    public static void main(String[] args) {
        Pen p1 = new Pen(); // created a pen object called p1
        p1.setColor("blue");
        p1.setTip(8);
        System.out.println(p1.getColor());
        System.out.println(p1.getTip());
    }
}

class Pen { // properties or functions dalengai isme
    private String color;
    private int tip;

    String getColor() {//yha variable ka phla letter must be capital 
        return this.color;
    }

    int getTip() {
        return this.tip;
    }

    void setColor(String newColor) {
        this.color = newColor;
    }

    void setTip(int tip) {
        this.tip = tip;
    }
}
