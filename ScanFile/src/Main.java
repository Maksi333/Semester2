import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(scanFileInt());
    }

    public static ArrayList<Integer> scanFileInt() {
        File file = new File("C:\\Users\\simon\\Documents\\GitHub\\Semester2\\ScanFile\\src\\int");
        ArrayList<Integer> result = new ArrayList<>();
        try(Scanner scanner = new Scanner(file)){
            while(scanner.hasNextInt()){
                result.add(scanner.nextInt());
            }
        }catch (FileNotFoundException e){
            throw new RuntimeException(e);
        }
        return result;
    }
}