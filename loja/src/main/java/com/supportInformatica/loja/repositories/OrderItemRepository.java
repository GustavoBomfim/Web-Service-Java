package com.supportInformatica.loja.repositories;

import com.supportInformatica.loja.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
