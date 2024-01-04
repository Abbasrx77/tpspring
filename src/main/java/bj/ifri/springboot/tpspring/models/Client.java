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
@Table(name = "clients")
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "numero")
    private String numero;

    @Column(name = "nom")
    private String nom;

    @Column(name = "prenom")
    private String prenom;

    @Column(name = "adresse")
    private String adresse;

    @Column(name = "nomconseiller")
    private String nomConseiller;

    @ManyToOne
    @JoinColumn(name = "agence_id")
    private Agence agence;

    @OneToMany(cascade = CascadeType.DETACH, fetch = FetchType.LAZY,mappedBy = "client")
    private List<CompteBancaire> comptesBancaires = new ArrayList<>();

    @OneToMany(cascade = CascadeType.DETACH, fetch = FetchType.LAZY,mappedBy = "client")
    private List<CompteInteret> comptesInterets = new ArrayList<>();


}
