package com.basics;

import java.util.concurrent.*;

/**
 * Created with Intellij IDEA
 * User : wanglin
 * Date : 2020/5/23
 * Time : 11:17
 * Description :
 */
public class ThreadPoolUtil {
    private ThreadPoolUtil() {
        super();
    }
    //  线程池中核心线程的数量
    private final static Integer COREPOOLSIZE = 5;
    //  线程池中最大线程数量
    private final static Integer MAXIMUMPOOLSIZE = 10;
    //  非核心线程的超时时长
    private final static Integer KEEPALIVETIME = 3 * 60;
    //  线程池中的任务队列
    private static BlockingQueue<Runnable> queue = new ArrayBlockingQueue<>(10);
    /**
     *  int corePoolSize,   线程池中核心线程的数量
     *  int maximumPoolSize,    线程池中最大线程数量
     *  long keepAliveTime,    非核心线程的超时时长
     *  TimeUnit unit,  第三个参数的单位，有纳秒、微秒、毫秒、秒、分、时、天等
     *  BlockingQueue<Runnable> workQueue,      线程池中的任务队列
     *  ThreadFactory threadFactory,    为线程池提供创建新线程的功能，这个我们一般使用默认即可。(此处没有传递这个参数)
     *  RejectedExecutionHandler handler    拒绝策略，当线程无法执行新任务时（一般是由于线程池中的线程数量已经达到最大数或者线程池关闭导致的），默认情况下，当线程池无法处理新线程时，会抛出一个RejectedExecutionException。
     */
    private static ThreadPoolExecutor threadPool = new ThreadPoolExecutor(
            COREPOOLSIZE,
            MAXIMUMPOOLSIZE,
            KEEPALIVETIME,
            TimeUnit.SECONDS,
            queue,
            new ThreadPoolExecutor.AbortPolicy());

    //  有返回值的线程
    public static Future submit(Callable callable){
        return threadPool.submit(callable);
    }
    //  没有返回值的线程
    public static void execte(Runnable runnable){
        threadPool.execute(runnable);
    }
    //  返回当前池中的线程数
    public static int getSize() {
        return threadPool.getPoolSize();
    }
    //  返回当前池中活跃的线程数
    public static int getActiveCount(){
        return threadPool.getActiveCount();
    }

}
