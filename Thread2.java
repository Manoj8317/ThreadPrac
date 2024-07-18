public class Thread2 implements Runnable{
    @Override
    public void run() {
        for(int i=11;i<=15;i++){
            System.out.println(i+" "+Thread.currentThread());
        }
    }
}
