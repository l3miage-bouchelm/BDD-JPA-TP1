package fr.uga.l3miage.tp1.exo2.models;


import javax.persistence.*;
import java.util.UUID;

@Entity
public class SessionEntity {
    @Id
    private UUID idSession;

    private String lastCommand;

    private String currentDir;

    private boolean lock;

    @OneToOne(mappedBy="UserEntity")
    private UserEntity user;
}