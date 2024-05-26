package DataBase;

import java.sql.Connection;
import java.util.Scanner;

public class Optional_media {
    DataBaseFunction_media dataBaseFunction_media = new DataBaseFunction_media();
    SimpleFunctionalMethods_media simpleFunctionalMethods_media = new SimpleFunctionalMethods_media();
    public void menu_of_update_data(Connection connection){
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("----------------------------------------------------------------------------------------------------------------");
            System.out.println("1. Update data by title");
            System.out.println("2. Update data by fk_studio_id");
            System.out.println("3. Update data by description");
            System.out.println("4. Update data by fk_media_category_id");
            System.out.println("5. Update data by fees");
            System.out.println("6. Update data by fk_cinema_id");
            System.out.println("7. Return to the menu");
            System.out.println("----------------------------------------------------------------------------------------------------------------");
            System.out.print("Choice your number: ");
            int choice = scanner.nextInt();
            System.out.println("----------------------------------------------------------------------------------------------------------------");

            switch (choice){
                case 1: {
                    System.out.println("\n----------------------------------------------------------------------------------------------------------------");
                    System.out.print("Enter old title: ");
                    String old_title = simpleFunctionalMethods_media.write_title();
                    System.out.print("Enter new title: ");
                    String new_title = simpleFunctionalMethods_media.write_title();

                    System.out.println(" ");
                    dataBaseFunction_media.update_data_by_title(connection, new_title, old_title);
                    System.out.println(" ");
                    break;
                }

                case 2: {
                    System.out.println("\n----------------------------------------------------------------------------------------------------------------");
                    System.out.print("Enter old fk_studio_id: ");
                    int old_fk_studio_id = simpleFunctionalMethods_media.write_fk_studio_id();
                    System.out.print("Enter new fk_studio_id: ");
                    int new_fk_studio_id = simpleFunctionalMethods_media.write_fk_studio_id();

                    System.out.println(" ");
                    dataBaseFunction_media.update_data_by_fk_studio_id(connection, new_fk_studio_id, old_fk_studio_id);
                    System.out.println(" ");
                    break;
                }

                case 3: {
                    System.out.println("\n----------------------------------------------------------------------------------------------------------------");
                    System.out.print("Enter old description: ");
                    String old_description = simpleFunctionalMethods_media.write_description();
                    System.out.print("Enter new description: ");
                    String new_description = simpleFunctionalMethods_media.write_description();

                    System.out.println(" ");
                    dataBaseFunction_media.update_data_by_description(connection, new_description, old_description);
                    System.out.println(" ");
                    break;
                }

                case 4: {
                    System.out.println("\n----------------------------------------------------------------------------------------------------------------");
                    System.out.print("Enter old phone fk_media_category_id: ");
                    int old_fk_media_category_id = simpleFunctionalMethods_media.write_fk_media_category_id();
                    System.out.print("Enter new phone fk_media_category_id: ");
                    int new_fk_media_category_id = simpleFunctionalMethods_media.write_fk_media_category_id();

                    System.out.println(" ");
                    dataBaseFunction_media.update_data_by_fk_media_category_id(connection, new_fk_media_category_id, old_fk_media_category_id);
                    System.out.println(" ");
                    break;
                }

                case 5: {
                    System.out.println("\n----------------------------------------------------------------------------------------------------------------");
                    System.out.println("Example: 10 USD");
                    System.out.print("Enter old fees: ");
                    String old_fees = simpleFunctionalMethods_media.write_fees();
                    System.out.print("Enter new fees: ");
                    String new_fees = simpleFunctionalMethods_media.write_fees();

                    System.out.println(" ");
                    dataBaseFunction_media.update_data_by_fees(connection, new_fees, old_fees);
                    System.out.println(" ");
                    break;
                }

                case 6: {
                    System.out.println("\n----------------------------------------------------------------------------------------------------------------");
                    System.out.print("Enter old fk_cinema_id: ");
                    int old_fk_cinema_id = simpleFunctionalMethods_media.write_fk_cinema_id();
                    System.out.print("Enter new fk_cinema_id: ");
                    int new_fk_cinema_id = simpleFunctionalMethods_media.write_fk_cinema_id();

                    System.out.println(" ");
                    dataBaseFunction_media.update_data_by_fk_cinema_id(connection, new_fk_cinema_id, old_fk_cinema_id);
                    System.out.println(" ");
                    break;
                }

                case 7: {
                    break;
                }
            }

            if(choice == 7){
                break;
            }
        }
    }

    public void menu_of_search_data(Connection connection){
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("----------------------------------------------------------------------------------------------------------------");
            System.out.println("1. Search data by title");
            System.out.println("2. Search data by fk_studio_id");
            System.out.println("3. Search data by fk_media_category_id");
            System.out.println("4. Search data by fees");
            System.out.println("5. Search data by fk_cinema_id");
            System.out.println("6. Return to the menu");
            System.out.println("----------------------------------------------------------------------------------------------------------------");
            System.out.print("Choice your number: ");
            int choice = scanner.nextInt();
            System.out.println("----------------------------------------------------------------------------------------------------------------");

            switch (choice){
                case 1: {
                    System.out.println("\n----------------------------------------------------------------------------------------------------------------");
                    System.out.print("Enter the title: ");
                    String title = simpleFunctionalMethods_media.write_title();

                    System.out.println(" ");
                    dataBaseFunction_media.search_data_by_title(connection, title);

                    break;
                }

                case 2: {
                    System.out.println("\n----------------------------------------------------------------------------------------------------------------");
                    System.out.print("Enter the fk_studio_id: ");
                    int fk_studio_id = simpleFunctionalMethods_media.write_fk_studio_id();

                    System.out.println(" ");
                    dataBaseFunction_media.search_data_by_fk_studio_id(connection, fk_studio_id);
                    break;
                }

                case 3: {
                    System.out.println("\n----------------------------------------------------------------------------------------------------------------");
                    System.out.print("Enter the fk_media_category_id: ");
                    int fk_media_category_id = simpleFunctionalMethods_media.write_fk_media_category_id();

                    System.out.println(" ");
                    dataBaseFunction_media.search_data_by_fk_media_category_id(connection, fk_media_category_id);
                    break;
                }

                case 4: {
                    System.out.println("\n----------------------------------------------------------------------------------------------------------------");
                    System.out.println("Example: 10 USD");
                    System.out.print("Enter the fees: ");
                    String fees = simpleFunctionalMethods_media.write_fees();
                    System.out.println(" ");
                    dataBaseFunction_media.search_data_by_phone_fees(connection, fees);
                    break;
                }

                case 5: {
                    System.out.println("\n----------------------------------------------------------------------------------------------------------------");
                    System.out.print("Enter the fk_cinema_id: ");
                    int fk_cinema_id = simpleFunctionalMethods_media.write_fk_cinema_id();

                    System.out.println(" ");
                    dataBaseFunction_media.search_data_by_fk_cinema_id(connection, fk_cinema_id);
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
            System.out.println("1. Delete data by title");
            System.out.println("2. Delete data by fk_studio_id");
            System.out.println("3. Delete data by fk_media_category_id");
            System.out.println("4. Delete data by fees");
            System.out.println("4. Delete data by fk_cinema_id");
            System.out.println("5. System exit");
            System.out.println("----------------------------------------------------------------------------------------------------------------");
            System.out.print("Choice your number: ");
            int choice = scanner.nextInt();
            System.out.println("----------------------------------------------------------------------------------------------------------------");

            switch (choice){
                case 1: {
                    System.out.println("\n----------------------------------------------------------------------------------------------------------------");
                    System.out.print("Enter the title: ");
                    String title = simpleFunctionalMethods_media.write_title();


                    System.out.println(" ");
                    dataBaseFunction_media.delete_data_by_title(connection, title);
                    System.out.println(" ");
                    break;

                }

                case 2: {
                    System.out.println("\n----------------------------------------------------------------------------------------------------------------");
                    System.out.print("Enter the fk_studio_id: ");
                    int fk_studio_id = simpleFunctionalMethods_media.write_fk_studio_id();

                    System.out.println(" ");
                    dataBaseFunction_media.delete_data_by_fk_studio_id(connection, fk_studio_id);
                    System.out.println(" ");
                    break;
                }

                case 3: {
                    System.out.println("\n----------------------------------------------------------------------------------------------------------------");
                    System.out.print("Enter the fk_media_category_id: ");
                    int fk_media_category_id = simpleFunctionalMethods_media.write_fk_media_category_id();

                    System.out.println(" ");
                    dataBaseFunction_media.delete_data_by_fk_media_category_id(connection, fk_media_category_id);
                    System.out.println(" ");
                    break;
                }

                case 4: {
                    System.out.println("\n----------------------------------------------------------------------------------------------------------------");
                    System.out.println("Example: 10 USD");
                    System.out.print("Enter the fees: ");
                    String fees = simpleFunctionalMethods_media.write_fees();

                    System.out.println(" ");
                    dataBaseFunction_media.delete_data_by_fees(connection, fees);
                    System.out.println(" ");
                    break;
                }

                case 5: {
                    System.out.println("\n----------------------------------------------------------------------------------------------------------------");
                    System.out.print("Enter the fk_cinema_id: ");
                    int fk_cinema_id = simpleFunctionalMethods_media.write_fk_cinema_id();

                    System.out.println(" ");
                    dataBaseFunction_media.delete_data_by_fk_cinema_id(connection, fk_cinema_id);
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
            System.out.println("1. Sort by column_title");
            System.out.println("2. Sort by column_fk_studio_id");
            System.out.println("3. Sort by column_description");
            System.out.println("4. Sort by column_fk_media_category_id");
            System.out.println("5. Sort by column_fees");
            System.out.println("6. Sort by column_fk_cinema_id");
            System.out.println("7. Return to the menu");
            System.out.println("----------------------------------------------------------------------------------------------------------------");
            System.out.print("Choice your number: ");
            int choice = scanner.nextInt();
            System.out.println("----------------------------------------------------------------------------------------------------------------");

            if(choice == 7){
                break;
            }

            System.out.println(" ");
            dataBaseFunction_media.sort_data_by_column(connection, choice);
            System.out.println(" ");


        }
    }
}
