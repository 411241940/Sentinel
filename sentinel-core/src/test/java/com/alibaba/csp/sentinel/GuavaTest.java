package com.alibaba.csp.sentinel;

import com.google.common.util.concurrent.RateLimiter;

import java.util.concurrent.TimeUnit;

/**
 * todo
 *
 * @author bin
 * @version 1.0 2020/1/29
 **/
public class GuavaTest {
    public static void main(String[] args) throws InterruptedException {

        RateLimiter rateLimiter = RateLimiter.create(5, 4000, TimeUnit.MILLISECONDS);
        for(int i = 1; i < 50; i++) {
            System.out.println(System.currentTimeMillis() + " acq " + i + ": wait " + rateLimiter.acquire() + "s");
            if(i == 15) {
//                Thread.sleep(2000);
                System.out.println(System.currentTimeMillis() + " acq " + 15 + ": wait " + rateLimiter.acquire() + "s");
            }
        }

    }
}
