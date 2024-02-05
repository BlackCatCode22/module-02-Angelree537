import java.util.Scanner;
public class Main {
    public static void getAnIntFromTheUser(int a){
        System.out.println(a);
    }
    public static void compareTwoInts(int a, int b){
        if (a>b){
            System.out.println("The largest number is "+a);
        }
        else System.out.println("The largest number is "+b);
    }
    public static void sumTwoInts(int a, int b){
        System.out.println(a+b);
    }
    public static void main(String[] args) {
        int a,b,c,d,e;
        Scanner stdin = new Scanner(System.in);
        System.out.println("Hello, type an integer plz");
        a=stdin.nextInt();
        getAnIntFromTheUser(a);
        System.out.println("Hello, type 2 integers plz one after the other");
        b=stdin.nextInt();
        c=stdin.nextInt();
        compareTwoInts(c,b);
        System.out.println("Hello, type 2 integers plz one after the other");
        d=stdin.nextInt();
        e=stdin.nextInt();
        sumTwoInts(d,e);
    }

}