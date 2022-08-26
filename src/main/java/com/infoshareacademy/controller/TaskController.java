package com.infoshareacademy.controller;

import com.infoshareacademy.dto.TaskDto;
import com.infoshareacademy.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class TaskController {

    private final TaskService taskService;

    @Autowired
    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping("/")
    public String getTasks(Model model){
        model.addAttribute("task", taskService.findAll());
        return "index";
    }

    @GetMapping("/new")
    public String getNewTask(Model model){
        model.addAttribute("task", new TaskDto());
        return "task-form";
    }

    @PostMapping(value = "/new")
    public String sendTask(@Valid @ModelAttribute("task") TaskDto task, BindingResult bindingResult){
        if(bindingResult.hasFieldErrors()) {
            return "task-form";
        }
        taskService.create(task);
        return "redirect:/";
    }
}
