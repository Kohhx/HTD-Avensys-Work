package com.demo.springboot.myfirstwebapp.todo;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

@Service
public class TodoService {

    private static List<Todo> todos = new ArrayList<>();
    private static int todoId = 0;

    {
        todos.add(new Todo(++todoId, "kohhx", "Learn Spring MVC", LocalDate.now().plusYears(1), false));
        todos.add(new Todo(++todoId, "kohhx", "Learn Angular", LocalDate.now().plusYears(2), false));
        todos.add(new Todo(++todoId, "kohhx", "Learn React", LocalDate.now().plusYears(1), false));
    }

    public List<Todo> findByUsername(String username) {
        return todos.stream().sorted((o1, o2) -> o1.getId() - o2.getId()).collect(Collectors.toList());
//        return todos;
    }

    public void addTodo(String username, String description, LocalDate date, boolean done) {
        todos.add(new Todo(++todoId, username, description, date, done));
    }

    public void deleteById(int id){
        Predicate<? super Todo> predicate = todo -> todo.getId() == id;
//        todos.removeIf(todo -> todo.getId() == id);
        todos.removeIf(predicate);
    }

    public Todo findById(int id){
        Predicate<? super Todo> predicate = todo -> todo.getId() == id;
        return todos.stream().filter(predicate).findFirst().get();
    }

    public void updateTodo(Todo todo) {
        deleteById(todo.getId());
        todos.add(todo);
    }
}
