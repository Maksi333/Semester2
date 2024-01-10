package opave1;

import java.util.ArrayList;
import java.util.List;

public class opgave1 {
    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(2);
        intList.add(3);
        intList.add(1);
        intList.add(4);
        intList.add(6);
        intList.add(23);
        intList.add(54);
        intList.add(5);
        intList.add(7);

        System.out.println(max(intList));
        System.out.println(totalis(intList));
    }

    public static int max(List<Integer> list){
        return maximum(list,0, list.size()-1);
    }
    public static int totalis(List<Integer> list){
        return total(list,0, list.size()-1);
    }


    private static int maximum(List<Integer> list1, int l, int r){

        if(l == r){
            return list1.get(l);
        }else{
            int m = (l + r) / 2;
            int max1 = maximum(list1,l,m);
            int max2 = maximum(list1, m + 1, r);
            if(max1 > max2){
                return max1;
            }else{
                return max2;
            }
        }
    }

    private static int total(List<Integer> list, int l, int r){
        int result = 0;
        if(l == r){
            return list.get(l);
        }else{
            int m = ( l + r) /2;
            result += total(list, l , m);
            result += total(list, m+1 , r);
        }
        return result;
    }
    //Base Case: If the range specified by l and r has only one element (i.e., l == r), the function returns the value of that element from the list. This is the base case that terminates the recursion.
    //
    //Recursive Case: If the range has more than one element, the function calculates the middle index m of the range. Then, it recursively calls itself for the left half of the range (l to m) and the right half of the range (m + 1 to r). The results of these recursive calls are added to the result variable.
    //
    //The final result is the sum of all the elements in the specified range.
    //
    //This code essentially implements a divide-and-conquer approach to calculate the sum of elements in a list within a given range. The idea is to split the range into smaller halves until it reaches the base case of a single element, and then combine the results of the smaller subproblems to get the overall sum.

}
