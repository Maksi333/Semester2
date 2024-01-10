package opgave4;

import java.io.*;
import java.util.Scanner;
import java.util.TreeSet;

public class app {


    private static File file = new File("C:\\Users\\simon\\Documents\\GitHub\\Semester2\\T9 Sets\\src\\opgave4\\Gjoengehoevdingen.txt");

    public static void main(String[] args) {
       TreeSet<String> treeSet = new TreeSet<>();

       try(BufferedReader br = new BufferedReader(new FileReader(file))){
           String line;
           while((line = br.readLine()) != null){
               String[] words = line.split("\\s+");

               for(String word : words){
                   treeSet.add(word.toLowerCase());
               }
           }
       } catch (IOException e){
           e.printStackTrace();
       }
        System.out.println("unique words in the set:");
       for(String word : treeSet){
           System.out.println(word);
       }
        System.out.println("\nTotal number of words: " + treeSet.size());
        System.out.println("number of differend words: " + treeSet.size());
    }


}
