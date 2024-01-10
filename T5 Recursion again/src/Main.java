import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        System.out.println(factorial(5));
        System.out.println(power(5, 5));
        System.out.println(prod(4, 4));
        System.out.println(prodRus(4,4));
        System.out.println(reverse("reverse"));

        scanDir("C:\\Users\\simon\\Documents\\GitHub\\Semester2\\T5 Recursion\\src\\Files");

        System.out.println(euclidsAlgo(210,45));

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

    //opgave 5

    public static void scanDir(String path){
        File file = new File(path);
        File[] files = file.listFiles();

        if(file == null){
            System.out.println("No file found");
        }else{
            for (File f : files){
                if(f.isDirectory()){
                    System.out.println(f.getAbsolutePath());
                    scanDir(f.getAbsolutePath());
                }else{
                    System.out.println(f.getAbsolutePath());
                }
            }
        }
    }

    //opgave6 -- Husk returns når du kalder den rekursive metode
    public static int euclidsAlgo(int a, int b){
        int r = 0;

        if(a%b != 0){
            if(a < b){
                r = b%a;
                return euclidsAlgo(a,r);
            }else{
                r = a%b;
                return euclidsAlgo(r,b);
            }
        }else if (a%b == 0){
            return b;
        }
        return b;
    }

    //opgave 7

}