import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String str;
        String str2="";
        char chr;
        Scanner stdin = new Scanner(System.in);
        System.out.println("Hello, type something plz");
        str = stdin.next();
        int i;
        for(i=0;i<str.length();i++){
            chr = str.charAt(i);
            str2 = chr + str2;
        }
        System.out.println(str2);


    }


    }