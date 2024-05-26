package DataBase;

import java.sql.Connection;
import java.util.Scanner;

public class Optional_ticket {
    DataBaseFunction_ticket dataBaseFunction_ticket = new DataBaseFunction_ticket();
    SimpleFunctionalMethods_ticket simpleFunctionalMethods_ticket = new SimpleFunctionalMethods_ticket();
    public void menu_of_update_data(Connection connection){
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("----------------------------------------------------------------------------------------------------------------");
            System.out.println("1. Update data by fk_media_id");
            System.out.println("2. Update data by price");
            System.out.println("3. Update data by place");
            System.out.println("4. Update data by format");
            System.out.println("5. Update data by fk_shedule_of_sessions_id");
            System.out.println("6. Update data by hall");
            System.out.println("7. Update data by fk_box_office_id");
            System.out.println("8. Return to the menu");
            System.out.println("----------------------------------------------------------------------------------------------------------------");
            System.out.print("Choice your number: ");
            int choice = scanner.nextInt();
            System.out.println("----------------------------------------------------------------------------------------------------------------");

            switch (choice){
                case 1: {
                    System.out.println("\n----------------------------------------------------------------------------------------------------------------");
                    System.out.print("Enter old fk_media_id: ");
                    int old_fk_media_id = simpleFunctionalMethods_ticket.write_fk_media_id();
                    System.out.print("Enter new fk_media_id: ");
                    int new_fk_media_id = simpleFunctionalMethods_ticket.write_fk_media_id();

                    System.out.println(" ");
                    dataBaseFunction_ticket.update_data_by_fk_media_id(connection, new_fk_media_id, old_fk_media_id);
                    System.out.println(" ");
                    break;
                }

                case 2: {
                    System.out.println("\n----------------------------------------------------------------------------------------------------------------");
                    System.out.print("Enter old price: ");
                    int old_price = simpleFunctionalMethods_ticket.write_price();
                    System.out.print("Enter new price: ");
                    int new_price = simpleFunctionalMethods_ticket.write_price();

                    System.out.println(" ");
                    dataBaseFunction_ticket.update_data_by_fk_media_id(connection, new_price, old_price);
                    System.out.println(" ");
                    break;
                }

                case 3: {
                    System.out.println("\n----------------------------------------------------------------------------------------------------------------");
                    System.out.print("Enter old place: ");
                    int old_place = simpleFunctionalMethods_ticket.write_place();
                    System.out.print("Enter new place: ");
                    int new_place = simpleFunctionalMethods_ticket.write_place();

                    System.out.println(" ");
                    dataBaseFunction_ticket.update_data_by_fk_media_id(connection, new_place, old_place);
                    System.out.println(" ");
                    break;
                }

                case 4: {
                    System.out.println("\n----------------------------------------------------------------------------------------------------------------");
                    System.out.print("Enter old phone format: ");
                    String old_format = simpleFunctionalMethods_ticket.write_format();
                    System.out.print("Enter new phone format: ");
                    String new_format = simpleFunctionalMethods_ticket.write_format();

                    System.out.println(" ");
                    dataBaseFunction_ticket.update_data_by_format(connection, new_format, old_format);
                    System.out.println(" ");
                    break;
                }

                case 5: {
                    System.out.println("\n----------------------------------------------------------------------------------------------------------------");
                    System.out.print("Enter old fk_shedule_of_sessions_id: ");
                    int old_fk_shedule_of_sessions_id = simpleFunctionalMethods_ticket.write_fk_shedule_of_sessions_id();
                    System.out.print("Enter new fk_shedule_of_sessions_id: ");
                    int new_fk_shedule_of_sessions_id = simpleFunctionalMethods_ticket.write_fk_shedule_of_sessions_id();

                    System.out.println(" ");
                    dataBaseFunction_ticket.update_data_by_fk_shedule_of_sessions_id(connection, new_fk_shedule_of_sessions_id, old_fk_shedule_of_sessions_id);
                    System.out.println(" ");
                    break;
                }

                case 6: {
                    System.out.println("\n----------------------------------------------------------------------------------------------------------------");
                    System.out.print("Enter old hall: ");
                    String old_hall = simpleFunctionalMethods_ticket.write_hall();
                    System.out.print("Enter new hall: ");
                    String new_hall = simpleFunctionalMethods_ticket.write_hall();

                    System.out.println(" ");
                    dataBaseFunction_ticket.update_data_by_hall(connection, new_hall, old_hall);
                    System.out.println(" ");
                    break;
                }

                case 7: {
                    System.out.println("\n----------------------------------------------------------------------------------------------------------------");
                    System.out.print("Enter old fk_box_office_id: ");
                    int old_fk_box_office_id = simpleFunctionalMethods_ticket.write_fk_box_office_id();
                    System.out.print("Enter new fk_box_office_id: ");
                    int new_fk_box_office_id = simpleFunctionalMethods_ticket.write_fk_box_office_id();

                    System.out.println(" ");
                    dataBaseFunction_ticket.update_data_by_fk_box_office_id(connection, new_fk_box_office_id, old_fk_box_office_id);
                    System.out.println(" ");
                    break;
                }

                case 8: {
                    break;
                }
            }

            if(choice == 8){
                break;
            }
        }
    }

    public void menu_of_search_data(Connection connection){
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("----------------------------------------------------------------------------------------------------------------");
            System.out.println("1. Search data by fk_media_id");
            System.out.println("2. Search data by price");
            System.out.println("3. Search data by place");
            System.out.println("4. Search data by format");
            System.out.println("5. Search data by fk_shedule_of_sessions_id");
            System.out.println("6. Search data by hall");
            System.out.println("7. Search data by fk_box_office_id");
            System.out.println("8. Return to the menu");
            System.out.println("----------------------------------------------------------------------------------------------------------------");
            System.out.print("Choice your number: ");
            int choice = scanner.nextInt();
            System.out.println("----------------------------------------------------------------------------------------------------------------");

            switch (choice){
                case 1: {
                    System.out.println("\n----------------------------------------------------------------------------------------------------------------");
                    int fk_media_id = simpleFunctionalMethods_ticket.write_fk_media_id();

                    System.out.println(" ");
                    dataBaseFunction_ticket.search_data_by_fk_media_id(connection, fk_media_id);
                    break;
                }

                case 2: {
                    System.out.println("\n----------------------------------------------------------------------------------------------------------------");
                    int price = simpleFunctionalMethods_ticket.write_price();

                    System.out.println(" ");
                    dataBaseFunction_ticket.search_data_by_price(connection, price);
                    break;
                }

                case 3: {
                    System.out.println("\n----------------------------------------------------------------------------------------------------------------");
                    int place = simpleFunctionalMethods_ticket.write_place();

                    System.out.println(" ");
                    dataBaseFunction_ticket.search_data_by_place(connection, place);
                    break;
                }

                case 4: {
                    System.out.println("\n----------------------------------------------------------------------------------------------------------------");
                    String format = simpleFunctionalMethods_ticket.write_format();

                    System.out.println(" ");
                    dataBaseFunction_ticket.search_data_by_format(connection, format);
                    break;
                }

                case 5: {
                    System.out.println("\n----------------------------------------------------------------------------------------------------------------");
                    int fk_shedule_of_sessions_id = simpleFunctionalMethods_ticket.write_fk_shedule_of_sessions_id();

                    System.out.println(" ");
                    dataBaseFunction_ticket.search_data_by_fk_shedule_of_sessions_id(connection, fk_shedule_of_sessions_id);
                    break;
                }

                case 6: {
                    System.out.println(" ");
                    String hall = simpleFunctionalMethods_ticket.write_hall();

                    System.out.println(" ");
                    dataBaseFunction_ticket.search_data_by_hall(connection, hall);
                    System.out.println(" ");
                    break;
                }

                case 7: {
                    System.out.println("\n----------------------------------------------------------------------------------------------------------------");
                    int fk_box_office_id = simpleFunctionalMethods_ticket.write_fk_box_office_id();

                    System.out.println(" ");
                    dataBaseFunction_ticket.search_data_by_fk_box_office_id(connection, fk_box_office_id);
                    break;
                }

                case 8: {
                    break;
                }
            }

            if(choice == 8){
                break;
            }
        }
    }

    public void menu_of_delete_data(Connection connection){
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("----------------------------------------------------------------------------------------------------------------");
            System.out.println("1. Delete data by fk_media_id");
            System.out.println("2. Delete data by price");
            System.out.println("3. Delete data by place");
            System.out.println("4. Delete data by format");
            System.out.println("5. Delete data by fk_shedule_of_sessions_id");
            System.out.println("6. Delete data by hall");
            System.out.println("7. Delete data by fk_box_office_id");
            System.out.println("8. System exit");
            System.out.println("----------------------------------------------------------------------------------------------------------------");
            System.out.print("Choice your number: ");
            int choice = scanner.nextInt();
            System.out.println("----------------------------------------------------------------------------------------------------------------");

            switch (choice){
                case 1: {
                    System.out.println("\n----------------------------------------------------------------------------------------------------------------");
                    System.out.print("Enter the fk_media_id: ");
                    int fk_media_id = simpleFunctionalMethods_ticket.write_fk_media_id();

                    System.out.println(" ");
                    dataBaseFunction_ticket.delete_data_by_fk_media_id(connection, fk_media_id);
                    System.out.println(" ");
                    break;

                }

                case 2: {
                    System.out.println("\n----------------------------------------------------------------------------------------------------------------");
                    System.out.print("Enter the price: ");
                    int price = simpleFunctionalMethods_ticket.write_price();

                    System.out.println(" ");
                    dataBaseFunction_ticket.delete_data_by_price(connection, price);
                    System.out.println(" ");
                    break;
                }

                case 3: {
                    System.out.println("\n----------------------------------------------------------------------------------------------------------------");
                    System.out.print("Enter the place: ");
                    int place = simpleFunctionalMethods_ticket.write_place();

                    System.out.println(" ");
                    dataBaseFunction_ticket.delete_data_by_place(connection, place);
                    System.out.println(" ");
                    break;
                }

                case 4: {
                    System.out.println("\n----------------------------------------------------------------------------------------------------------------");
                    System.out.print("Enter the format: ");
                    String format = simpleFunctionalMethods_ticket.write_format();

                    System.out.println(" ");
                    dataBaseFunction_ticket.delete_data_by_format(connection, format);
                    System.out.println(" ");
                    break;
                }

                case 5: {
                    System.out.println("\n----------------------------------------------------------------------------------------------------------------");
                    System.out.print("Enter the fk_shedule_of_sessions_id: ");
                    int fk_shedule_of_sessions_id = simpleFunctionalMethods_ticket.write_fk_shedule_of_sessions_id();

                    System.out.println(" ");
                    dataBaseFunction_ticket.delete_data_by_fk_shedule_of_sessions_id(connection, fk_shedule_of_sessions_id);
                    System.out.println(" ");
                    break;
                }

                case 6: {
                    System.out.println("\n----------------------------------------------------------------------------------------------------------------");
                    System.out.print("Enter the hall: ");
                    String hall = simpleFunctionalMethods_ticket.write_hall();

                    System.out.println(" ");
                    dataBaseFunction_ticket.delete_data_by_hall(connection, hall);
                    System.out.println(" ");
                    break;
                }

                case 7: {
                    System.out.println("\n----------------------------------------------------------------------------------------------------------------");
                    System.out.print("Enter the fk_box_office_id: ");
                    int fk_box_office_id = simpleFunctionalMethods_ticket.write_fk_box_office_id();

                    System.out.println(" ");
                    dataBaseFunction_ticket.delete_data_by_fk_box_office_id(connection, fk_box_office_id);
                    System.out.println(" ");
                    break;
                }

                case 8: {
                    break;
                }
            }

            if(choice == 8){
                break;
            }
        }
    }
    public void menu_of_sort_data(Connection connection){
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("----------------------------------------------------------------------------------------------------------------");
            System.out.println("1. Sort by column_fk_media_id");
            System.out.println("2. Sort by column_price");
            System.out.println("3. Sort by column_place");
            System.out.println("4. Sort by column_format");
            System.out.println("5. Sort by column_fk_shedule_of_sessions_id");
            System.out.println("6. Return to the column_hall");
            System.out.println("7. Return to the column_fk_box_office_id");
            System.out.println("8. Return to the menu");
            System.out.println("----------------------------------------------------------------------------------------------------------------");
            System.out.print("Choice your number: ");
            int choice = scanner.nextInt();
            System.out.println("----------------------------------------------------------------------------------------------------------------");

            if(choice == 8){
                break;
            }

            System.out.println(" ");
            dataBaseFunction_ticket.sort_data_by_column(connection, choice);
            System.out.println(" ");


        }
    }
}
