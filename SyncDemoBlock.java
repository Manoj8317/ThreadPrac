public class SyncDemoBlock {

    public static void main(String[] args) {
        Brackets1 b=new Brackets1();
        Thread t1=new Thread(new Runnable(){
            @Override
            public void run() {
                long startTime=System.currentTimeMillis();
                for(int i=0;i<=5;i++){
                    b.printBrackets('[',']');
                }
                long endTime=System.currentTimeMillis();
                System.out.println("time taken"+"="+(endTime-startTime));
            }
        });

        Thread t2=new Thread(new Runnable(){
            @Override
            public void run() {
                long startTime=System.currentTimeMillis();
                for(int i=0;i<=5;i++){
                    b.printBrackets('{','}');
                }
                long endTime=System.currentTimeMillis();
                System.out.println("time taken"+"="+(endTime-startTime));
            }
        });

        t1.start();
        t2.start();
    }
}

class Brackets1{
    public void  printBrackets(char open, char close){
        synchronized(this){
            for(int i=0;i<10;i++){
                if(i<=5){
                    System.out.print(open);
                }else{
                    System.out.print(close);
                }
            }
            System.out.println();

            for(int i=0;i<10;i++){
                try {
                    Thread.sleep(25);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
     }
}