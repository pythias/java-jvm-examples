package com.duo.examples.jvm;

import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import redis.clients.jedis.JedisPool;

/**
 * @author pythias
 * @since 2019-08-15
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class JedisPoolTests {
    private JedisPool pool;

}
