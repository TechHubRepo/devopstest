package com.techhub.devopstest.service;

import org.assertj.core.api.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;
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

   @ValueSource(strings = {"Namaste","hello","what is your name","what is jenkins","how are you","what is devops"})
   @ParameterizedTest
    void askQuestionTest(String question) throws  Throwable{
        Mockito.when(chatServiceImp.askQuestion(question)).thenReturn(Mockito.anyString());
        Assertions.assertNotNull(chatServiceImp.askQuestion(question));
   }
}
