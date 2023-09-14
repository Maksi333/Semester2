import java.util.ArrayList;
import java.util.Collections;

public class opg2 {
    public static ArrayList<Integer> numbers = new ArrayList<>();

    public static void main(String[] args) {
        Collections.addAll(numbers, 8, 56, 45, 34, 15, 12, 34, 44);
        mergeSort(numbers);
        System.out.println(numbers);

    }


    public static void mergeSort(ArrayList<Integer> numbers){
        mergeSort(numbers,0,numbers.size()-1);
    }
    private static void mergeSort(ArrayList<Integer> numbers, int low, int high){
        if(low < high){
            int middle = (low + high)/2;
            mergeSort(numbers, low, middle);
            mergeSort(numbers,middle +1, high);
            merge(numbers,low,middle,high);
        }
    }

    private static void merge(ArrayList<Integer> numbers, int low, int middle, int high){
        ArrayList<Integer> temp = new ArrayList<>();
        int i1 = low;
        int i2 = middle+1;

        while(i1 <= middle && i2 <= high){

            if(numbers.get(i1) < numbers.get(i2)){
                temp.add(numbers.get(i1));
                i1++;
            }else{
                temp.add(numbers.get(i2));
                i2++;
            }

        }
        while(i1 <= middle){
            temp.add(numbers.get(i1));
            i1++;
        }
        while(i2 <= high){
            temp.add(numbers.get(i2));
            i2++;
        }
        for(int i = 0; i < temp.size(); i++){
            numbers.set(low+i,temp.get(i));
        }
    }
}
