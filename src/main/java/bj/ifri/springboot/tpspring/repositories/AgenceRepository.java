package bj.ifri.springboot.tpspring.repositories;

import bj.ifri.springboot.tpspring.models.Agence;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AgenceRepository extends JpaRepository<Agence, Integer> {
    List<AgenceProjection> findAllProjectedBy();
}
