package com.supportInformatica.loja.repositories;

import com.supportInformatica.loja.entities.Category;
import com.supportInformatica.loja.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
