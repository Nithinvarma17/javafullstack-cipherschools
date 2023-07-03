interface olaDriver{
void friend();

}
interface olaCoustmer{
void friend2();
}
interface olaOwner{
void friend1();
}
public class lec4 implements olaCoustmer,olaDriver,olaOwner{
    olaOwner ol = new lec4();
    
}
