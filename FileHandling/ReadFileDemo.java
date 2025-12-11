import java.io.FileReader;
import java.io.IOException;

public class ReadFileDemo {
    public static void main(String[] args) throws IOException{
        FileReader reader=new FileReader("MyNewFolder/newfile");
        int data;
        while((data=reader.read())!=-1){
            System.out.print((char)data);
        }
        reader.close();


    }

}
