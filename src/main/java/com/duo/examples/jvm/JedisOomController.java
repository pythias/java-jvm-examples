package com.duo.examples.jvm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import redis.clients.jedis.JedisPool;

/**
 * @author pythias
 * @since 2019-08-15
 */
@RestController
@RequestMapping("/redis")
public class JedisOomController {
    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @RequestMapping("/normal")
    public String normal() {
        return stringRedisTemplate.opsForValue().get("test");
    }

    @Autowired
    private JedisPool jedisPool;

    @RequestMapping("/oom")
    public String oom() {
        return jedisPool.getResource().get("test");
    }
}
