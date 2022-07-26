package com.example.demo.aop;

import org.springframework.stereotype.Component;

@Component
public class Service {
    public void test() {
        System.out.println("Calling test");
    }

    @TrackTime
    public void tracktime() throws InterruptedException {
        System.out.println("Calling tracktime");
        Thread.sleep(2000);
    }
}
