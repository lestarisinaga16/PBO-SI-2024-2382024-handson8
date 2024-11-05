package services;

import entities.TodoList;
import repositories.TodoListRespository;

public class TodoListServiceImpl implements TodoListServices {
    private final TodoListRespository todoListRespository;

    public TodoListServiceImpl(TodoListRespository todoListRespository) {
        this.todoListRespository = todoListRespository;
    }

    @Override
    public TodoList[] getTodoList() {
        return todoListRespository.getAll();
    }

    @Override
    public void addTodoList(final String todo) {
        if(todo.isEmpty() || todo.isBlank()){
            System.out.println("Masukkan todo dengan benar");
            return;
        }

        TodoList todoList = new TodoList();
        todoList.setTodo(todo);
        todoListRespository.add(todoList);
    }

    @Override
    public Boolean removeTodoList(final Integer Number) {
        return todoListRespository.remove(Number);
    }

    @Override
    public Boolean editTodoList( final Integer number, String todo) {
        TodoList todolist = new TodoList();
        todolist.setTodo(todo);
        todolist.setId(number);
        return todoListRespository.edit(todolist);
    }
}
