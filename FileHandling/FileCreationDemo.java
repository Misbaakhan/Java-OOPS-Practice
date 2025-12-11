import java.io.File;
import java.io.IOException;

public class FileCreationDemo {

    public static void main(String[] args) throws IOException {

        //creating a folder
        File folder = new File("MyNewFolder");
        if (folder.exists() != true) {
            folder.mkdir();
            System.out.println("folder created");
        }
        //file creation
        File file = new File("MyNewFolder/newfile");
        if (!file.exists()) {
            file.createNewFile();
            System.out.println("file created");
        }
        //file class methods
        System.out.println("file name : " + file.getName());
        System.out.println("file path is : " + file.getPath());
        System.out.println("file path is : " + file.getAbsolutePath());
        System.out.println(" is file : " + file.isFile());
        System.out.println("is folder : " + folder.isDirectory());
        System.out.println("file size(bytes) " + file.length());
    }

}
