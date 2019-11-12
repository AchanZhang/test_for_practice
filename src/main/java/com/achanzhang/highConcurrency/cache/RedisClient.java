package com.achanzhang.highConcurrency.cache;

import org.springframework.stereotype.Component;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

import javax.annotation.Resource;

// http://redis.cn/
@Component
public class RedisClient {

    @Resource(name = "redisPool")
    private JedisPool jedisPool;

    public void set(String key, String value) throws Exception {
        Jedis jedis = null;
        try {
            jedis = jedisPool.getResource();
            jedis.set(key, value);
        } finally {
            if (jedis != null) {
                jedis.close();
            }
        }
    }

    public String get(String key) throws Exception {
        //try-with-resources 可以自动释放资源
        try (Jedis jedis = jedisPool.getResource()) {
            return jedis.get(key);
        }
    }
}
