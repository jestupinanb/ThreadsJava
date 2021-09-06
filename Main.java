
public class Main extends Thread{
    public static void main(String[] args){
        Runnable task = new DefaultRunnable();

        Thread t1 = new Thread(task);
        
        Thread t2 = new Thread(new Runnable(){
            @Override
            public void run(){
                System.out.println("I'm a thread! My name is "+Thread.currentThread().getName());
            }
        });

        Thread t4 = new Thread(()-> System.out.println("Antoher thread! "+Thread.currentThread().getName()));

        Thread t5 = new Thread(Main::execute);

        t1.run();

        t1.start();
        t2.start();
        t4.start();
        t5.start();

    }

    public static void execute(){
        System.out.println("Antoher thread!"+Thread.currentThread().getName());
    }

}