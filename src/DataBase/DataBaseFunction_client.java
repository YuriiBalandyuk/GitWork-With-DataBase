package DataBase;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class DataBaseFunction_client {
    private static final String table_client = "client";
    private static final String insert_data_query_client = "insert into %s(name, surname, parent, phone_number, e_mail) values('%s','%s','%s','%s','%s');";
    private static final String select_query_client = "select * from %s";
    private  static final  String column_name = "name";
    private  static final  String column_surname = "surname";
    private  static final  String column_parent = "parent";
    private  static final  String column_phone_number = "phone_number";
    private  static final  String column_e_mail = "e_mail";


    public void insert_data_from_client_table(Connection connection, String name, String surname, String parent, int phone_number, String e_mail){
        Statement statement;
        try{
            String query = String.format(insert_data_query_client, table_client, name, surname, parent, phone_number, e_mail);
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
            String query = String.format(select_query_client, table_client);
            statement = connection.createStatement();
            resultSet = statement.executeQuery(query);
            while(resultSet.next()){
                System.out.print(" | ");
                System.out.print(resultSet.getString("name") + " | ");
                System.out.print(resultSet.getString("surname") + " | ");
                System.out.print(resultSet.getString("parent") + " | ");
                System.out.print(resultSet.getString("phone_number") + " | ");
                System.out.println(resultSet.getString("e_mail") + " | \n");
            }

        }catch(Exception e){
            System.out.println(e);
            System.out.println("----------------------------------------------------------------------------------------------------------------");
        }
    }

    public void update_data_by_name(Connection connection, String new_name, String old_name) {
        Statement statement;
        try {
            String query = String.format("update %s set name='%s' where name='%s'", table_client, new_name, old_name);
            statement = connection.createStatement();
            statement.executeUpdate(query);
            System.out.println("Data updated");

        }catch (Exception e){
            System.out.println(e);
            System.out.println("----------------------------------------------------------------------------------------------------------------");
        }
    }

    public void update_data_by_surname(Connection connection, String new_surname, String old_surname) {
        Statement statement;
        try {
            String query = String.format("update %s set surname='%s' where surname='%s'", table_client, new_surname, old_surname);
            statement = connection.createStatement();
            statement.executeUpdate(query);
            System.out.println("Data updated");

        }catch (Exception e){
            System.out.println(e);
            System.out.println("----------------------------------------------------------------------------------------------------------------");
        }
    }

    public void update_data_by_parent(Connection connection, String new_parent, String old_parent) {
        Statement statement;
        try {
            String query = String.format("update %s set parent='%s' where parent='%s'", table_client, new_parent, old_parent);
            statement = connection.createStatement();
            statement.executeUpdate(query);
            System.out.println("Data updated");

        }catch (Exception e){
            System.out.println(e);
            System.out.println("----------------------------------------------------------------------------------------------------------------");
        }
    }

    public void update_data_by_phone_number(Connection connection, int new_phone_number, int old_phone_number) {
        Statement statement;
        try {
            String query = String.format("update %s set phone_number='%s' where phone_number='%s'", table_client, new_phone_number, old_phone_number);
            statement = connection.createStatement();
            statement.executeUpdate(query);
            System.out.println("Data updated");

        }catch (Exception e){
            System.out.println(e);
            System.out.println("----------------------------------------------------------------------------------------------------------------");
        }
    }

    public void update_data_by_e_mail(Connection connection, String new_e_mail, String old_e_mail) {
        Statement statement;
        try {
            String query = String.format("update %s set e_mail='%s' where e_mail='%s'", table_client, new_e_mail, old_e_mail);
            statement = connection.createStatement();
            statement.executeUpdate(query);
            System.out.println("Data updated");

        }catch (Exception e){
            System.out.println(e);
            System.out.println("----------------------------------------------------------------------------------------------------------------");
        }
    }

    public void search_data_by_name(Connection connection, String name) {
        Statement statement;
        ResultSet resultSet = null;
        try {
            String query = String.format("select * from %s where name= '%s'", table_client, name);
            statement = connection.createStatement();
            resultSet = statement.executeQuery(query);
            while (resultSet.next()){
                System.out.print(" | ");
                System.out.print(resultSet.getString("name") + " | ");
                System.out.print(resultSet.getString("surname") + " | ");
                System.out.print(resultSet.getString("parent") + " | ");
                System.out.print(resultSet.getString("phone_number") + " | ");
                System.out.println(resultSet.getString("e_mail") + " | \n");
            }

        }catch (Exception e){
            System.out.println(e);
            System.out.println("----------------------------------------------------------------------------------------------------------------");
        }

    }

    public void search_data_by_surname(Connection connection, String surname) {
        Statement statement;
        ResultSet resultSet = null;
        try {
            String query = String.format("select * from %s where surname= '%s'", table_client, surname);
            statement = connection.createStatement();
            resultSet = statement.executeQuery(query);
            while (resultSet.next()){
                System.out.print(" | ");
                System.out.print(resultSet.getString("name") + " | ");
                System.out.print(resultSet.getString("surname") + " | ");
                System.out.print(resultSet.getString("parent") + " | ");
                System.out.print(resultSet.getString("phone_number") + " | ");
                System.out.println(resultSet.getString("e_mail") + " | \n");
            }

        }catch (Exception e){
            System.out.println(e);
            System.out.println("----------------------------------------------------------------------------------------------------------------");
        }

    }

    public void search_data_by_parent(Connection connection, String parent) {
        Statement statement;
        ResultSet resultSet = null;
        try {
            String query = String.format("select * from %s where parent= '%s'", table_client, parent);
            statement = connection.createStatement();
            resultSet = statement.executeQuery(query);
            while (resultSet.next()){
                System.out.print(" | ");
                System.out.print(resultSet.getString("name") + " | ");
                System.out.print(resultSet.getString("surname") + " | ");
                System.out.print(resultSet.getString("parent") + " | ");
                System.out.print(resultSet.getString("phone_number") + " | ");
                System.out.println(resultSet.getString("e_mail") + " | \n");
            }

        }catch (Exception e){
            System.out.println(e);
            System.out.println("----------------------------------------------------------------------------------------------------------------");
        }

    }

    public void search_data_by_phone_number(Connection connection, int phone_number) {
        Statement statement;
        ResultSet resultSet = null;
        try {
            String query = String.format("select * from %s where phone_number= '%s'", table_client, phone_number);
            statement = connection.createStatement();
            resultSet = statement.executeQuery(query);
            while (resultSet.next()){
                System.out.print(" | ");
                System.out.print(resultSet.getString("name") + " | ");
                System.out.print(resultSet.getString("surname") + " | ");
                System.out.print(resultSet.getString("parent") + " | ");
                System.out.print(resultSet.getString("phone_number") + " | ");
                System.out.println(resultSet.getString("e_mail") + " | \n");
            }

        }catch (Exception e){
            System.out.println(e);
            System.out.println("----------------------------------------------------------------------------------------------------------------");
        }

    }

    public void search_data_by_e_mail(Connection connection, String e_mail) {
        Statement statement;
        ResultSet resultSet = null;
        try {
            String query = String.format("select * from %s where e_mail= '%s'", table_client, e_mail);
            statement = connection.createStatement();
            resultSet = statement.executeQuery(query);
            while (resultSet.next()){
                System.out.print(" | ");
                System.out.print(resultSet.getString("name") + " | ");
                System.out.print(resultSet.getString("surname") + " | ");
                System.out.print(resultSet.getString("parent") + " | ");
                System.out.print(resultSet.getString("phone_number") + " | ");
                System.out.println(resultSet.getString("e_mail") + " | \n");
            }

        }catch (Exception e){
            System.out.println(e);
            System.out.println("----------------------------------------------------------------------------------------------------------------");
        }

    }

    public void delete_data_by_name(Connection connection, String name){
        Statement statement;
        try{
            String query = String.format("delete from %s where name= '%s'", table_client, name);
            statement = connection.createStatement();
            statement.executeUpdate(query);
            System.out.println("Data deleted");

        }catch (Exception e){
            System.out.println(e);
            System.out.println("----------------------------------------------------------------------------------------------------------------");
        }
    }

    public void delete_data_by_surname(Connection connection, String surname){
        Statement statement;
        try{
            String query = String.format("delete from %s where surname= '%s'", table_client, surname);
            statement = connection.createStatement();
            statement.executeUpdate(query);
            System.out.println("Data deleted");

        }catch (Exception e){
            System.out.println(e);
            System.out.println("----------------------------------------------------------------------------------------------------------------");
        }
    }

    public void delete_data_by_parent(Connection connection, String parent){
        Statement statement;
        try{
            String query = String.format("delete from %s where parent= '%s'", table_client, parent);
            statement = connection.createStatement();
            statement.executeUpdate(query);
            System.out.println("Data deleted");

        }catch (Exception e){
            System.out.println(e);
            System.out.println("----------------------------------------------------------------------------------------------------------------");
        }
    }

    public void delete_data_by_phone_number(Connection connection, int phone_number){
        Statement statement;
        try{
            String query = String.format("delete from %s where phone_number= '%s'", table_client, phone_number);
            statement = connection.createStatement();
            statement.executeUpdate(query);
            System.out.println("Data deleted");

        }catch (Exception e){
            System.out.println(e);
            System.out.println("----------------------------------------------------------------------------------------------------------------");
        }
    }

    public void delete_data_by_e_mail(Connection connection, String e_mail){
        Statement statement;
        try{
            String query = String.format("delete from %s where e_mail= '%s'", table_client, e_mail);
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
                   query = String.format("select * from %s order by %s", table_client, column_name);
                   break;
               }

                if(choice == 2){
                    query = String.format("select * from %s order by %s", table_client, column_surname);
                    break;
                }

                if(choice == 3){
                    query = String.format("select * from %s order by %s", table_client, column_parent);
                    break;
                }

                if(choice == 4){
                    query = String.format("select * from %s order by %s", table_client, column_phone_number);
                    break;
                }

                if(choice == 5){
                    query = String.format("select * from %s order by %s", table_client, column_e_mail);
                    break;
                }
            }while (true);

            resultSet = statement.executeQuery(query);
            while(resultSet.next()){
                System.out.print(" | ");
                System.out.print(resultSet.getString("name") + " | ");
                System.out.print(resultSet.getString("surname") + " | ");
                System.out.print(resultSet.getString("parent") + " | ");
                System.out.print(resultSet.getString("phone_number") + " | ");
                System.out.println(resultSet.getString("e_mail") + " | \n");
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }

}
