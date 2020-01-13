package ru.bstu.ieitus.handmade_backend.entity.domain;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "photolessons")
public class Photolesson {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String description;
    private String materials;
    private Integer countImages;
    private Long userID;
    private Long handmadeTypeID;
}
