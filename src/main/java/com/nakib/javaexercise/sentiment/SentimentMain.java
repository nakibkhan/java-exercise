package com.nakib.javaexercise.sentiment;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.util.Arrays;
import java.util.List;

public class SentimentMain {
    public static void main(String[] args)  throws Exception {
        System.out.println("Hello Sentiment");

        File feedbackFile = new File(SentimentMain.class.getClassLoader().getResource("feedback.json").getFile());

        ObjectMapper objectMapper = new ObjectMapper();

        CustomerComments[] customerComments = objectMapper.readValue(feedbackFile, CustomerComments[].class);

        List<CustomerComments> customerCommentsList = Arrays.asList(customerComments);
    }
}
