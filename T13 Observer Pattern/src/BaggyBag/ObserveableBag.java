package BaggyBag;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ObserveableBag implements Bag{
    public int key = 0;
    private Bag subject;

    private ArrayList<Observer> observers = new ArrayList<Observer>();
    private Map<String, Integer> stuff = new HashMap<>();
    @Override
    public void add(String s) {
        stuff.put(s, key);
        key++;
    }

    @Override
    public void remove(String s) {
        stuff.remove(s);
    }

    @Override
    public int getCount(String s) {
    return 0;
    }

    public void notifyOberservers(String s){
        for(Observer o : observers){

        }
    }
}
