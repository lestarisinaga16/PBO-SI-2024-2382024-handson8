package services;

import entities.TodoList;

public interface TodoListServices {
    TodoList[] getTodoList();
    void addTodoList(String todo);
    Boolean removeTodoList(Integer Number);
    Boolean editTodoList(Integer number, String todo);
}
