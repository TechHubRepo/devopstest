package com.techhub.devopstest.service;

import org.springframework.stereotype.Service;

@Service
public class ChatServiceImp implements ChatService{

    @Override
    public String askQuestion(String question) {

        if(question==null){
            question = "";
        }else{
            question = question.strip();
        }

        if(question.isBlank()){
            return "Question is empty";
        }else if(question.equalsIgnoreCase("namaste")){
            return "Namaste, Main aapki kya sahayta kr shkta hu ?";
        }else if(question.equalsIgnoreCase("hello")){
            return "Hello, Sir how may I help you ?";
        }else if(question.equalsIgnoreCase("what is your name")){
            return "Hello, Sir my name is ChatBoat, how can I help you ?";
        }else if(question.equalsIgnoreCase("what is jenkins")){
            return "Jenkins is an open source automation server. It helps automate the parts of software development related to building, testing, and deploying, facilitating continuous integration, and continuous delivery.";
        }else if(question.equalsIgnoreCase("how are you")){
            return "I am fine thank you, how are you?";
        }else if(question.equalsIgnoreCase("what is devops")){
            return "DevOps integrates and automates the work of software development and IT operations as a means for improving and shortening the systems development life cycle.";
        }else{
            return "Invalid question";
        }
    }
}
