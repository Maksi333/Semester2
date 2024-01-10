package opgave2;

public interface Bag {

    public void add(String s);
    public void remove(String s);
    public default int getCount(String s){
        int count = 0;
        return count;
    }
}
