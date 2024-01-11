public class InsertionSort {
    public static void main(String[] args) {
        int[] intArray = new int[10];

        intArray[0] = 1;
        intArray[1] = 3;
        intArray[2] = 2;
        intArray[3] = 7;
        intArray[4] = 54;
        intArray[5] = 24;
        intArray[6] = 425;
        intArray[7] = 145;
        intArray[8] = 6;
        intArray[9] = 8;

        InsertionSort(intArray);
        for(int i = 0; i < intArray.length-1; i++){
            System.out.println(intArray[i]);
        }
    }


    public static void InsertionSort(int[] arr){
        //arr has a sorted part forllowed by an unsorted part
        //i is the index of the first number in the unsorted part
        for(int i = 1; i < arr.length; i++){
            int temp = arr[i];
            int j = i;
            while(j > 0 && temp < arr[j-1]){
                arr[j] = arr[j-1];
                j--;
            }
            arr[j] = temp;
        }
    }
}
