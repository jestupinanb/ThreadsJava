public class DaemonThreadDemo{
    
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(()->{
            while(true){
                try{
                    Thread.sleep(500);
                    System.out.println("Daemon is working");
                }catch(InterruptedException e){System.out.println("EXCEPTION");}
            }
        });

        t.setDaemon(true);
        t.start();

        Thread.sleep(2000);
        System.out.println("Main Thread finished");
    }
}