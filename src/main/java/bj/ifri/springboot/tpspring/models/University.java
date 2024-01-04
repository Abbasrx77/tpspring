package bj.ifri.springboot.tpspring.models;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "universities")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class University {

	@Id
	@GeneratedValue
	private Long id;

	private String name;

	private String manager;

	private String phone;

	private String website;

	@Transient
	private String city;

	@JsonIgnore
	@OneToMany(cascade = CascadeType.DETACH, fetch = FetchType.LAZY, mappedBy = "universite")
	private List<Student> students = new ArrayList<Student>();

}
