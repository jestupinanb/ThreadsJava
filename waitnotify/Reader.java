package waitnotify;

public class Reader implements Runnable{

    Message message;

    Reader(Message message){
        this.message = message;
    }

    @Override
    public void run() {
        System.out.println("Start thread "+Thread.currentThread().getName());
        try{
            synchronized(message){
                message.wait();
                System.out.println(Thread.currentThread().getName()+" SAID "+message.getMessage());
            }
        }catch(InterruptedException e){
            System.out.println("ERROR"+e);
        }
        System.out.println("Finishing thread "+Thread.currentThread().getName());
    }
}
