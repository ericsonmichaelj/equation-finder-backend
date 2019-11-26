package net.equationFinder.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.equationFinder.entity.Category;
import net.equationFinder.repository.CategoryRepository;

@RestController
@RequestMapping(value="/category")
public class CategoryController {
	@Autowired
	private CategoryRepository categoryRepository;

	@GetMapping("")
	public Iterable<Category> getAllCategories() {
		// This returns a JSON or XML with the users
		return categoryRepository.findAll();
	}

}