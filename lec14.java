import java.io.File;

public class lec14 {
    public static void main(String[] args) {
        File f=new File("C:\\Users\\nithi\\OneDrive\\Desktop\\myfile.txt");
        if(f.exists()){
            System.out.println("file details");
            System.out.println("-----------");
            System.out.println("File name : "+f.getName());
            System.out.println("file size : "+ f.length());
            System.out.println("file path :"+f.getAbsolutePath());
            System.out.println("is file readable:"+f.canRead());
            System.out.println("is file writable"+f.canWrite());

        }
    }
}
