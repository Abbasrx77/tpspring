package bj.ifri.springboot.tpspring.repositories;

import bj.ifri.springboot.tpspring.models.CompteInteret;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompteInteretRepository extends JpaRepository<CompteInteret, Integer> {
}
