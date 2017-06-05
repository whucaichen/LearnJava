package sync;

/**
 * 同步线程
 * synchronized修饰的静态方法锁定的是这个类的所有对象。
 */
class SyncThreadStatic implements Runnable {
    private static int count;

    public SyncThreadStatic() {
        count = 0;
    }

    /**
     *
     */
    public synchronized static void method() {
        for (int i = 0; i < 5; i ++) {
            try {
                System.out.println(Thread.currentThread().getName() + ":" + (count++));
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public synchronized void run() {
        method();
    }

    public static void main(String[] args) {
        SyncThreadStatic syncThreadStatic1 = new SyncThreadStatic();
        SyncThreadStatic syncThreadStatic2 = new SyncThreadStatic();
        Thread thread1 = new Thread(syncThreadStatic1, "SyncThread1");
        Thread thread2 = new Thread(syncThreadStatic2, "SyncThread2");
        thread1.start();
        thread2.start();
        /**
         * syncThread1和syncThread2是SyncThread的两个对象，但在thread1和thread2并发执行时却保持了线程同步。
         * 这是因为run中调用了静态方法method，而静态方法是属于类的，所以syncThread1和syncThread2相当于用了同一把锁。
         */
    }
}