package Opg1;

import java.io.*;
import java.util.NoSuchElementException;


public class Test {
    private static MyTime myTime;
    private static String path = "C:\\Users\\simon\\IdeaProjects\\Semester2\\T18 serializeable\\src\\Opg1\\outPutFile.ser";
    public static void main(String[] args) {
        myTime = readFile();
        if(myTime == null){
            myTime = new MyTime(0);
            System.out.println("New object created ");
        }
        System.out.println(myTime.getTime());
        myTime.increase();
        System.out.println(myTime.getTime());
        saveFile2(myTime);

    }
/*
    public void savefile(MyTime time) throws IOException {
        FileOutputStream fileOut = new FileOutputStream("src/Opg1/outputFile");
        ObjectOutputStream objOut = new ObjectOutputStream(fileOut);

        objOut.writeObject(time);
    }

 */

    public static void saveFile2(MyTime myTime) {
        try (FileOutputStream fileOut =
                     new FileOutputStream(path);
             ObjectOutputStream objOut =
                     new ObjectOutputStream(fileOut)
        ) {
            objOut.writeObject(myTime);
            System.out.println("File Saved ");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public static MyTime readFile(){
        try (FileInputStream fileIn =
                     new FileInputStream(path);
             ObjectInputStream objIn =
                     new ObjectInputStream(fileIn)
        ){
            Object obj = objIn.readObject();
            MyTime at = (MyTime) obj;
            return at;

        } catch (Exception e) {
            System.out.println("Returning NUll" + e.getMessage());
            return null;
        }
    }
}
