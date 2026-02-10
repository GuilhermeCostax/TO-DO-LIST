package com.example.demo.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity     //JPA transforma a classe em uma tabela.
@Data   //Lombok: Cria Getters e Setters.
@NoArgsConstructor  //Lombok: Cria construtores vazios.

public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String description;

    @Enumerated(EnumType.STRING)
    private TaskStatus status = TaskStatus.NAO_INICIADO;

    private LocalDateTime createdAt = LocalDateTime.now();
}