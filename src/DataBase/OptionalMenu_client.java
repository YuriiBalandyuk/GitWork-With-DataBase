package DataBase;

import java.sql.Connection;
import java.util.Scanner;

public class OptionalMenu_client {
    public void menu_client(Connection connection){
        Scanner scanner = new Scanner(System.in);
        DataBaseFunction_client dataBaseFunction_client = new DataBaseFunction_client();
        SimpleFunctionalMethods_client simpleFunctionalMethods_client = new SimpleFunctionalMethods_client();
        Optional_client optional_client = new Optional_client();
        while(true) {
            System.out.println("\n-------------------------------------------------- Menu Client --------------------------------------------------");
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
                        System.out.print("Enter the name: ");
                        String name = simpleFunctionalMethods_client.write_name();
                        System.out.print("Enter the surname: ");
                        String surname = simpleFunctionalMethods_client.write_surname();
                        System.out.print("Enter the parent: ");
                        String parent = simpleFunctionalMethods_client.write_parent();
                        System.out.print("Enter the phone_number: ");
                        int phone_number = simpleFunctionalMethods_client.write_phone_number();
                        System.out.print("Enter the e_mail: ");
                        String e_mail = simpleFunctionalMethods_client.write_e_mail();
                        System.out.print("\n");

                        dataBaseFunction_client.insert_data_from_client_table(connection, name, surname, parent, phone_number, e_mail);

                        choice = your_choice();
                        System.out.println("----------------------------------------------------------------------------------------------------------------\n");
                    } while (choice != 1);
                    break;
                }

                case 2: {
                        dataBaseFunction_client.read_data_from_client_table(connection);
                        System.out.println("----------------------------------------------------------------------------------------------------------------\n");
                    break;
                }

                case 3: {
                    optional_client.menu_of_update_data(connection);
                    break;

                }

                case 4: {
                    optional_client.menu_of_search_data(connection);
                    break;
                }

                case 5: {
                    optional_client.menu_of_delete_data(connection);
                    break;
                }

                case 6: {
                    optional_client.menu_of_sort_data(connection);
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
