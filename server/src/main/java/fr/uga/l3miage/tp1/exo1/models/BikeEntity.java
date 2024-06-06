package fr.uga.l3miage.tp1.exo1.models;


import fr.uga.l3miage.tp1.exo1.enums.CylinderNumber;

import javax.persistence.*;
import java.time.LocalDate;


@Entity
@Table(name="bike_entity")
public class BikeEntity {
    @Id
    @Column(name="immatriculation")
    private String immatriculation;

    @Column(name="cylinder_number")
    @Enumerated(EnumType.STRING)
    private CylinderNumber cylinderNumber;

    @Column(name="shifter_type")
    @Enumerated(EnumType.ORDINAL)
    private boolean shifterType;

    @Column(name="shifter")
    private boolean shifter;

    @Column(name="automatic")
    private boolean automatic;

    @Column(name="local_date")
    private LocalDate localDate;

    @Column(name="capacity")
    private int capacity;

}
