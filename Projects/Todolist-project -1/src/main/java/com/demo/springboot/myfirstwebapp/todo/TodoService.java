package com.demo.springboot.myfirstwebapp.todo;

import java.util.List;

public interface TodoService {

    void addTodo(String username, Todo todo);

    List<Todo> getAllTodos(String username);

    Todo getTodoById(int id);

    boolean deleteTodoById(int id);

    boolean updateTodo(Todo todo);

}
