import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo {
    public static void main(String[] args) throws IOException{
         BufferedWriter bw = new BufferedWriter(new FileWriter("MyNewfolder/newfile"));

            bw.write("this is written using BufferedWriter.");
            bw.newLine(); // adds a new line
            bw.write("BufferedWriter is faster and efficient.");
            bw.close();
            bw.flush(); //forces writing into the file

            System.out.println("Data written successfully using BufferedWriter.");
    }
    
}
