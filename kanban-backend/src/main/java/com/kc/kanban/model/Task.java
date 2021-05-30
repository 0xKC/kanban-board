package com.kc.kanban.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "task")
@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter @ToString
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String title;
    private String description;
    private String color;
    @Enumerated(EnumType.STRING)
    private TaskStatus status;
}
