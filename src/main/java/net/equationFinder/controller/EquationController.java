package net.equationFinder.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import net.equationFinder.entity.Equation;
import net.equationFinder.repository.EquationRepository;
@RestController
@RequestMapping(value="/equation")
public class EquationController {
	@Autowired
	private EquationRepository equationRepository;

	@GetMapping("")
	public Iterable<Equation> getAllEquations() {
		// This returns a JSON or XML with the users
		return equationRepository.findAllByOrderByNumberOfViewsDesc();
	}

}
