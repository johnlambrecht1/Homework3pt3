package Homework3pt3;

import java.io.*;
import java.util.Scanner;

public class part3 {
    public static void main(String[] args) throws IOException {
        Scanner sc1;
        Scanner sc2;
        try{
            sc1 = new Scanner(new File("input1.txt"));
            sc2 = new Scanner(new File("input2.txt"));
            File file = new File("output.txt");
            FileWriter written;
            written = new FileWriter(file);
            BufferedWriter writer = new BufferedWriter(written);
            while(sc1.hasNextLine()||sc2.hasNextLine()){
                String string1 = sc1.nextLine();
                String string2 = sc2.nextLine();
                //writer.write("This has been written");
                //System.out.println("test");
                if (string1.equals(string2)){
                    //System.out.println("test2");
                    writer.write("This line is the same");
                    writer.newLine();
                }else{
                    //System.out.println("test1");
                    writer.write("This line is different");
                    writer.newLine();
                }
            }
            writer.close();
            written.close();
        }catch (FileNotFoundException e){
            System.out.println("Can't find the files");
        }
    }
}
