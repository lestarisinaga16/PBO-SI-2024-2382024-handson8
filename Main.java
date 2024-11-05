import repositories.TodoListRepositoryImpl;
import repositories.TodoListRespository;
import services.TodoListServiceImpl;
import services.TodoListServices;
import views.TodoListTerminalView;
import views.TodoListView;

public class Main {
    public static void main(String[] args) {
        TodoListRespository todoListRespository = new TodoListRepositoryImpl();
        TodoListServices todoListServices = new TodoListServiceImpl(todoListRespository);
        TodoListView todoListView = new TodoListTerminalView(todoListServices);
        todoListView.run();


    }
}
