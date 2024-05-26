package DataBase;

import java.sql.Connection;

import java.util.Scanner;

public class OptionalMenu_media {
    public void menu_media(Connection connection){
        Scanner scanner = new Scanner(System.in);
        DataBaseFunction_media dataBaseFunction_media = new DataBaseFunction_media();
        SimpleFunctionalMethods_media simpleFunctionalMethods_media = new SimpleFunctionalMethods_media();
        Optional_media optional_media = new Optional_media();

        while(true) {
            System.out.println("\n-------------------------------------------------- Menu Media --------------------------------------------------");
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
                        System.out.print("Enter the title: ");
                        String title = simpleFunctionalMethods_media.write_title();
                        System.out.print("Enter the fk_studio_id: ");
                        int fk_studio_id = simpleFunctionalMethods_media.write_fk_studio_id();
                        System.out.print("Enter the description: ");
                        String description = simpleFunctionalMethods_media.write_description();
                        System.out.print("Enter the fk_media_category: ");
                        int fk_media_category = simpleFunctionalMethods_media.write_fk_media_category_id();
                        System.out.println("Example: 10 USD");
                        System.out.print("Enter the fees: ");
                        String fees = simpleFunctionalMethods_media.write_fees();
                        System.out.print("Enter the fk_cinema_id: ");
                        int fk_cinema_id = simpleFunctionalMethods_media.write_fk_cinema_id();
                        System.out.print("\n");

                        dataBaseFunction_media.insert_data_from_media_table(connection, title, fk_studio_id, description, fk_media_category, fees, fk_cinema_id);

                        choice = your_choice();
                        System.out.println("----------------------------------------------------------------------------------------------------------------\n");
                    } while (choice != 1);
                    break;
                }

                case 2: {
                        dataBaseFunction_media.read_data_from_client_table(connection);
                        System.out.println("----------------------------------------------------------------------------------------------------------------\n");
                    break;
                }

                case 3: {
                    optional_media.menu_of_update_data(connection);
                    break;

                }

                case 4: {
                    optional_media.menu_of_search_data(connection);
                    break;
                }

                case 5: {
                    optional_media.menu_of_delete_data(connection);
                    break;
                }

                case 6: {
                    optional_media.menu_of_sort_data(connection);
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
