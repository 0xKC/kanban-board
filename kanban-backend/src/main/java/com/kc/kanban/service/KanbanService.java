package com.kc.kanban.service;

import com.kc.kanban.model.KanbanBoard;
import com.kc.kanban.repo.KanbanRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class KanbanService {


    private final KanbanRepo kanbanRepo;

    @Autowired
    public KanbanService(KanbanRepo kanbanRepo) {
        this.kanbanRepo = kanbanRepo;
    }



    public List<KanbanBoard> getAllKanbanBoards() {
        return (List<KanbanBoard>) kanbanRepo.findAll();
    }

    public Optional<KanbanBoard> findByTitle(String title){
        return kanbanRepo.findByTitle(title);
    }

    public Optional<KanbanBoard> getKanban(Long id) {
        return kanbanRepo.findById(id);
    }

    public KanbanBoard createKanban(KanbanBoard kanbanBoard){ return kanbanRepo.save(kanbanBoard);}

    public KanbanBoard updateKanban(KanbanBoard kanbanBoard) { return kanbanRepo.save(kanbanBoard); }

    public void deleteKanban(Long id) { kanbanRepo.deleteById(id); }
}
