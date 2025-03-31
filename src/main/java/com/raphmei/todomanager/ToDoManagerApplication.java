package com.raphmei.todomanager;

import com.raphmei.todomanager.repository.TaskRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ToDoManagerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ToDoManagerApplication.class, args);
    }

}
