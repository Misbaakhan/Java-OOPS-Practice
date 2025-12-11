import java.io.FileWriter;
import java.io.IOException;

public class WriteToFileDemo {

    public static void main(String[] args) throws IOException {
       //writing into the file
        FileWriter writer = new FileWriter("MyNewFolder/newfile");
        writer.write("this is the first line");
        writer.close();
        System.out.println("Data written");
        //Appending data using filewriter
        FileWriter writer1 = new FileWriter("MyNewFolder/newfile", true);
        writer1.append(" ,this line is appended");
        writer1.close();
        System.out.println("data appended");

    }
}
