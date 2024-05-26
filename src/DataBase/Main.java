package DataBase;
import java.sql.Connection;


public class Main {
    public static void main(String[] args) {
        ConnectionDataBaseFunction connectionDataBaseFunction = new ConnectionDataBaseFunction();
        Connection connection = connectionDataBaseFunction.connect_to_db("cinema", "postgres", "123456789");

        MainMenu mainMenu = new MainMenu();
        mainMenu.ChoiceMenu(connection);
    }
}