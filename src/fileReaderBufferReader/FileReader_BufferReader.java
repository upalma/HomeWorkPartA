package fileReaderBufferReader;

import java.io.BufferedReader;
import java.io.FileReader;

public class FileReader_BufferReader {
    public static void main(String[] args) {
        FileReader fr = null;
        BufferedReader bf= null;
        String path= "/Users/palmauzzal/Desktop/Homework5.txt";

        try{
        fr = new FileReader(path);
        }catch (Exception ex){
            System.out.println("File is not traced, plese try again");
        }
        try{
            bf = new BufferedReader(fr);
            String data= " ";
            while((data = bf.readLine()) != null){
                System.out.println(data);
            }
        } catch(Exception ex){
            System.out.print("File is not readable");
        }
    }
}
