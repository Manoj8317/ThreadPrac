public class SyncInconsitency {
    public static void main(String[] args) {
        Brackets2 b=new Brackets2();
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

class Brackets2{
    public void  printBrackets(char open, char close){
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