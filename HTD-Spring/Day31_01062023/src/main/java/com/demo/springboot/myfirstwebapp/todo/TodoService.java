package com.demo.springboot.myfirstwebapp.todo;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class TodoService {

    private static List<Todo> todos = new ArrayList<>();

    {
        todos.add(new Todo(1, "kohhx", "Learn Spring MVC", LocalDate.now().plusYears(1), false));
        todos.add(new Todo(2, "leon", "Learn Angular", LocalDate.now().plusYears(2), false));
        todos.add(new Todo(3, "Jane", "Learn React", LocalDate.now().plusYears(1), false));
    }

    public List<Todo> findByUsername(String username) {
        return todos;
    }
}
