package bj.ifri.springboot.tpspring.models;

import jakarta.persistence.*;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "employes")
public class Employe {
    @Id
    @GeneratedValue
    private Integer id;

    @Column(name = "nom")
    private String nom;

    @Column(name = "prenom")
    private String prenom;

    @Column(name = "adresse")
    private String adresse;

    @Column(name = "salaire")
    private Float salaire;

    @Column(name = "numinsee")
    private Integer numINSEE;

    @Column(name = "nombanque")
    private String nomBanque;

    @ManyToOne
    @JoinColumn(name = "agence_id")
    private Agence agence;
}
