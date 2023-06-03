package com.demo.springboot.myfirstwebapp.todo;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

@Service
public class HardCodedTodoServiceImpl implements TodoService{

    private static List<Todo> todos = new ArrayList<>();
    private static int todoId = 0;

    {
        todos.add(new Todo(++todoId, "kohhx", "Learn Spring MVC", LocalDate.now().plusYears(1), false));
        todos.add(new Todo(++todoId, "kohhx", "Learn Angular", LocalDate.now().plusYears(2), false));
        todos.add(new Todo(++todoId, "kohhx", "Learn React", LocalDate.now().plusYears(1), false));
    }

    @Override
    public List<Todo> getAllTodos(String username) {
        return todos.stream().sorted((o1, o2) -> o1.getId() - o2.getId()).collect(Collectors.toList());
    }

    @Override
    public void addTodo(String username, Todo todo) {
        todos.add(new Todo(++todoId, username, todo.getDescription(), todo.getTargetDate(), todo.isDone()));
    }

    @Override
    public boolean deleteTodoById(int id){
        Predicate<? super Todo> predicate = todo -> todo.getId() == id;
        todos.removeIf(predicate);
        return true;
    }

    @Override
    public Todo getTodoById(int id){
        Predicate<? super Todo> predicate = todo -> todo.getId() == id;
        return todos.stream().filter(predicate).findFirst().get();
    }

    @Override
    public boolean updateTodo(Todo todo) {
        deleteTodoById(todo.getId());
        todos.add(todo);
        return true;
    }

}
