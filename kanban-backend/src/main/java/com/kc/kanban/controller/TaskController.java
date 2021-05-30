package com.kc.kanban.controller;

import com.kc.kanban.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tasks")
@CrossOrigin(origins = "http://localhost:4200")
public class TaskController {

    private final TaskService taskService;

    @Autowired
    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping("/")
    public ResponseEntity<?> getAllTasks(){
        try{
            return new ResponseEntity<>(taskService.getAllTasks(), HttpStatus.OK);
        }
        catch(Exception e){
            return  errorResponse();
        }
    }








    private ResponseEntity<?> errorResponse() {
        return new ResponseEntity<>("Something is wrong", HttpStatus.INTERNAL_SERVER_ERROR);
    }

}
