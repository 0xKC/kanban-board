package com.kc.kanban.controller;

import com.kc.kanban.model.KanbanBoard;
import com.kc.kanban.service.KanbanService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/kanban")
@CrossOrigin(origins = "http://localhost:4200")
public class KanbanController{
    private final KanbanService kanbanService;

    public KanbanController(KanbanService kanbanService) {
        this.kanbanService = kanbanService;
    }


    @GetMapping("/")
    public ResponseEntity<?> getAllKanbans(){
        try {
            return new ResponseEntity<>(
                    kanbanService.getAllKanbanBoards(),
                    HttpStatus.OK);
        } catch (Exception e) {
            return errorResponse();
        }
    }


    @GetMapping("/{id}")
    public ResponseEntity<?> getKanban(@PathVariable Long id){

        try{
            return new ResponseEntity<>(
                    kanbanService.getKanban(id),HttpStatus.OK);

} catch(Exception e) {
          return errorResponse();
        }

    }
    @PostMapping("/")
    public ResponseEntity<?> createKanban(@RequestBody KanbanBoard kanbanBoard){
        try{
            return new ResponseEntity<>(
                    kanbanService.createKanban(kanbanBoard),HttpStatus.OK);

        } catch (Exception e){
            return errorResponse();
        }


    }
    @PutMapping("/{id}")
    public ResponseEntity<?> updateKanban(@PathVariable Long id,@RequestBody KanbanBoard kanbanBoard){
        try{
            Optional<KanbanBoard> kanban = kanbanService.getKanban(id);
            if(kanban.isPresent())
            return new ResponseEntity<>(kanbanService.updateKanban(kanbanBoard),HttpStatus.OK);
        }catch(Exception e){
            return errorResponse();
        }
        return null;
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteKanban(@PathVariable Long id){
        try{
            Optional<KanbanBoard> kanbanB= kanbanService.getKanban(id);
            if(kanbanB.isPresent()) {
                kanbanService.deleteKanban(id);
                return new ResponseEntity<>(null, HttpStatus.OK);
            }
            else{
                return notFoundResponse(id);
            }
        }catch(Exception e){
            return errorResponse();
        }

    }
    private ResponseEntity<?> errorResponse() {
        return new ResponseEntity<>("Something is wrong", HttpStatus.INTERNAL_SERVER_ERROR);
    }

    private ResponseEntity<String> notFoundResponse(Long id){
        return new ResponseEntity<>("No kanban found with id: " + id, HttpStatus.NOT_FOUND);
    }



}
