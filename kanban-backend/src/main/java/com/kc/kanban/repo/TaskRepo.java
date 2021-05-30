package com.kc.kanban.repo;

import com.kc.kanban.model.KanbanBoard;
import com.kc.kanban.model.Task;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface TaskRepo extends CrudRepository<Task, Long> {
    Optional<Task> findByTitle(String title);

}
