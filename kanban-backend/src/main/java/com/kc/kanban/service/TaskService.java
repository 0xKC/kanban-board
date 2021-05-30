package com.kc.kanban.service;

import com.kc.kanban.model.Task;
import com.kc.kanban.repo.TaskRepo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TaskService {

    private final TaskRepo taskRepo;

    public TaskService(TaskRepo taskRepo) {
        this.taskRepo = taskRepo;
    }

    public List<Task> getAllTasks() {
        List<Task> tasks = new ArrayList<>();
        taskRepo.findAll().forEach(task ->{
            tasks.add(task);
        });
        return tasks;

    }
}
