package ru.bstu.ieitus.handmade_backend.entity.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "users")
public class User {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;
    private String name;
    private String lastName;
    private String email;
    private String login;
    private String password;
    private String role;
    private Boolean isMaster;
    private String note;
    private String about;
    private String avatar;
}
