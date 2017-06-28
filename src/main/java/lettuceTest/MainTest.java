package lettuceTest;

import com.lambdaworks.redis.RedisAsyncConnection;
import com.lambdaworks.redis.RedisClient;

import java.util.concurrent.ExecutionException;

/**
 * Created by jiang wei on 2017/3/31.
 */
public class MainTest {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        RedisClient redisClient = new RedisClient("127.0.0.1");
        RedisAsyncConnection<String, String> stringStringRedisAsyncConnection = redisClient.connectAsync();
        stringStringRedisAsyncConnection.set("1", "1111");
        System.out.println(stringStringRedisAsyncConnection.get("1").get());
        stringStringRedisAsyncConnection.close();
        redisClient.shutdown();
    }
}
