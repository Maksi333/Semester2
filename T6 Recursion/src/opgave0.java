import java.util.ArrayList;
import java.util.Collections;

public class opgave0 {

    public static ArrayList<Integer> numbers = new ArrayList();
    public static void main(String[] args) {

        Collections.addAll(numbers,1,2,3,4,5,6,7,8,9);

        System.out.println(sum(numbers));

    }
    public static int sum(ArrayList<Integer> numbers){
        return sum(numbers, 0);
    }



    private static int sum(ArrayList<Integer> numbers, int index){
        int result = 0;
        if(index == numbers.size()){
            return 0;
            } else{
            int element = numbers.get(index);
            if(element % 2 == 0){
                result = 1 + sum(numbers, index+1);
            }
            else{
                result = sum(numbers, index+1);
            }
        }
        return result;
    }

    //recursion switch
    /*public static int calcNo(int n){
        return switch(n){
            case 0 -> 1;
            case 1 -> 2;
            case 2 -> 5;
            default -> (n% 2 == 0)
        }
    }

     */

}
