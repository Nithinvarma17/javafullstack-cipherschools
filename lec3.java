public class lec3 {
    public static void main(String[] args) {
        Amazon coustmer = new Amazon();
        System.out.println("Transaction:"+coustmer.transaction(1000));

    }
}
    class Amazon{
        
        float transaction(int amt){
            Gpay gpay=new Gpay();
            return amt+(amt*gpay.getTxCharge());
        }
    }
     class Gpay{
        private float txncharge=0.05f;
        public float getTxCharge(){
            return txncharge;
        }
    }

