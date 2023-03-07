package com.supportInformatica.loja.config;

import com.supportInformatica.loja.entities.Category;
import com.supportInformatica.loja.entities.Order;
import com.supportInformatica.loja.entities.User;
import com.supportInformatica.loja.entities.enums.OrderStatus;
import com.supportInformatica.loja.repositories.CategoryRepository;
import com.supportInformatica.loja.repositories.OrderRepository;
import com.supportInformatica.loja.repositories.UserRepository;
import org.aspectj.weaver.ast.Or;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.Instant;
import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public void run(String... args) throws Exception{

        Category category1 = new Category(null, "Electronics");
        Category category2 = new Category(null, "Books");
        Category category3 = new Category(null, "Computers");

        categoryRepository.saveAll(Arrays.asList(category1, category2, category3));

        User user1 = new User(null, "Maria Rangel", "maria@gmail.com", "1234889", "123456");
        User user2 = new User(null, "Gustavo Soares", "gustavo@gmail.com", "98765432", "123456");

        Order order1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), OrderStatus.PAID, user1);
        Order order2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"), OrderStatus.WAITING_PAYMENT, user2);
        Order order3 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"), OrderStatus.WAITING_PAYMENT, user1);

        userRepository.saveAll(Arrays.asList(user1, user2));
        orderRepository.saveAll(Arrays.asList(order1, order2, order3));

    }
}
