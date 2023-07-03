import java.util.Random;
import java.util.Scanner;

public class lec2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();
        int cc=rnd.nextInt(11);
        System.out.println("cc"+cc);
        System.out.println("guess thr number between 0 and 20");
        int u=sc.nextInt();
        if(u>cc){
            System.out.println("Guess is high");
        }else if(u<cc){
            System.out.println("your guess is low");
        }else{
            System.out.println("gotcha");
        }

        char ch='A';
        while(ch<=90){
            System.out.println(ch+" ");
            ch++;
        }
        int div=sc.nextInt();
        switch(div){
            case 1:
            System.out.println("First Rank");
            break;
            case 2:
            System.out.println("Second Rank");
            break;
            case 3:
            System.out.println("Thhirf rian");
            break;
        }
    }
}
