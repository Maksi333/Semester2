import java.util.ArrayList;
import java.util.Collections;

public class opg1 {

    public static ArrayList<Integer> numbers = new ArrayList<>();
    public static void main(String[] args) {
        Collections.addAll(numbers, 0,2,0,30,4,0,20,10,40,0,0,0);
        System.out.println(countZeros(numbers));

    }
    public static int countZeros(ArrayList<Integer> numbers){
        return countZeros(numbers, 0, numbers.size()-1);
    }

    private static int countZeros(ArrayList<Integer> number, int low, int high){
        if(low == high){
            if(numbers.get(low) == 0) {
                return 1;
            }else{
                return 0;
                }
        }else{
            int middle = (low + high)/2;
            int count1 = countZeros(numbers, low, middle);
            int count2 = countZeros(numbers,middle+1, high);
            return count1 + count2;
        }

    }
}
