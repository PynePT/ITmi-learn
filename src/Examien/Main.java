package Examien;

import java.util.ArrayList;


public class Main {
    public static void main(String[] args) throws InterruptedException {
        Main m = new Main();
        int x = 0;

        ArrayList<Thread> listThread = new ArrayList<>();
        Barrier bar = new Barrier(x);

        for (int i = x ; i <= 3; i++) {
            listThread.add(m.new MyThread(bar, (i + 1), "Num" + (i + 1)));
        }

        for (Thread thread : listThread) {
            thread.start();
        }

        for (Thread thread : listThread) {
            thread.join();
        }

    }


    public class MyThread extends Thread {
        Barrier barr;
        int sleep;

        MyThread(Barrier barr, int sleep, String name) {
            this.barr = barr;
            this.sleep = sleep;
            setName(name);
        }

        @Override
        public void run() {
            try {
                sleep(sleep);

                System.out.println("Поток " + getName() + " стоит ");

                barr.ready();

                System.out.println("Поток " + getName() + " работает ");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}