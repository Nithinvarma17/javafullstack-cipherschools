public class lec5 {
    int employeeid;
    int salary;
    String dept;
    lec5(int eid,int pay,String d){
        employeeid=eid;
        salary=pay;
        dept=d;
    }
    public static void main(String[] args) {
        lec5 ntin = new lec5(101,23333,"uI/UX");
        lec5 ntun = new lec5(112,12345,"SalesForce");
        System.out.println(ntin.employeeid);
    }
}
