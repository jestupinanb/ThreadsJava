class DefaultRunnable implements Runnable{
    private String externalString;
    public DefaultRunnable(String externalString){
        this.externalString = externalString;
    }

    public DefaultRunnable(){}

    @Override
    public void run() {
        System.out.println("I'm a thread! My name is "+Thread.currentThread().getName());
    }
}