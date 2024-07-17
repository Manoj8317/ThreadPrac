public class TestClass {
    public static void main(String[] args) {
        Thread1 t1=new Thread1();
        t1.start();
        for(int i=6;i<=10;i++){
            System.out.println(i+""+Thread.currentThread());
        }
    }
}
