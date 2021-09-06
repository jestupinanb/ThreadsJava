package synchronization;

import java.util.ArrayList;

public class NonSynchornizedIncrement{

    public static int count = 0;

    public static void main(String[] args) throws InterruptedException {
        ArrayList<Thread> values = new ArrayList<>();

        int numThreads = 10000;

        for(int i=0;i<numThreads;i++){
            Thread t = new Thread(NonSynchornizedIncrement::exec);
            t.start();
            values.add(t);
        }

        for(Thread t:values){
            t.join();//Our main thread is going to wait until all the threads finish
        }
        
        //Then we print the answer, it should be 10000 but ...
        System.out.println(count);
    }

    public static void exec(){
        count++;
    }

}