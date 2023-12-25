import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        System.out.println(factorial(5));
        System.out.println(power(5, 5));
        System.out.println(prod(4, 4));
        System.out.println(prodRus(4,4));
        System.out.println(reverse("reverse"));

    }

    //Opgave1
    public static int factorial(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    //opgave2
    public static int power(int n, int p) {
        if (p == 0) {
            return 1;
        } else {
            return n * power(n, p - 1);
        }
    }

    //opgave3
    public static int prod(int a, int b) {
        if (b == 0) {
            return 0;
        } else {
            return a + prod(a, b - 1);
        }
    }

    public static int prodRus(int a, int b) {
        if (a == 0) {
            return 0;
        } else if (a % 2 == 0) {
            int halfA = a / 2;
            int doubleB = b * 2;
            return prodRus(halfA, doubleB);
        } else {
            int reducedA = a - 1;
            return prodRus(reducedA, b) + b;
        }
    }

    //opgave4 Fuck recursion

    public static String reverse(String s){
        if(s.isEmpty() || s.length() == 1){
            return s;
        }else{
            char firstChar = s.charAt(0);
            String restOfString = s.substring(1);
            return reverse(restOfString) + firstChar;
        }
    }
}