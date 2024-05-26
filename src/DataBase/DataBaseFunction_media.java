package DataBase;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class DataBaseFunction_media {
    private static final String table_media = "media";
    private static final String insert_data_query_media = "insert into %s(title, fk_studio_id, description, fk_media_category, fees, fk_cinema_id) values('%s','%s','%s','%s','%s','%s');";
    private static final String select_query_media = "select * from %s";

    private  static final  String column_title = "title";

    private  static final  String column_fk_studio_id = "fk_studio_id";

    private  static final  String column_description = "description";

    private  static final  String column_fk_media_category_id = "fk_media_category_id";
    private  static final  String column_fk_fees = "fees";
    private  static final  String column_fk_cinema_id = "fk_cinema_id";


    public void insert_data_from_media_table(Connection connection, String title, int fk_studio_id, String description, int fk_media_category_id, String fees, int fk_cinema_id){
        Statement statement;
        try{
            String query = String.format(insert_data_query_media, table_media, title, fk_studio_id, description, fk_media_category_id, fees, fk_cinema_id);
            statement = connection.createStatement();
            statement.executeUpdate(query);
            System.out.println("Inserted");

        }catch (Exception e){
            System.out.println(e);
            System.out.println("----------------------------------------------------------------------------------------------------------------");
        }
    }

    public void read_data_from_client_table(Connection connection){
        Statement statement;
        ResultSet resultSet = null;
        try{
            String query = String.format(select_query_media, table_media);
            statement = connection.createStatement();
            resultSet = statement.executeQuery(query);
            while(resultSet.next()){
                System.out.print(" | ");
                System.out.print(resultSet.getString("title") + " | ");
                System.out.print(resultSet.getString("fk_studio_id") + " | ");
                System.out.print(resultSet.getString("description") + " | ");
                System.out.print(resultSet.getString("fk_media_category_id") + " | ");
                System.out.print(resultSet.getString("fees") + " | ");
                System.out.println(resultSet.getString("fk_cinema_id") + " | \n");
            }

        }catch(Exception e){
            System.out.println(e);
            System.out.println("----------------------------------------------------------------------------------------------------------------");
        }
    }

    public void update_data_by_title(Connection connection, String new_title, String old_title) {
        Statement statement;
        try {
            String query = String.format("update %s set title='%s' where title='%s'", table_media, new_title, old_title);
            statement = connection.createStatement();
            statement.executeUpdate(query);
            System.out.println("Data updated");

        }catch (Exception e){
            System.out.println(e);
            System.out.println("----------------------------------------------------------------------------------------------------------------");
        }
    }

    public void update_data_by_fk_studio_id(Connection connection, int new_fk_studio_id, int old_fk_studio_id) {
        Statement statement;
        try {
            String query = String.format("update %s set fk_studio_id='%s' where fk_studio_id='%s'", table_media, new_fk_studio_id, old_fk_studio_id);
            statement = connection.createStatement();
            statement.executeUpdate(query);
            System.out.println("Data updated");

        }catch (Exception e){
            System.out.println(e);
            System.out.println("----------------------------------------------------------------------------------------------------------------");
        }
    }

    public void update_data_by_description(Connection connection, String new_description, String old_description) {
        Statement statement;
        try {
            String query = String.format("update %s set description='%s' where description='%s'", table_media, new_description, old_description);
            statement = connection.createStatement();
            statement.executeUpdate(query);
            System.out.println("Data updated");

        }catch (Exception e){
            System.out.println(e);
            System.out.println("----------------------------------------------------------------------------------------------------------------");
        }
    }

    public void update_data_by_fk_media_category_id(Connection connection, int new_fk_media_category_id, int old_fk_media_category_id) {
        Statement statement;
        try {
            String query = String.format("update %s set fk_media_category_id='%s' where fk_media_category_id='%s'", table_media, new_fk_media_category_id, old_fk_media_category_id);
            statement = connection.createStatement();
            statement.executeUpdate(query);
            System.out.println("Data updated");

        }catch (Exception e){
            System.out.println(e);
            System.out.println("----------------------------------------------------------------------------------------------------------------");
        }
    }

    public void update_data_by_fees(Connection connection, String new_fees, String old_fees) {
        Statement statement;
        try {
            String query = String.format("update %s set fees='%s' where fees='%s'", table_media, new_fees, old_fees);
            statement = connection.createStatement();
            statement.executeUpdate(query);
            System.out.println("Data updated");

        }catch (Exception e){
            System.out.println(e);
            System.out.println("----------------------------------------------------------------------------------------------------------------");
        }
    }

    public void update_data_by_fk_cinema_id(Connection connection, int new_fk_cinema_id, int old_fk_cinema_id) {
        Statement statement;
        try {
            String query = String.format("update %s set fk_cinema_id='%s' where fk_cinema_id='%s'", table_media, new_fk_cinema_id, old_fk_cinema_id);
            statement = connection.createStatement();
            statement.executeUpdate(query);
            System.out.println("Data updated");

        }catch (Exception e){
            System.out.println(e);
            System.out.println("----------------------------------------------------------------------------------------------------------------");
        }
    }

    public void search_data_by_title(Connection connection, String title) {
        Statement statement;
        ResultSet resultSet = null;
        try {
            String query = String.format("select * from %s where title= '%s'", table_media, title);
            statement = connection.createStatement();
            resultSet = statement.executeQuery(query);
            while (resultSet.next()){
                System.out.print(" | ");
                System.out.print(resultSet.getString("title") + " | ");
                System.out.print(resultSet.getString("fk_studio_id") + " | ");
                System.out.print(resultSet.getString("description") + " | ");
                System.out.print(resultSet.getString("fk_media_category_id") + " | ");
                System.out.print(resultSet.getString("fees") + " | ");
                System.out.println(resultSet.getString("fk_cinema_id") + " | \n");
            }

        }catch (Exception e){
            System.out.println(e);
            System.out.println("----------------------------------------------------------------------------------------------------------------");
        }

    }

    public void search_data_by_fk_studio_id(Connection connection, int fk_studio_id) {
        Statement statement;
        ResultSet resultSet = null;
        try {
            String query = String.format("select * from %s where fk_studio_id= '%s'", table_media, fk_studio_id);
            statement = connection.createStatement();
            resultSet = statement.executeQuery(query);
            while (resultSet.next()){
                System.out.print(" | ");
                System.out.print(resultSet.getString("title") + " | ");
                System.out.print(resultSet.getString("fk_studio_id") + " | ");
                System.out.print(resultSet.getString("description") + " | ");
                System.out.print(resultSet.getString("fk_media_category_id") + " | ");
                System.out.print(resultSet.getString("fees") + " | ");
                System.out.println(resultSet.getString("fk_cinema_id") + " | \n");
            }

        }catch (Exception e){
            System.out.println(e);
            System.out.println("----------------------------------------------------------------------------------------------------------------");
        }

    }

    public void search_data_by_fk_media_category_id(Connection connection, int fk_media_category_id) {
        Statement statement;
        ResultSet resultSet = null;
        try {
            String query = String.format("select * from %s where fk_media_category_id= '%s'", table_media,fk_media_category_id);
            statement = connection.createStatement();
            resultSet = statement.executeQuery(query);
            while (resultSet.next()){
                System.out.print(" | ");
                System.out.print(resultSet.getString("title") + " | ");
                System.out.print(resultSet.getString("fk_studio_id") + " | ");
                System.out.print(resultSet.getString("description") + " | ");
                System.out.print(resultSet.getString("fk_media_category_id") + " | ");
                System.out.print(resultSet.getString("fees") + " | ");
                System.out.println(resultSet.getString("fk_cinema_id") + " | \n");
            }

        }catch (Exception e){
            System.out.println(e);
            System.out.println("----------------------------------------------------------------------------------------------------------------");
        }

    }

    public void search_data_by_phone_fees(Connection connection, String fees) {
        Statement statement;
        ResultSet resultSet = null;
        try {
            String query = String.format("select * from %s where fees= '%s'", table_media, fees);
            statement = connection.createStatement();
            resultSet = statement.executeQuery(query);
            while (resultSet.next()){
                System.out.print(" | ");
                System.out.print(resultSet.getString("title") + " | ");
                System.out.print(resultSet.getString("fk_studio_id") + " | ");
                System.out.print(resultSet.getString("description") + " | ");
                System.out.print(resultSet.getString("fk_media_category_id") + " | ");
                System.out.print(resultSet.getString("fees") + " | ");
                System.out.println(resultSet.getString("fk_cinema_id") + " | \n");
            }

        }catch (Exception e){
            System.out.println(e);
            System.out.println("----------------------------------------------------------------------------------------------------------------");
        }

    }

    public void search_data_by_fk_cinema_id(Connection connection, int fk_cinema_id) {
        Statement statement;
        ResultSet resultSet = null;
        try {
            String query = String.format("select * from %s where fk_cinema_id= '%s'", table_media, fk_cinema_id);
            statement = connection.createStatement();
            resultSet = statement.executeQuery(query);
            while (resultSet.next()){
                System.out.print(" | ");
                System.out.print(resultSet.getString("title") + " | ");
                System.out.print(resultSet.getString("fk_studio_id") + " | ");
                System.out.print(resultSet.getString("description") + " | ");
                System.out.print(resultSet.getString("fk_media_category_id") + " | ");
                System.out.print(resultSet.getString("fees") + " | ");
                System.out.println(resultSet.getString("fk_cinema_id") + " | \n");
            }

        }catch (Exception e){
            System.out.println(e);
            System.out.println("----------------------------------------------------------------------------------------------------------------");
        }

    }

    public void delete_data_by_title(Connection connection, String title){
        Statement statement;
        try{
            String query = String.format("delete from %s where title= '%s'", table_media, title);
            statement = connection.createStatement();
            statement.executeUpdate(query);
            System.out.println("Data deleted");

        }catch (Exception e){
            System.out.println(e);
            System.out.println("----------------------------------------------------------------------------------------------------------------");
        }
    }

    public void delete_data_by_fk_studio_id(Connection connection, int fk_studio_id){
        Statement statement;
        try{
            String query = String.format("delete from %s where fk_studio_id= '%s'", table_media, fk_studio_id);
            statement = connection.createStatement();
            statement.executeUpdate(query);
            System.out.println("Data deleted");

        }catch (Exception e){
            System.out.println(e);
            System.out.println("----------------------------------------------------------------------------------------------------------------");
        }
    }

    public void delete_data_by_fk_media_category_id(Connection connection, int fk_media_category_id){
        Statement statement;
        try{
            String query = String.format("delete from %s where fk_media_category_id= '%s'", table_media, fk_media_category_id);
            statement = connection.createStatement();
            statement.executeUpdate(query);
            System.out.println("Data deleted");

        }catch (Exception e){
            System.out.println(e);
            System.out.println("----------------------------------------------------------------------------------------------------------------");
        }
    }

    public void delete_data_by_fees(Connection connection, String fees){
        Statement statement;
        try{
            String query = String.format("delete from %s where fees= '%s'", table_media, fees);
            statement = connection.createStatement();
            statement.executeUpdate(query);
            System.out.println("Data deleted");

        }catch (Exception e){
            System.out.println(e);
            System.out.println("----------------------------------------------------------------------------------------------------------------");
        }
    }

    public void delete_data_by_fk_cinema_id(Connection connection, int fk_cinema_id){
        Statement statement;
        try{
            String query = String.format("delete from %s where fk_cinema_id= '%s'", table_media, fk_cinema_id);
            statement = connection.createStatement();
            statement.executeUpdate(query);
            System.out.println("Data deleted");

        }catch (Exception e){
            System.out.println(e);
            System.out.println("----------------------------------------------------------------------------------------------------------------");
        }
    }

    public  void sort_data_by_column(Connection connection, int choice){
        Statement statement;
        ResultSet resultSet = null;
        String query;
        try{
            statement = connection.createStatement();
            do{
                if(choice == 1){
                    query = String.format("select * from %s order by %s", table_media, column_title);
                    break;
                }

                if(choice == 2){
                    query = String.format("select * from %s order by %s", table_media, column_fk_studio_id);
                    break;
                }

                if(choice == 3){
                    query = String.format("select * from %s order by %s", table_media, column_description);
                    break;
                }

                if(choice == 4){
                    query = String.format("select * from %s order by %s", table_media, column_fk_media_category_id);
                    break;
                }

                if(choice == 5){
                    query = String.format("select * from %s order by %s", table_media, column_fk_fees);
                    break;
                }

                if(choice == 6){
                    query = String.format("select * from %s order by %s", table_media, column_fk_cinema_id);
                    break;
                }
            }while (true);

            resultSet = statement.executeQuery(query);
            while(resultSet.next()){
                System.out.print(" | ");
                System.out.print(resultSet.getString("title") + " | ");
                System.out.print(resultSet.getString("fk_studio_id") + " | ");
                System.out.print(resultSet.getString("description") + " | ");
                System.out.print(resultSet.getString("fk_media_category_id") + " | ");
                System.out.print(resultSet.getString("fees") + " | ");
                System.out.println(resultSet.getString("fk_cinema_id") + " | \n");
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
