package com.vijay.springboot.bach.springbatch;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BatchConfig {
    
    public Reader reader() {
        return new Reader();
    }

    public Writer writer() {
        return new Writer();
    }

    @Bean
    public Processor processor() {
        return new Processor();
    }

    public MyJobListener listener() {
        return new MyJobListener();
    }
}
