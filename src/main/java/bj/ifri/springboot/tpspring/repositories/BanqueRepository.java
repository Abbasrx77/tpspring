package bj.ifri.springboot.tpspring.repositories;

import bj.ifri.springboot.tpspring.models.Banque;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BanqueRepository extends JpaRepository<Banque, Integer> {

}
