package bj.ifri.springboot.tpspring.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "students")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Student {

	@Id
	@GeneratedValue
	private Long id;

	@Column
	private String matricule;

	@Column(columnDefinition = "text")
	private String firstname;

	@Column(columnDefinition = "text")
	private String lastname;

	@Column
	private Integer age;

	@Column
	private String sexe;

	@ManyToOne()
	@JoinColumn(name = "university_id")
	private University universite;

}
