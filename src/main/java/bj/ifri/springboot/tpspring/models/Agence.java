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
@Table(name = "agences")
public class Agence {
    @Id
    @GeneratedValue
    private Integer id;

    @Column(name = "numero")
    private String numero;

    @Column(name = "nom")
    private String nom;

    @Column(name = "adresse")
    private String adresse;

    @Column(name = "ville")
    private String ville;

    @Column(name = "codepostal")
    private String codePostal;

    @Column(name = "nomdirecteur")
    private String nomDirecteur;

    @Column(name = "nombanque")
    private String nomBanque;

    @OneToMany
    private List<Employe> employes = new ArrayList<>();

    @ManyToOne
    @JoinColumn(name = "banque_id")
    private Banque banque;

    @OneToMany(cascade = CascadeType.DETACH, fetch = FetchType.LAZY,mappedBy = "agence")
    private List<Client> clients = new ArrayList<>();

}