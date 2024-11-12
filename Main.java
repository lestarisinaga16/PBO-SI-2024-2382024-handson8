import config.Database;
import repositories.TodoListRepositoryDblmpl;
import repositories.TodoListRepositoryImpl;
import repositories.TodoListRespository;
import services.TodoListServiceImpl;
import services.TodoListServices;
import views.TodoListTerminalView;
import views.TodoListView;

public class Main {
    public static void main(String[] args) {
       Database database = new Database("databaseku", "root", "", "localhost", "3306");
       database.setup();

       TodoListRespository todoListRespository = new TodoListRepositoryDblmpl(database);
        TodoListServices todoListServices = new TodoListServiceImpl(todoListRespository);
        TodoListView todoListView = new TodoListTerminalView(todoListServices);
        todoListView.run();//


    }
}
