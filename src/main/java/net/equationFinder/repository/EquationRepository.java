package net.equationFinder.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import net.equationFinder.entity.Equation;

public interface EquationRepository extends CrudRepository<Equation, Integer> {
	List<Equation> findAllByOrderByNumberOfViewsDesc();
}
