package opgave3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class app {
    public static void main(String[] args) {
        ArrayList<Integer> listInt = new ArrayList<Integer>();
        Map<Integer, Integer> mapInts = new HashMap<>();
        listInt.add(2);
        listInt.add(5);
        listInt.add(5);
        listInt.add(23);
        listInt.add(4);
        listInt.add(1);
        listInt.add(6);
        listInt.add(78);

        mapInts.put(1,2);
        mapInts.put(3,4);
        mapInts.put(5,6);
        mapInts.put(7,8);




        Iterator<Integer> Iterator = listInt.iterator();

        if(Iterator.hasNext()){
            System.out.println(listInt);
        }

        Iterator<Integer> Iterator2 = mapInts.values().iterator();
        if(Iterator2.hasNext()){
            System.out.println(mapInts);
        }


    }
}
