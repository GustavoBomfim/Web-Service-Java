package com.supportInformatica.loja.repositories;

import com.supportInformatica.loja.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
