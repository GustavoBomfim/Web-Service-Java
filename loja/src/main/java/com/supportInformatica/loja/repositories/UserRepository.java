package com.supportInformatica.loja.repositories;

import com.supportInformatica.loja.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
