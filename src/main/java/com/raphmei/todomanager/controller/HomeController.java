package com.raphmei.todomanager.controller;

import com.raphmei.todomanager.service.TodoItemService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    private final TodoItemService taskService;

    public HomeController(TodoItemService taskService) {
        this.taskService = taskService;
    }

    @GetMapping("/")
    public ModelAndView index() {
        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("todoItems", taskService.getAll()); // Changement ici
        return modelAndView;
    }
}
