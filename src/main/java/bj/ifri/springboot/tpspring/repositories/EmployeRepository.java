package bj.ifri.springboot.tpspring.repositories;

import bj.ifri.springboot.tpspring.models.Employe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeRepository extends JpaRepository<Employe, Integer> {
}
