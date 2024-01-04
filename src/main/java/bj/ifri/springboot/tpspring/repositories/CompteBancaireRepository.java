package bj.ifri.springboot.tpspring.repositories;

import bj.ifri.springboot.tpspring.models.CompteBancaire;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompteBancaireRepository extends JpaRepository<CompteBancaire, Integer> {
}
