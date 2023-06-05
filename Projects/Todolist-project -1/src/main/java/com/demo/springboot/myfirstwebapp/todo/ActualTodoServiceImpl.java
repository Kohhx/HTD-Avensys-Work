package com.demo.springboot.myfirstwebapp.todo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Primary
public class ActualTodoServiceImpl implements TodoService {

    private final TodoRepository repository;

    public ActualTodoServiceImpl(TodoRepository repository) {
        this.repository = repository;
    }

    @Override
    public void addTodo(String username, Todo todo) {
        todo.setUserName(username);
        repository.save(todo);
    }

    @Override
    public List<Todo> getAllTodos(String username) {
        return repository.findAll();
    }

    @Override
    public Todo getTodoById(int id) {
        return repository.findById(id)
                .orElseThrow(() -> new IllegalStateException("Cannot find todo with ID: " + id));
    }

    @Override
    public boolean deleteTodoById(int id) {
        Todo todoFound = getTodoById(id);
        repository.delete(todoFound);
        return true;
    }

    @Override
    public boolean updateTodo(Todo todo) {
        Todo todoFound = getTodoById(todo.getId());
        todoFound.setDescription(todo.getDescription());
        todoFound.setTargetDate(todo.getTargetDate());
        todoFound.setDone(todo.isDone());
        repository.save(todoFound);
        return true;
    }
}
