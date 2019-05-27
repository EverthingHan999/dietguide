package com.je1809.redisfig;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Data
public class RedisProperties {
    @Value("${spring.redis.cluster.nodes}")
    private String nodes;
    @Value("${spring.redis.cluster.command-timeout}")
    private Integer commandTimeout;
    @Value("${spring.redis.cluster.max-attempts}")
    private Integer maxAttempts;
    @Value("${spring.redis.cluster.max-redirects}")
    private Integer maxRedirects;
    @Value("${spring.redis.cluster.max-active}")
    private Integer maxActive;
    @Value("${spring.redis.cluster.max-wait}")
    private Integer maxWait;
    @Value("${spring.redis.cluster.max-idle}")
    private Integer maxIdle;
    @Value("${spring.redis.cluster.min-idle}")
    private Integer minIdle;
    @Value("${spring.redis.cluster.test-on-borrow}")
    private boolean testOnBorrow;
}
