package com.vijay.springboot.bach.springbatch;

import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BatchConfig {

    private StepBuilderFactory sbf;

    public Step step() {
        return sbf.get("step-1")
            .<String, String>chunk(1)
            .reader(reader())
            .writer(writer())
            .processor(processor())
            .build();
    }

    @Bean
    public Reader reader() {
        return new Reader();
    }

    @Bean
    public Writer writer() {
        return new Writer();
    }

    @Bean
    public Processor processor() {
        return new Processor();
    }

    @Bean
    public MyJobListener listener() {
        return new MyJobListener();
    }
}
