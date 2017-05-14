package Kontrolnaya;

import java.util.ArrayList;

public class BarrierMain {
    public static void main(String[] args) throws InterruptedException {
        BarrierMain m = new BarrierMain();
        ArrayList<Thread> listThread = new ArrayList<>();
        Barrier barrier = new Barrier(3);

        for (int i = 1; i <= 3; i++) {
            listThread.add(m.new MyThread(barrier, 3, "" + i));
        }

        for (Thread thread : listThread) {
            thread.start();
        }

        for (Thread thread : listThread) {
            thread.join();
        }

    }


    public class MyThread extends Thread {
        Barrier barrier;
        String name;

        MyThread(Barrier barrier, int Threads, String name) {

            this.barrier = barrier;
            this.name = name;
            new Thread(this);
            setName(name);
        }

        @Override
        public void run() {
            synchronized (barrier) {
                if (Barrier.getCounter() == 1) {
                    barrier.notifyAll();
                    System.out.println("Поток " + Thread.currentThread().getName() + " просыпается");
                }
                while (Barrier.getCounter() > 1) {
                    try {
                        barrier.decrCounter();
                        System.out.println("Поток " + Thread.currentThread().getName() +
                                " в блоке ");

                        barrier.wait();

                        System.out.println("Поток " + Thread.currentThread().getName() +
                                " завершает свою работу");
                        Thread.currentThread().interrupt();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

            }
        }
    }
}


