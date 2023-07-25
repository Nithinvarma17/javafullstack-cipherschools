import java.io.BufferedReader;
import java.io.FileReader;

public class lec15 {
    public static void main(String[] args) {
        FileReader fr = new FileReader("C:\\Users\\nithi\\OneDrive\\Desktop\\rhyme.txt");
        BufferedReader br = new BufferedReader(fr);
        String line;// = br.readLine();
        while((line=br.readLine())!=null){
            System.out.println(line);
        }
        br.close();
        fr.close();
        //System.out.println(line); 
    }
}
