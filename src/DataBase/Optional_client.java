package DataBase;

import java.sql.Connection;
import java.util.Scanner;

public class Optional_client {
    DataBaseFunction_client dataBaseFunction_client = new DataBaseFunction_client();
    SimpleFunctionalMethods_client simpleFunctionalMethods_client = new SimpleFunctionalMethods_client();
    public void menu_of_update_data(Connection connection){
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("----------------------------------------------------------------------------------------------------------------");
            System.out.println("1. Update data by name");
            System.out.println("2. Update data by surname");
            System.out.println("3. Update data by address");
            System.out.println("4. Update data by phone_number");
            System.out.println("5. Update data by e_mail");
            System.out.println("6. Return to the menu");
            System.out.println("----------------------------------------------------------------------------------------------------------------");
            System.out.print("Choice your number: ");
            int choice = scanner.nextInt();
            System.out.println("----------------------------------------------------------------------------------------------------------------");

            switch (choice){
                case 1: {
                    System.out.println("\n----------------------------------------------------------------------------------------------------------------");
                    System.out.print("Enter old name: ");
                    String old_name = simpleFunctionalMethods_client.write_name();
                    System.out.print("Enter new name: ");
                    String new_name = simpleFunctionalMethods_client.write_name();

                    System.out.println(" ");
                    dataBaseFunction_client.update_data_by_name(connection,new_name, old_name);
                    System.out.println(" ");
                    break;
                }

                case 2: {
                    System.out.println("\n----------------------------------------------------------------------------------------------------------------");
                    System.out.print("Enter old surname: ");
                    String old_surname = simpleFunctionalMethods_client.write_surname();
                    System.out.print("Enter new surname: ");
                    String new_surname = simpleFunctionalMethods_client.write_surname();

                    System.out.println(" ");
                    dataBaseFunction_client.update_data_by_surname(connection, new_surname, old_surname);
                    System.out.println(" ");
                    break;
                }

                case 3: {
                    System.out.println("\n----------------------------------------------------------------------------------------------------------------");
                    System.out.print("Enter old parent: ");
                    String old_parent = simpleFunctionalMethods_client.write_parent();
                    System.out.print("Enter new parent: ");
                    String new_parent = simpleFunctionalMethods_client.write_parent();

                    System.out.println(" ");
                    dataBaseFunction_client.update_data_by_parent(connection, new_parent, old_parent);
                    System.out.println(" ");
                    break;
                }

                case 4: {
                    System.out.println("\n----------------------------------------------------------------------------------------------------------------");
                    System.out.print("Enter old phone number: ");
                    int old_phone_number = simpleFunctionalMethods_client.write_phone_number();
                    System.out.print("Enter new phone number: ");
                    int new_phone_number = simpleFunctionalMethods_client.write_phone_number();

                    System.out.println(" ");
                    dataBaseFunction_client.update_data_by_phone_number(connection, new_phone_number, old_phone_number);
                    System.out.println(" ");
                    break;
                }

                case 5: {
                    System.out.println("\n----------------------------------------------------------------------------------------------------------------");
                    System.out.print("Enter old e_mail: ");
                    String old_e_mail = simpleFunctionalMethods_client.write_e_mail();
                    System.out.print("Enter new e_mail: ");
                    String new_e_mail = simpleFunctionalMethods_client.write_e_mail();

                    System.out.println(" ");
                    dataBaseFunction_client.update_data_by_e_mail(connection, new_e_mail, old_e_mail);
                    System.out.println(" ");
                    break;
                }

                case 6: {
                    break;
                }
            }

            if(choice == 6){
                break;
            }
        }
    }

    public void menu_of_search_data(Connection connection){
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("----------------------------------------------------------------------------------------------------------------");
            System.out.println("1. Search data by name");
            System.out.println("2. Search data by surname");
            System.out.println("3. Search data by parent");
            System.out.println("4. Search data by phone_number");
            System.out.println("5. Search data by e_mail");
            System.out.println("6. Return to the menu");
            System.out.println("----------------------------------------------------------------------------------------------------------------");
            System.out.print("Choice your number: ");
            int choice = scanner.nextInt();
            System.out.println("----------------------------------------------------------------------------------------------------------------");

            switch (choice){
                case 1: {
                    System.out.println("\n----------------------------------------------------------------------------------------------------------------");
                    System.out.print("Enter the name: ");
                    String name = simpleFunctionalMethods_client.write_name();

                    System.out.println(" ");
                    dataBaseFunction_client.search_data_by_name(connection,name);
                    break;
                }

                case 2: {
                    System.out.println("\n----------------------------------------------------------------------------------------------------------------");
                    System.out.print("Enter the surname: ");
                    String surname = simpleFunctionalMethods_client.write_surname();

                    System.out.println(" ");
                    dataBaseFunction_client.search_data_by_surname(connection, surname);
                    break;
                }

                case 3: {
                    System.out.println("\n----------------------------------------------------------------------------------------------------------------");
                    System.out.print("Enter the parent: ");
                    String parent = simpleFunctionalMethods_client.write_parent();

                    System.out.println(" ");
                    dataBaseFunction_client.search_data_by_parent(connection, parent);
                    break;
                }

                case 4: {
                    System.out.println("\n----------------------------------------------------------------------------------------------------------------");
                    System.out.print("Enter the phone_number: ");
                    int phone_number = simpleFunctionalMethods_client.write_phone_number();

                    System.out.println(" ");
                    dataBaseFunction_client.search_data_by_phone_number(connection,phone_number);
                    break;
                }

                case 5: {
                    System.out.println("\n----------------------------------------------------------------------------------------------------------------");
                    System.out.print("Enter the e_mail: ");
                    String e_mail = simpleFunctionalMethods_client.write_e_mail();

                    System.out.println(" ");
                    dataBaseFunction_client.search_data_by_e_mail(connection, e_mail);
                    break;
                }

                case 6: {
                    break;
                }
            }

            if(choice == 6){
                break;
            }
        }
    }

    public void menu_of_delete_data(Connection connection){
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("----------------------------------------------------------------------------------------------------------------");
            System.out.println("1. Delete data by name");
            System.out.println("2. Delete data by surname");
            System.out.println("3. Delete data by parent");
            System.out.println("4. Delete data by phone_number");
            System.out.println("5. Delete data by e_mail");
            System.out.println("6. System exit");
            System.out.println("----------------------------------------------------------------------------------------------------------------");
            System.out.print("Choice your number: ");
            int choice = scanner.nextInt();
            System.out.println("----------------------------------------------------------------------------------------------------------------");

            switch (choice){
                case 1: {
                    System.out.println("\n----------------------------------------------------------------------------------------------------------------");
                    System.out.print("Enter the name: ");
                    String name = simpleFunctionalMethods_client.write_name();

                    System.out.println(" ");
                    dataBaseFunction_client.delete_data_by_name(connection, name);
                    System.out.println(" ");
                    break;
                }

                case 2: {
                    System.out.println("\n----------------------------------------------------------------------------------------------------------------");
                    System.out.print("Enter the surname: ");
                    String surname = simpleFunctionalMethods_client.write_surname();

                    System.out.println(" ");
                    dataBaseFunction_client.delete_data_by_surname(connection, surname);
                    System.out.println(" ");
                    break;
                }

                case 3: {
                    System.out.println("\n----------------------------------------------------------------------------------------------------------------");
                    System.out.print("Enter the parent: ");
                    String parent = simpleFunctionalMethods_client.write_parent();

                    System.out.println(" ");
                    dataBaseFunction_client.delete_data_by_parent(connection, parent);
                    System.out.println(" ");
                    break;
                }

                case 4: {
                    System.out.println("\n----------------------------------------------------------------------------------------------------------------");
                    System.out.print("Enter the phone_number: ");
                    int phone_number = simpleFunctionalMethods_client.write_phone_number();

                    System.out.println(" ");
                    dataBaseFunction_client.delete_data_by_phone_number(connection, phone_number);
                    System.out.println(" ");
                    break;
                }

                case 5: {
                    System.out.println("\n----------------------------------------------------------------------------------------------------------------");
                    System.out.print("Enter the e_mail: ");
                    String e_mail = simpleFunctionalMethods_client.write_e_mail();

                    System.out.println(" ");
                    dataBaseFunction_client.delete_data_by_e_mail(connection, e_mail);
                    System.out.println(" ");
                    break;
                }

                case 6: {
                    break;
                }
            }

            if(choice == 6){
                break;
            }
        }
    }

    public void menu_of_sort_data(Connection connection){
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("----------------------------------------------------------------------------------------------------------------");
            System.out.println("1. Sort by column_name");
            System.out.println("2. Sort by column_surname");
            System.out.println("3. Sort by column_parent");
            System.out.println("4. Sort by column_phone_number");
            System.out.println("5. Sort by column_e_mail");
            System.out.println("6. Return to the menu");
            System.out.println("----------------------------------------------------------------------------------------------------------------");
            System.out.print("Choice your number: ");
            int choice = scanner.nextInt();
            System.out.println("----------------------------------------------------------------------------------------------------------------");

            if(choice == 6){
                break;
            }

            System.out.println(" ");
            dataBaseFunction_client.sort_data_by_column(connection, choice);
            System.out.println(" ");


        }
    }
}
