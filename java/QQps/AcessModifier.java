package oorienpro;
import java.util.*;

public class AcessModifier {
    public static void main(String args[]) {
        Bankacc bacc = new Bankacc();
        bacc.setusername("luvatoms");
        System.out.println(bacc.getusername());

        // bacc.username = "luvatoms";
        // System.out.println(bacc.username);
        // bacc.password = "whynot";//yha pr nhi pta isko password word kya cheez hai
        // qki ye private h
        // System.out.println(setpassword("hello"));//ye bhi nhi hoga iske liye nya
        // keyword use hoga which is get $set

        // getter and setter
        // yha pr agr hm private bhi kr de toh bhi get or set ki help se private values
        // ko change kiya ja ksta hai

    }

    public class Bankacc {
        private String username;
        private String password;
        private int accnum;

        String getusername() {
            return username;
        }

        int getaccnum() {
            return accnum;
        }

        String getpassword() {
            return password;
        }

        void setpassword(String pwd) {
            password = pwd;
        }

        void setusername(String usr) {// yha string q ni use kiya hmne
            username = usr;
        }

        void setaccnum(int ac) {
            accnum = ac;
        }
        // public String username;
        // private String password;//acess modifier private
        // void setpassword(String pwd){//defaut access modifier is default in java
        // password = pwd;
        // }
    }

}
