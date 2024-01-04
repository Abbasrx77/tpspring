package bj.ifri.springboot.tpspring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import bj.ifri.springboot.tpspring.models.University;

public interface UniversityRepository extends JpaRepository<University, Long> {

}
