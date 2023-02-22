package com.supportInformatica.loja.config;

import com.supportInformatica.loja.entities.User;
import com.supportInformatica.loja.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception{
        User user1 = new User(null, "Maria Rangel", "maria@gmail.com", "1234889", "123456");
        User user2 = new User(null, "Gustavo Soares", "gustavo@gmail.com", "98765432", "123456");

        userRepository.saveAll(Arrays.asList(user1, user2));

    }
}
