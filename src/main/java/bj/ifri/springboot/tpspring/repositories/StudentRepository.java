package bj.ifri.springboot.tpspring.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import bj.ifri.springboot.tpspring.models.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

	public List<Student> findByUniversiteId(Long universiteId);

}
