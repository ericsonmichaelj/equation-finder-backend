package net.equationFinder.entity;

import javax.annotation.Resource;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import org.springframework.data.rest.core.annotation.RestResource;

@Entity
public class Equation {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer idEquation;
	
	private String equation;
	
	private String description;
	
	private String name;
	
	@Column(name="number_of_views")
	private Integer numberOfViews;

	@ManyToOne
	@JoinColumn(name="category_categoryId", nullable = false)
	@OnDelete(action = OnDeleteAction.NO_ACTION)
	@RestResource(path="/category", rel="category")
	private Category category;

//	@ManyToOne(fetch = FetchType.LAZY, optional = false)
//	@JoinColumn(name="idapproval_status", nullable = false)
//	@OnDelete(action = OnDeleteAction.NO_ACTION)
//	private Integer approvalStatusId;		

	public Integer getIdEquation() {
		return idEquation;
	}

	public void setIdEquation(Integer idEquation) {
		this.idEquation = idEquation;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategoryId(Category category) {
		this.category = category;
	}


	
	public String getEquation() {
		return equation;
	}

	public void setEquation(String equation) {
		this.equation = equation;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getNumber_of_views() {
		return numberOfViews;
	}

	public void setNumber_of_views(Integer number_of_views) {
		this.numberOfViews = number_of_views;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

}
