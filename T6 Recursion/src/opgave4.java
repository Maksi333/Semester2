import java.io.PrintWriter;

public class opgave4 {

    //REVERSE WORD USING RECURSION
    public static void main(String[] args) {
        printAnagrams("", "psykologia");
    }

    public static void printAnagrams(String prefix, String word){
        if (word.length() <=1){
            System.out.println(prefix + word);
        }else{
            for(int i = 0; i < word.length(); i++){
                String chosenLetter = String.valueOf(word.charAt(i));
                printAnagrams(prefix + chosenLetter, word.substring(0,i) + word.substring(i+1));
            }
        }
    }
}
