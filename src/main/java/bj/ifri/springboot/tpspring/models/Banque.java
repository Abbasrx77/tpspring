package bj.ifri.springboot.tpspring.models;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "banques")
public class Banque {
    @Id
    @GeneratedValue
    private Integer id;

    @Column(name = "numero")
    private String numero;

    @Column(name = "capital")
    private Float capital;

    @Column(name = "adressesiege")
    private String adresseSiege;

    @Column(name = "numsalaries")
    private Integer numSalaries;

    @Column(name = "villesagences")
    private String villesAgences;

    @OneToMany(cascade = CascadeType.DETACH, fetch = FetchType.LAZY,mappedBy = "banque")
    private List<Agence> agences = new ArrayList<>();

}
