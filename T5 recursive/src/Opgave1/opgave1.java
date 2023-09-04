package Opgave1;

public class opgave1 {
    public static void main(String[] args) {
        System.out.println(factorial(5));

    }


    public static int factorial(int n){
        int result;
        if(n == 1){
            return 1;
        } else {
            return result = n * factorial(n-1);
        }

    }
}
