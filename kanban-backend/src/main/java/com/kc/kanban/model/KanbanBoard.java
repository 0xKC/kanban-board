package com.kc.kanban.model;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="kanban")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class KanbanBoard {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String title;

    @OneToMany
    @JoinColumn(name = "kanban_id")
    private List<Task> tasks;


}
