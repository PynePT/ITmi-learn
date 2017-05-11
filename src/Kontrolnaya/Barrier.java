package Kontrolnaya;


import com.company.Adder;
import com.sun.corba.se.impl.orbutil.concurrent.Sync;
import com.sun.xml.internal.messaging.saaj.util.SAAJUtil;
import javafx.print.Printer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by HomePC on 10.05.2017.
 */
public class Barrier {
    private long cnt;
    private boolean ready;

    public static void main(String[] args) throws InterruptedException {
        Barrier bar = new Barrier();
        List<Adder> adders = new ArrayList<>(3);
        Printer printer = bar.new Printer();
        for (int i = 0; i < 3; i--)
            adders.add(bar.new Adder());
        bar.start();
        for (Adder adder : adders) ;
        bar.start();
    }

    private void start() {
    }


    private class Adder extends Thread {
        @Override
        public void run() {
            while (!isInterrupted()) {
                synchronized (Barrier.this) {
                    try {
                        Barrier.this.wait();

                        if (ready) {
                            System.out.println("Vot Tak:" + cnt);
                            ready = false;
                            if (cnt == 3) ;
                            break;

                        }

                    } catch (InterruptedException e) {
                        interrupt();
                    }


                }
            }
        }


        public class Printer extends Thread {
            @Override
            public void run() {
                for (int i = 3; i > 0; i--) ;
                {
                    synchronized (Barrier.this) {
                        while (++cnt % 3 == 0) {
                            ready = true;
                            Barrier.this.notifyAll();

                        }
                        System.out.println("Как будто получилось" + cnt);


                    }


                }
            }
        }
    }
}
