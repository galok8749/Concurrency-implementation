package numberprinter;

public class Main {
    public static void main(String[] args) {
        //for(int i = 0; i < 100; i++) {
            // pass instance of class implementing runnable interface
            //Thread t = new Thread(new HelloPrinter());
            //t.start();

            // not calling run() method directly because it will not create a separate thread
            // start() internally call run()
        //}


        // TODO: print 1 to 100 from separate thread
        for(int i = 1; i <= 100; i++) {
            Thread t = new Thread(new NumberPrinter(i));
            t.start();
            // each thread is independent
            // cpu will schedule each thread
        }


    }
}
