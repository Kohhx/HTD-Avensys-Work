package com.demo.springboot.myfirstwebapp.bootstrap;

import com.demo.springboot.myfirstwebapp.todo.Todo;
import com.demo.springboot.myfirstwebapp.todo.TodoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Component
public class TodoApplicationCommandLineRunner implements CommandLineRunner {

    private final TodoRepository repository;

    public TodoApplicationCommandLineRunner(TodoRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(String... args) throws Exception {
        List<Todo> todos = new ArrayList<>();

        todos.add(new Todo( "kohhx", "Learn Spring MVC", LocalDate.now().plusYears(1), false));
        todos.add(new Todo( "kohhx", "Learn Angular", LocalDate.now().plusYears(2), false));
        todos.add(new Todo( "kohhx", "Learn React", LocalDate.now().plusYears(1), false));

        repository.saveAll(todos);
    }
}
