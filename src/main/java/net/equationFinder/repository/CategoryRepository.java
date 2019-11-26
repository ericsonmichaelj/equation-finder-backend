package net.equationFinder.repository;

import org.springframework.data.repository.CrudRepository;

import net.equationFinder.entity.Category;

public interface CategoryRepository  extends CrudRepository<Category, Integer> {

}
