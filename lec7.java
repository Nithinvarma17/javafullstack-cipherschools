abstract  class Doctor{
    abstract void treatment();
}
class dentist extends Doctor{
    void treatment(){
        System.out.println("i am dentist");
    }
}
class therapist extends Doctor{
    void treatment(){
        System.out.println("i am therapist");
    }
}
public class lec7 {
    void add(int num1,int num2){System.out.println(num1+num2); }
     void add(int num1,int num2,int num3){System.out.println(num1+num2+num3); }
      void add(float num1,float num2){System.out.println(num1+num2); }
       void add(float num1,int num2){System.out.println(num1+num2); }
        void add(int num1,float num2){System.out.println(num1+num2); }


public static void main(String[] args) {
    Doctor doc=new therapist();
   doc.treatment();
    lec7 f = new lec7();
    f.add(1,2,3);
}
}