package com.kc.kanban.repo;

import com.kc.kanban.model.KanbanBoard;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface KanbanRepo extends CrudRepository<KanbanBoard,Long> {

     Optional<KanbanBoard> findByTitle(String title);
}
