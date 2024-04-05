package com.techhub.devopstest.service;

import org.assertj.core.api.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

public class ChatServiceImpTest {

    @Mock
    private ChatServiceImp chatServiceImp;

    @BeforeEach
    public void setUp(){
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void askQuestionTest() throws  Throwable{
        Mockito.when(chatServiceImp.askQuestion("Namaste")).thenReturn("Namaste, Main aapki kya sahayta kr shkta hu ?");

        Assertions.assertEquals("Namaste, Main aapki kya sahayta kr shkta hu ?",chatServiceImp.askQuestion("Namaste"));
//        Assertions.assertEquals("Hello, Sir how may I help you ?",chatServiceImp.askQuestion("Hello"));
//        Assertions.assertEquals("Hello, Sir my name is ChatBoat, how can I help you ?",chatServiceImp.askQuestion("How are you"));
//        Assertions.assertEquals("Jenkins is an open source automation server. It helps automate the parts of software development related to building, testing, and deploying, facilitating continuous integration, and continuous delivery.",chatServiceImp.askQuestion("What is your name"));
//        Assertions.assertEquals("I am fine thank you, how are you?",chatServiceImp.askQuestion("What is Jenkins"));
//        Assertions.assertEquals("DevOps integrates and automates the work of software development and IT operations as a means for improving and shortening the systems development life cycle.",chatServiceImp.askQuestion("What is DevOps"));
    }
}
