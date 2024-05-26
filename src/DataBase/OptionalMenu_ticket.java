package DataBase;

import java.util.Scanner;
import java.sql.Connection;

public class OptionalMenu_ticket {
    public void menu_ticket(Connection connection){
        Scanner scanner = new Scanner(System.in);
        DataBaseFunction_ticket dataBaseFunction_ticket = new DataBaseFunction_ticket();
        SimpleFunctionalMethods_ticket simpleFunctionalMethods_ticket = new SimpleFunctionalMethods_ticket();
        Optional_ticket optional_ticket= new Optional_ticket();

        while(true) {
            System.out.println("\n-------------------------------------------------- Menu Ticket --------------------------------------------------");
            System.out.println("1. Inserting data");
            System.out.println("2. Read the data from table");
            System.out.println("3. Updating the data in table");
            System.out.println("4. Searching the table by a value");
            System.out.println("5. Deleting data from the table");
            System.out.println("6. Sort data");
            System.out.println("7. Return to the main menu");
            System.out.println("----------------------------------------------------------------------------------------------------------------");
            System.out.print("Choice your number: ");
            int number = scanner.nextInt();
            System.out.println("----------------------------------------------------------------------------------------------------------------\n");

            switch (number) {
                case 1: {
                    int choice;
                    do {
                        System.out.println("----------------------------------------------------------------------------------------------------------------");
                        System.out.print("Enter the fk_media_id: ");
                        int fk_media_id = simpleFunctionalMethods_ticket.write_fk_media_id();
                        System.out.print("Enter the price: ");
                        int price = simpleFunctionalMethods_ticket.write_price();
                        System.out.print("Enter the place: ");
                        int place = simpleFunctionalMethods_ticket.write_place();
                        System.out.print("Enter the format: ");
                        String format = simpleFunctionalMethods_ticket.write_format();
                        System.out.print("Enter the fk_shedule_of_sessions_id: ");
                        int fk_shedule_of_sessions_id = simpleFunctionalMethods_ticket.write_fk_shedule_of_sessions_id();
                        System.out.print("Enter the hall: ");
                        String hall = simpleFunctionalMethods_ticket.write_hall();
                        System.out.print("Enter the hall: ");
                        int fk_box_office_id = simpleFunctionalMethods_ticket.write_fk_box_office_id();

                        dataBaseFunction_ticket.insert_data_from_ticket_table(connection, fk_media_id, price, place, format, fk_shedule_of_sessions_id, hall, fk_box_office_id);

                        choice = your_choice();
                        System.out.println("----------------------------------------------------------------------------------------------------------------\n");
                    } while (choice != 1);
                    break;
                }

                case 2: {
                    int choice;
                    do {
                        dataBaseFunction_ticket.read_data_from_ticket_table(connection);
                        choice = your_choice();
                        System.out.println("----------------------------------------------------------------------------------------------------------------\n");
                    } while (choice != 1);
                    break;
                }

                case 3: {
                    optional_ticket.menu_of_update_data(connection);
                    break;

                }

                case 4: {
                    optional_ticket.menu_of_search_data(connection);
                    break;
                }

                case 5: {
                    optional_ticket.menu_of_delete_data(connection);
                    break;
                }

                case 6: {
                    optional_ticket.menu_of_sort_data(connection);
                    break;
                }

                case 7: {
                    break;
                }
            }

            if(number == 7){
                break;
            }
        }
    }
    public int your_choice(){
        Scanner scanner = new Scanner(System.in);
        int choice;
        System.out.println("\n----------------------------------------------------------------------------------------------------------------");
        System.out.println("Return to the menu? (1 -> yes | 0 -> no)");
        System.out.print("Your answer: ");
        return choice = scanner.nextInt();
    }
}
