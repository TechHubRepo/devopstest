package com.techhub.devopstest.controller;

import com.techhub.devopstest.service.ChatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @Autowired
    private ChatService chatService;

    @GetMapping(value = "/")
    public ModelAndView index(){
        return new ModelAndView("index");
    }

    @GetMapping(value = "/get-message")
    public ModelAndView getMessage(@RequestParam (name="question") String question, Model model){
        String answer = chatService.askQuestion(question);
        model.addAttribute("answer", answer);
        return new ModelAndView("index");
    }
}
