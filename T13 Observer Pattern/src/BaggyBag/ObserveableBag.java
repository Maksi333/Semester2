package BaggyBag;

import java.util.HashMap;
import java.util.Map;

public class ObserveableBag implements Bag{
    public int key = 0;

    private Map<Integer, String> stuff = new HashMap<>();
    @Override
    public void add(String s) {
        stuff.put(key, s);
        key++;
    }

    @Override
    public void remove(String s) {
        stuff.remove(s);
    }

    @Override
    public int getCount(String s) {
return 0;    }
}
