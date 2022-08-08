package com.vijay.springboot.bach.springbatch;

import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.NonTransientResourceException;
import org.springframework.batch.item.ParseException;
import org.springframework.batch.item.UnexpectedInputException;

public class Reader implements ItemReader<String> {

    private String[] course = {"Java Web Services", "End to End Project", "Angular"};
    private int count;

    @Override
    public String read() throws Exception, UnexpectedInputException, ParseException, NonTransientResourceException {
        if(count < course.length) {
            return course[count++];
        } else {
            count = 0;
        }
        return null;
    }
    
}
