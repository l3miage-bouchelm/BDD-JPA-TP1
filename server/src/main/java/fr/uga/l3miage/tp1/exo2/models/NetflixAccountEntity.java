package fr.uga.l3miage.tp1.exo2.models;

import fr.uga.l3miage.tp1.exo2.enums.TypeAccount;
import javax.persistence.*;
import java.math.BigInteger;

@Entity
@Table(name="netflix_account")
public class NetflixAccountEntity {
    @Id
    @Column(name="id")
    private BigInteger id;

    @Column(name="type_Account")
    @Enumerated(EnumType.STRING)
    private TypeAccount typeAccount;

    @Column(name="nb_devices")
    private int nb_devices;

    @Column(name="uuid_user")
    private String uuid_user;

    @OneToOne(mappedBy = "NetflixUserEntity")
    @JoinColumn(name = "uuid_user", referencedColumnName = "uuid")
    private NetflixUserEntity netflixUser;


}
