package com.learningweb.webservices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.learningweb.webservices.entities.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

}
