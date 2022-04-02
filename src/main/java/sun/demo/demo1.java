package sun.demo;

import lombok.extern.slf4j.Slf4j;
import org.redisson.Redisson;
import org.redisson.api.RAtomicLong;
import org.redisson.api.RFuture;
import org.redisson.api.RLock;
import org.redisson.api.RedissonClient;
import org.redisson.config.Config;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @Author sun
 * @Data 2022/2/25 14:30
 */
@Slf4j
public class demo1 {
    public static void run(){
        System.out.println(1/ 0);
    }

    public static void main(String[] args) throws Exception {

        log.info("sun");

        ArrayList<Object> objects = new ArrayList<>();
        System.out.println("rezaulkarimchandpuri1992@gmail.com".length());
        System.out.println("askad.shukurov.1988.12.01@gmail.com".length());
        System.out.println("1.10.20.0".length());

//        Stream.of(1, 2, 3, 2, 1)
//                .takeWhile(n -> n < 3)
//                .collect(Collectors.toList()); // [1, 2]
//
//        Config config = new Config();
//
//        config.useSingleServer().setAddress("redis://10.19.133.122:6379");
//        RedissonClient redissonClient = Redisson.create(config);
//
//
//        RAtomicLong longObject = redissonClient.getAtomicLong("myLong");
//        // sync way
//        longObject.compareAndSet(3, 401);
//        // async way
//        RFuture<Boolean> booleanRFuture = longObject.compareAndSetAsync(3, 401);

//        ExecutorService exec = Executors.newCachedThreadPool();
//        Future<String> future = exec.submit(() -> {
//            try {
//                Thread.sleep(5000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            return "sun";
//        });
//        System.out.println(future.get());
//        exec.shutdown();


//        Callable<Integer> callable = new Callable<Integer>() {
//            public Integer call() throws Exception {
//                Thread.sleep(2000);
//                return 10;
//            }
//        };
//        FutureTask<Integer> future = new FutureTask<Integer>(callable);
//        Thread thread = new Thread(future);
//
//        thread.start();
//        future.get(1000, TimeUnit.MILLISECONDS);
//        log.info("sun");

//        System.out.println(future.get());


//        RedissonReactiveClient client = Redisson.createReactive(config);
//        RAtomicLongReactive longObject1 = client.getAtomicLong("myLong");
//        // reactive way
//        longObject1.compareAndSet(3, 401);

    }

}
