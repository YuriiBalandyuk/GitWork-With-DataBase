package DataBase;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class DataBaseFunction_ticket {
    private static final String table_ticket = "ticket";
    private static final String insert_data_query_ticket = "insert into %s(fk_media_id, price, place, format, fk_shedule_of_sessions_id, hall, fk_box_office_id) values('%s','%s','%s','%s','%s','%s','%s','%s');";
    private static final String select_query = "select * from %s";
    private  static final  String column_fk_media_id = "fk_media_id";
    private  static final  String column_price = "price";
    private  static final  String column_place = "place";
    private  static final  String column_format = "format";
    private  static final  String column_fk_shedule_of_sessions_id = "fk_shedule_of_sessions_id";
    private  static final  String column_hall = "hall";
    private  static final  String column_fk_box_office_id = "fk_box_office_id";

    public void insert_data_from_ticket_table(Connection connection, int fk_media_id, int price,int place, String format, int fk_shedule_of_sessions_id, String hall, int fk_box_office_id){
        Statement statement;
        try{
            String query = String.format(insert_data_query_ticket, table_ticket, fk_media_id, price, place, format, fk_shedule_of_sessions_id, hall, fk_box_office_id);
            statement = connection.createStatement();
            statement.executeUpdate(query);
            System.out.println("Inserted");

        }catch (Exception e){
            System.out.println(e);
            System.out.println("----------------------------------------------------------------------------------------------------------------");
        }
    }

    public void read_data_from_ticket_table(Connection connection){
        Statement statement;
        ResultSet resultSet = null;
        try{
            String query = String.format(select_query, table_ticket);
            statement = connection.createStatement();
            resultSet = statement.executeQuery(query);
            while(resultSet.next()){
                System.out.print(" | ");
                System.out.print(resultSet.getString("fk_media_id") + " | ");
                System.out.print(resultSet.getString("price") + " | ");
                System.out.print(resultSet.getString("place") + " | ");
                System.out.print(resultSet.getString("format") + " | ");
                System.out.print(resultSet.getString("fk_shedule_of_sessions_id") + " | ");
                System.out.print(resultSet.getString("hall") + " | ");
                System.out.println(resultSet.getString("fk_box_office_id") + " | \n");
            }

        }catch(Exception e){
            System.out.println(e);
            System.out.println("----------------------------------------------------------------------------------------------------------------");
        }
    }

    public void update_data_by_fk_media_id(Connection connection, int new_fk_media_id, int old_fk_media_id) {
        Statement statement;
        try {
            String query = String.format("update %s set fk_media_id='%s' where fk_media_id='%s'", table_ticket, new_fk_media_id, old_fk_media_id);
            statement = connection.createStatement();
            statement.executeUpdate(query);
            System.out.println("Data updated");

        }catch (Exception e){
            System.out.println(e);
            System.out.println("----------------------------------------------------------------------------------------------------------------");
        }
    }

    public void update_data_by_fk_price(Connection connection, int new_price, int old_price) {
        Statement statement;
        try {
            String query = String.format("update %s set price='%s' where price='%s'", table_ticket, new_price, old_price);
            statement = connection.createStatement();
            statement.executeUpdate(query);
            System.out.println("Data updated");

        }catch (Exception e){
            System.out.println(e);
            System.out.println("----------------------------------------------------------------------------------------------------------------");
        }
    }

    public void update_data_by_place(Connection connection, int new_place, int old_place) {
        Statement statement;
        try {
            String query = String.format("update %s set place='%s' where place='%s'", table_ticket, new_place, old_place);
            statement = connection.createStatement();
            statement.executeUpdate(query);
            System.out.println("Data updated");

        }catch (Exception e){
            System.out.println(e);
            System.out.println("----------------------------------------------------------------------------------------------------------------");
        }
    }

    public void update_data_by_format(Connection connection, String new_format, String old_format) {
        Statement statement;
        try {
            String query = String.format("update %s set format='%s' where format='%s'", table_ticket, new_format, old_format);
            statement = connection.createStatement();
            statement.executeUpdate(query);
            System.out.println("Data updated");

        }catch (Exception e){
            System.out.println(e);
            System.out.println("----------------------------------------------------------------------------------------------------------------");
        }
    }

    public void update_data_by_fk_shedule_of_sessions_id(Connection connection, int new_fk_shedule_of_sessions_id, int old_fk_shedule_of_sessions_id) {
        Statement statement;
        try {
            String query = String.format("update %s set fk_shedule_of_sessions_id='%s' where fk_shedule_of_sessions_id='%s'", table_ticket, new_fk_shedule_of_sessions_id, old_fk_shedule_of_sessions_id);
            statement = connection.createStatement();
            statement.executeUpdate(query);
            System.out.println("Data updated");

        }catch (Exception e){
            System.out.println(e);
            System.out.println("----------------------------------------------------------------------------------------------------------------");
        }
    }

    public void update_data_by_hall(Connection connection, String new_hall, String old_hall) {
        Statement statement;
        try {
            String query = String.format("update %s set hall='%s' where hall='%s'", table_ticket, new_hall, old_hall);
            statement = connection.createStatement();
            statement.executeUpdate(query);
            System.out.println("Data updated");

        }catch (Exception e){
            System.out.println(e);
            System.out.println("----------------------------------------------------------------------------------------------------------------");
        }
    }

    public void update_data_by_fk_box_office_id(Connection connection, int new_fk_box_office_id, int old_fk_box_office_id) {
        Statement statement;
        try {
            String query = String.format("update %s set fk_box_office_id='%s' where fk_box_office_id='%s'", table_ticket, new_fk_box_office_id, old_fk_box_office_id);
            statement = connection.createStatement();
            statement.executeUpdate(query);
            System.out.println("Data updated");

        }catch (Exception e){
            System.out.println(e);
            System.out.println("----------------------------------------------------------------------------------------------------------------");
        }
    }

    public void search_data_by_fk_media_id(Connection connection, int fk_media_id) {
        Statement statement;
        ResultSet resultSet = null;
        try {
            String query = String.format("select * from %s where fk_media_id= '%s'", table_ticket, fk_media_id);
            statement = connection.createStatement();
            resultSet = statement.executeQuery(query);
            while (resultSet.next()){
                System.out.print(" | ");
                System.out.print(resultSet.getString("fk_media_id") + " | ");
                System.out.print(resultSet.getString("price") + " | ");
                System.out.print(resultSet.getString("place") + " | ");
                System.out.print(resultSet.getString("format") + " | ");
                System.out.print(resultSet.getString("fk_shedule_of_sessions_id") + " | ");
                System.out.print(resultSet.getString("hall") + " | ");
                System.out.println(resultSet.getString("fk_box_office_id") + " | \n");
            }
        }catch (Exception e){
            System.out.println(e);
            System.out.println("----------------------------------------------------------------------------------------------------------------");
        }
    }

    public void search_data_by_price(Connection connection, int price) {
        Statement statement;
        ResultSet resultSet = null;
        try {
            String query = String.format("select * from %s where price= '%s'", table_ticket, price);
            statement = connection.createStatement();
            resultSet = statement.executeQuery(query);
            while (resultSet.next()){
                System.out.print(" | ");
                System.out.print(resultSet.getString("fk_media_id") + " | ");
                System.out.print(resultSet.getString("price") + " | ");
                System.out.print(resultSet.getString("place") + " | ");
                System.out.print(resultSet.getString("format") + " | ");
                System.out.print(resultSet.getString("fk_shedule_of_sessions_id") + " | ");
                System.out.print(resultSet.getString("hall") + " | ");
                System.out.println(resultSet.getString("fk_box_office_id") + " | \n");
            }
        }catch (Exception e){
            System.out.println(e);
            System.out.println("----------------------------------------------------------------------------------------------------------------");
        }
    }

    public void search_data_by_place(Connection connection, int place) {
        Statement statement;
        ResultSet resultSet = null;
        try {
            String query = String.format("select * from %s where place= '%s'", table_ticket,place);
            statement = connection.createStatement();
            resultSet = statement.executeQuery(query);
            while (resultSet.next()){
                System.out.print(" | ");
                System.out.print(resultSet.getString("fk_media_id") + " | ");
                System.out.print(resultSet.getString("price") + " | ");
                System.out.print(resultSet.getString("place") + " | ");
                System.out.print(resultSet.getString("format") + " | ");
                System.out.print(resultSet.getString("fk_shedule_of_sessions_id") + " | ");
                System.out.print(resultSet.getString("hall") + " | ");
                System.out.println(resultSet.getString("fk_box_office_id") + " | \n");
            }
        }catch (Exception e){
            System.out.println(e);
            System.out.println("----------------------------------------------------------------------------------------------------------------");
        }
    }

    public void search_data_by_format(Connection connection, String format) {
        Statement statement;
        ResultSet resultSet = null;
        try {
            String query = String.format("select * from %s where format= '%s'", table_ticket, format);
            statement = connection.createStatement();
            resultSet = statement.executeQuery(query);
            while (resultSet.next()){
                System.out.print(" | ");
                System.out.print(resultSet.getString("fk_media_id") + " | ");
                System.out.print(resultSet.getString("price") + " | ");
                System.out.print(resultSet.getString("place") + " | ");
                System.out.print(resultSet.getString("format") + " | ");
                System.out.print(resultSet.getString("fk_shedule_of_sessions_id") + " | ");
                System.out.print(resultSet.getString("hall") + " | ");
                System.out.println(resultSet.getString("fk_box_office_id") + " | \n");
            }
        }catch (Exception e){
            System.out.println(e);
            System.out.println("----------------------------------------------------------------------------------------------------------------");
        }
    }

    public void search_data_by_fk_shedule_of_sessions_id(Connection connection, int fk_shedule_of_sessions_id) {
        Statement statement;
        ResultSet resultSet = null;
        try {
            String query = String.format("select * from %s where fk_shedule_of_sessions_id= '%s'", table_ticket, fk_shedule_of_sessions_id);
            statement = connection.createStatement();
            resultSet = statement.executeQuery(query);
            while (resultSet.next()){
                System.out.print(" | ");
                System.out.print(resultSet.getString("fk_media_id") + " | ");
                System.out.print(resultSet.getString("price") + " | ");
                System.out.print(resultSet.getString("place") + " | ");
                System.out.print(resultSet.getString("format") + " | ");
                System.out.print(resultSet.getString("fk_shedule_of_sessions_id") + " | ");
                System.out.print(resultSet.getString("hall") + " | ");
                System.out.println(resultSet.getString("fk_box_office_id") + " | \n");
            }
        }catch (Exception e){
            System.out.println(e);
            System.out.println("----------------------------------------------------------------------------------------------------------------");
        }
    }

    public void search_data_by_hall(Connection connection, String hall) {
        Statement statement;
        ResultSet resultSet = null;
        try {
            String query = String.format("select * from %s where hall= '%s'", table_ticket, hall);
            statement = connection.createStatement();
            resultSet = statement.executeQuery(query);
            while (resultSet.next()){
                System.out.print(" | ");
                System.out.print(resultSet.getString("fk_media_id") + " | ");
                System.out.print(resultSet.getString("price") + " | ");
                System.out.print(resultSet.getString("place") + " | ");
                System.out.print(resultSet.getString("format") + " | ");
                System.out.print(resultSet.getString("fk_shedule_of_sessions_id") + " | ");
                System.out.print(resultSet.getString("hall") + " | ");
                System.out.println(resultSet.getString("fk_box_office_id") + " | \n");
            }
        }catch (Exception e){
            System.out.println(e);
            System.out.println("----------------------------------------------------------------------------------------------------------------");
        }
    }

    public void search_data_by_fk_box_office_id(Connection connection, int fk_box_office_id) {
        Statement statement;
        ResultSet resultSet = null;
        try {
            String query = String.format("select * from %s where fk_box_office_id= '%s'", table_ticket, fk_box_office_id);
            statement = connection.createStatement();
            resultSet = statement.executeQuery(query);
            while (resultSet.next()){
                System.out.print(" | ");
                System.out.print(resultSet.getString("fk_media_id") + " | ");
                System.out.print(resultSet.getString("price") + " | ");
                System.out.print(resultSet.getString("place") + " | ");
                System.out.print(resultSet.getString("format") + " | ");
                System.out.print(resultSet.getString("fk_shedule_of_sessions_id") + " | ");
                System.out.print(resultSet.getString("hall") + " | ");
                System.out.println(resultSet.getString("fk_box_office_id") + " | \n");
            }
        }catch (Exception e){
            System.out.println(e);
            System.out.println("----------------------------------------------------------------------------------------------------------------");
        }
    }

    public void delete_data_by_fk_media_id(Connection connection, int fk_media_id){
        Statement statement;
        try{
            String query = String.format("delete from %s where fk_media_id= '%s'", table_ticket, fk_media_id);
            statement = connection.createStatement();
            statement.executeUpdate(query);
            System.out.println("Data deleted");

        }catch (Exception e){
            System.out.println(e);
            System.out.println("----------------------------------------------------------------------------------------------------------------");
        }
    }

    public void delete_data_by_price(Connection connection, int price){
        Statement statement;
        try{
            String query = String.format("delete from %s where price= '%s'", table_ticket, price);
            statement = connection.createStatement();
            statement.executeUpdate(query);
            System.out.println("Data deleted");

        }catch (Exception e){
            System.out.println(e);
            System.out.println("----------------------------------------------------------------------------------------------------------------");
        }
    }

    public void delete_data_by_place(Connection connection, int place){
        Statement statement;
        try{
            String query = String.format("delete from %s where place= '%s'", table_ticket, place);
            statement = connection.createStatement();
            statement.executeUpdate(query);
            System.out.println("Data deleted");

        }catch (Exception e){
            System.out.println(e);
            System.out.println("----------------------------------------------------------------------------------------------------------------");
        }
    }

    public void delete_data_by_format(Connection connection, String format){
        Statement statement;
        try{
            String query = String.format("delete from %s where format= '%s'", table_ticket, format);
            statement = connection.createStatement();
            statement.executeUpdate(query);
            System.out.println("Data deleted");

        }catch (Exception e){
            System.out.println(e);
            System.out.println("----------------------------------------------------------------------------------------------------------------");
        }
    }

    public void delete_data_by_fk_shedule_of_sessions_id(Connection connection, int fk_shedule_of_sessions_id){
        Statement statement;
        try{
            String query = String.format("delete from %s where fk_shedule_of_sessions_id= '%s'", table_ticket, fk_shedule_of_sessions_id);
            statement = connection.createStatement();
            statement.executeUpdate(query);
            System.out.println("Data deleted");

        }catch (Exception e){
            System.out.println(e);
            System.out.println("----------------------------------------------------------------------------------------------------------------");
        }
    }

    public void delete_data_by_hall(Connection connection, String hall){
        Statement statement;
        try{
            String query = String.format("delete from %s where hall= '%s'", table_ticket, hall);
            statement = connection.createStatement();
            statement.executeUpdate(query);
            System.out.println("Data deleted");

        }catch (Exception e){
            System.out.println(e);
            System.out.println("----------------------------------------------------------------------------------------------------------------");
        }
    }

    public void delete_data_by_fk_box_office_id(Connection connection, int fk_box_office_id){
        Statement statement;
        try{
            String query = String.format("delete from %s where fk_box_office_id= '%s'", table_ticket, fk_box_office_id);
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
                    query = String.format("select * from %s order by %s", table_ticket, column_fk_media_id);
                    break;
                }

                if(choice == 2){
                    query = String.format("select * from %s order by %s", table_ticket, column_price);
                    break;
                }

                if(choice == 3){
                    query = String.format("select * from %s order by %s", table_ticket, column_place);
                    break;
                }

                if(choice == 4){
                    query = String.format("select * from %s order by %s", table_ticket, column_format);
                    break;
                }

                if(choice == 5){
                    query = String.format("select * from %s order by %s", table_ticket, column_fk_shedule_of_sessions_id);
                    break;
                }

                if(choice == 6){
                    query = String.format("select * from %s order by %s", table_ticket, column_hall);
                    break;
                }

                if(choice == 7){
                    query = String.format("select * from %s order by %s", table_ticket, column_fk_box_office_id);
                    break;
                }
            }while (true);

            resultSet = statement.executeQuery(query);
            while(resultSet.next()){
                System.out.print(" | ");
                System.out.print(resultSet.getString("fk_media_id") + " | ");
                System.out.print(resultSet.getString("price") + " | ");
                System.out.print(resultSet.getString("place") + " | ");
                System.out.print(resultSet.getString("format") + " | ");
                System.out.print(resultSet.getString("fk_shedule_of_sessions_id") + " | ");
                System.out.print(resultSet.getString("hall") + " | ");
                System.out.println(resultSet.getString("fk_box_office_id") + " | \n");
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
