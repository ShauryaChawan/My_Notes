public class SynchronizedExample {

    public static void main(String[] args) {
        Counter counter = new Counter();

        Thread thread1 = new Thread(new IncrementTask(counter), "Thread 1");
        Thread thread2 = new Thread(new IncrementTask(counter), "Thread 2");

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final Counter Value: " + counter.getCount());
    }

    static class Counter {
        private int count = 0;

        // Synchronized method to prevent race condition
        public synchronized void increment() {
            int temp = count;
            try {
                Thread.sleep(1); // Simulate delay
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            count = temp + 1;
        }

        public int getCount() {
            return count;
        }
    }

    static class IncrementTask implements Runnable {
        private Counter counter;

        public IncrementTask(Counter counter) {
            this.counter = counter;
        }

        @Override
        public void run() {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        }
    }
}