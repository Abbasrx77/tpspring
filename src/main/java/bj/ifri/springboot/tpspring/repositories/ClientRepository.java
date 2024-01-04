package bj.ifri.springboot.tpspring.repositories;

import bj.ifri.springboot.tpspring.models.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClientRepository extends JpaRepository<Client, Integer> {
    List<Client> findByAgenceId(Integer agenceId);

    List<Client> findByNomAndPrenom(String nom, String prenom);

    @Query("SELECT c FROM Client c LEFT JOIN c.comptesBancaires cb ON cb.client = c LEFT JOIN c.comptesInterets ci ON ci.client = c WHERE cb.solde < 0 AND c.agence.banque.id = :banqueId")
    List<Client> findClientsEnDecouvertByBanqueId(Integer banqueId);

    @Query("SELECT DISTINCT c FROM Client c JOIN c.comptesBancaires cb WHERE c.agence.id = :agenceId")
    List<Client> findClientsWithCompteBancaireByAgenceId(Integer agenceId);

    @Query("SELECT DISTINCT c FROM Client c JOIN c.comptesInterets ci WHERE c.agence.id = :agenceId")
    List<Client> findClientsWithCompteInteretByAgenceId(Integer agenceId);

}
