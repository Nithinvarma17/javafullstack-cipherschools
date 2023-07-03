public class lec6 {
    int wid;
    int hei;
    void display(String item){
        System.out.println(item+"width"+wid+"height"+hei);
    }
    public static void main(String[] args) {
        chair neel = new chair();
        neel.foo();
    }
}
class chair extends lec6{
void foo(){
    wid=10;
    hei=20;
    display("chair");
}
}

class almira extends lec6{
void foo(){
    wid=30;
    hei=50;
    display("almira");
}
}

class table extends lec6{
void foo(){
    wid=100;
    hei=200;
    display("table");
}
}
