package waitnotify;

public class Demo{
    public static void main(String[] args) throws InterruptedException {
        Message message = new Message("processs it");
        Reader reader1 = new Reader(message);
        var t1 = new Thread(reader1,"READER 1");

        Reader reader2 = new Reader(message);
        var t2 = new Thread(reader2,"READER 2");

        t1.start();
        t2.start();

        Notifier notifier = new Notifier(message);
        new Thread(notifier,"NOTIFIER").start();
    }
}
