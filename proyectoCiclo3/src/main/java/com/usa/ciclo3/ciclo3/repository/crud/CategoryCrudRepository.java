package com.usa.ciclo3.ciclo3.repository.crud;

import com.usa.ciclo3.ciclo3.model.Category;
import com.usa.ciclo3.ciclo3.model.Skateboard;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryCrudRepository extends JpaRepository<Category, Integer> {
}
