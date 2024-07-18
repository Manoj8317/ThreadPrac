public class SyncDemo {
    public static void main(String[] args) {
        Brackets b=new Brackets();
        Thread t1=new Thread(new Runnable(){
            @Override
            public void run() {
                for(int i=0;i<=5;i++){
                    b.printBrackets('[',']');
                }
            }
        });

        Thread t2=new Thread(new Runnable(){
            @Override
            public void run() {
                for(int i=0;i<=5;i++){
                    b.printBrackets('{','}');
                }
            }
        });

        t1.start();
        t2.start();
    }
}

class Brackets{
    synchronized public void  printBrackets(char open, char close){
         for(int i=0;i<10;i++){
             if(i<=5){
                 System.out.print(open);
             }else{
                 System.out.print(close);
             }
         }
         System.out.println();
     }
}
