package waitnotify;

public class Notifier implements Runnable {

    private Message message;

    Notifier(Message message) {
        this.message = message;
    }

    @Override
    public void run() {
        System.out.println("Start Notify");
        synchronized (message) {
            try {
                Thread.sleep(300);
                message.setMessage("This is another message ");
                message.notifyAll();
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            System.out.println("Finish Notify " + Thread.currentThread().getName());
        }
    }
}
