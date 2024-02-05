import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int a,b,c,d=0;
        Scanner stdin = new Scanner(System.in);
        System.out.println("Hello and welcome!");
        System.out.println("Enter 3 integers one after the other plz");
        a=stdin.nextInt();
        b=stdin.nextInt();
        c=stdin.nextInt();
        if (a >= b) {
            if (a >= c) {
                d = a;
            } else {
                d = c;
            }
        } else {
            if (b >= c) {
                d = b;
            } else {
                d = c;
            }
        }
        System.out.println("largest integer is "+d);
    }
}