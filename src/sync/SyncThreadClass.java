package sync;

/**
 * 同步线程
 * synchronized作用于一个类T时，是给这个类T加锁，T的所有对象用的是同一把锁。
 */
class SyncThreadClass implements Runnable {
    private static int count;

    public SyncThreadClass() {
        count = 0;
    }

    public static void method() {
        /**
         *
         */
        synchronized(SyncThreadClass.class) {
            for (int i = 0; i < 5; i ++) {
                try {
                    System.out.println(Thread.currentThread().getName() + ":" + (count++));
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public synchronized void run() {
        method();
    }
}
