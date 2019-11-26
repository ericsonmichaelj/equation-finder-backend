package net.equationFinder.entity;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Category {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer categoryId;
	
	@OneToMany(mappedBy="category")
	 private Set<Equation> Equation;
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String category) {
		this.name = name;
	} 
}
