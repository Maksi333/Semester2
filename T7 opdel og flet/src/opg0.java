import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class opg0   {
    public static ArrayList<Integer> numbers = new ArrayList<>();

    public static void main(String[] args) {
        Collections.addAll(numbers,1,2,3,4,5,6,7);
        System.out.println(sum(numbers));

        //int sum2 = sumarraylist(numbers,0);
        //System.out.println(sum2);


    }
    public static int sum(ArrayList<Integer> numbers){
        return sum(numbers,0, numbers.size()-1);
    }
    private static int sum(ArrayList<Integer> numbers, int low, int high){
        int sum = 0;
        if(low == high){
            return numbers.get(low);
        }else{
            int middle = (low+high)/2;
            int sum1 = sum(numbers, low, middle);
            int sum2 = sum(numbers,middle+1,high);
            return sum1 + sum2;
        }
    }


/*public static int sumarraylist(ArrayList<Integer> numbers, int index){
       if(index == numbers.size()){
           return 0;
       }else{
           return numbers.get(index) + sumarraylist(numbers , index + 1);
       }
}

 */

}
