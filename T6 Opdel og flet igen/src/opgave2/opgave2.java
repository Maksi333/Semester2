package opgave2;

import java.lang.invoke.CallSite;
import java.util.ArrayList;
import java.util.List;

public class opgave2 {
    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<>();

        intList.add(0);
        intList.add(2);
        intList.add(3);
        intList.add(0);
        intList.add(0);
        intList.add(4);
        intList.add(0);
        intList.add(0);
        intList.add(5);
        intList.add(0);
        intList.add(0);

        System.out.println(callMethod(intList));

    }

    public static int callMethod(List<Integer> list){
        return countZeroes(list, 0, list.size()-1);
    }

    private static int countZeroes(List<Integer> list, int l, int r){

        if(l == r) {
            if (list.get(l) == 0) {
                return 1;
            } else {
                return 0;
            }
        }else{
            int counter = 0;
            int m = (l + r) /2;

            counter += countZeroes(list, l, m);
            counter += countZeroes(list, m+1, r);
            return counter;
        }
    }
}
