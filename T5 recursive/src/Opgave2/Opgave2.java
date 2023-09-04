package Opgave2;

import java.io.File;
import java.nio.file.Path;
import java.util.ArrayList;

import static com.sun.tools.attach.VirtualMachine.list;
import static java.nio.file.Files.isDirectory;

public class Opgave2 {
    public static void main(String[] args) {

       // System.out.println(power(3,3));
        System.out.println(power2(3,3));

        System.out.println(prod(3,3));
        System.out.println(prodRus(3,3));
        System.out.println(reverse("RANSLIRPA"));


        scanDir("C:\\Users\\simon\\IdeaProjects\\Semester2\\T5 recursive\\src\\Opgave2\\Files");


    }
    /* public static int power(int n, int p){
        int result;
        if(p == 0){
            return 1;
        }else{
        result = power(n,p-1)*n;

        }
        return result;
    }

     */

    public static int power2(int n, int p){
        if(p == 0){
            return 1;
        }else if(p >= 0 && p%2 == 1) {
            return power2(n, p - 1) * n;
        }else {
            return power2(n*n,p/2);
        }
    }

    public static int prod(int a, int b){
        if(a == 0){
            return 0;
        }else {
            return prod(a-1,b)+b;
        }
    }

    public static int prodRus(int a, int b){
        if(a == 0){
            return 0;
        } else if(a < 0 && a%2 == 0){
            return prod(a/2,2*b);
        }else{
            return prod(a-1, b)+b;
        }
    }
    public static String reverse(String s) {

        String result = "";
        if (s.length() == 0) {
            return result = "";
        } else {
            s.charAt(s.length() - 1);
            return result += s.substring(s.length()-1)+ reverse(s.substring(0,s.length()-1));
        }

    }
    public static void scanDir(String path){
        File root = new File(path);
        File[] list = root.listFiles();

        if(path == null){
            System.out.println("No path found");
        }else{
            for (File f : list){
                if(f.isDirectory()){
                    System.out.println(f.getAbsolutePath());
                    scanDir(f.getAbsolutePath());
                }else{
                    System.out.println(f.getAbsolutePath());
                }
            }
        }
    }
}
