package fr.uga.l3miage.tp1.exo2.models;

import org.hibernate.type.descriptor.sql.VarcharTypeDescriptor;

import javax.persistence.*;
import java.math.BigInteger;
import java.time.LocalDate;
import fr.uga.l3miage.tp1.exo2.enums.Sex;

@Entity
@Table(name="netflix_user")
public class NetflixUserEntity {

    @Id
    private BigInteger bigInt;

    @Column(name="uuid")
    private String uuid;

    @Column(name = "last_Name")
    private String lastName;

    @Column(name = "first_name")
    private String firstName;

    @Column(name="sex")
    @Enumerated (EnumType.ORDINAL)
    private Sex sex;

    @Column(name="birth_date")
    private LocalDate birthDate;

    @OneToOne(mappedBy = "netflixUser")
    private NetflixAccountEntity netflixAccount;


}
