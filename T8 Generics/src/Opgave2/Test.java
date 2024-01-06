package Opgave2;

import java.util.Collections;
import java.util.HashSet;

public class Test <E, T > {

    private HashSet<E> set1;
    private HashSet<E> set2;

    public Test (){

    }

    //Addall samler alle elementer i et set, udelader dublikater
    public HashSet<T> union(HashSet<? extends T> set1, HashSet<? extends T> set2){
        HashSet<T> result = new HashSet<>(set1);
        result.addAll(set2);
        return result;
    }

    //removeAll fjerner alle elementer fra set 2, samt hvis der er dublikator fra set 1
    //Så hvis "doggo" fremgår i begge lister, kommer den ikke med, men hvis den kun er i det første set kommer den med
    public HashSet<T> difference(HashSet<? extends T> set1, HashSet<? extends T> set2){
        HashSet<T> result = new HashSet<>(set1);
        result.removeAll(set2);
        return result;
    }

    //Retain all, beholder alle de elementer der fremgår i begge lister
    public HashSet<T> intersect(HashSet<? extends T> set1, HashSet<? extends T> set2){
        HashSet<T> result = new HashSet<>(set1);
        result.retainAll(set2);
        return result;
    }

    public HashSet<T> union3 (HashSet<? extends T> set1, HashSet<? extends T> set2, HashSet<? extends T> set3){
        HashSet<T> result = new HashSet<>(set3);
        result.addAll(set1);
        result.addAll(set2);
        return result;
    }


    @Override
    public String toString() {
        return "Test{" +
                "set1=" + set1 +
                ", set2=" + set2 +
                '}';
    }
}
