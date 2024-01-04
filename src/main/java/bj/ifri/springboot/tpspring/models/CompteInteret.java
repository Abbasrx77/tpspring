package bj.ifri.springboot.tpspring.models;

import jakarta.persistence.*;
import lombok.*;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "comptesinterets")
public class CompteInteret {
    @Id
    @GeneratedValue
    private Integer id;

    @Column(name = "numero")
    private String numero;

    @Column(name = "taux")
    private Float taux;

    @Column(name = "solde")
    private Float solde;

    @Column(name = "dateouverture")
    private Float dateOuverture;

    @Column(name = "nomclient")
    private String nomClient;

    @Column(name = "prenomclient")
    private String prenomClient;

    @ManyToOne
    @JoinColumn(name = "agence_id")
    private Agence numeroAgence;

    @ManyToOne
    @JoinColumn(name = "banque_id")
    private Banque numeroBanque;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;
}
