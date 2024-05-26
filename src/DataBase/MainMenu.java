package DataBase;

import java.sql.Connection;
import java.util.Scanner;

public class MainMenu {
    public void ChoiceMenu(Connection connection) {
        OptionalMenu_client optionalMenu_client = new OptionalMenu_client();
        OptionalMenu_media optionalMenu_media = new OptionalMenu_media();
        OptionalMenu_ticket optionalMenu_ticket = new OptionalMenu_ticket();
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.println("\n-------------------------------------------------- Main Menu --------------------------------------------------");
            System.out.println("1. Client table ");
            System.out.println("2. Media table");
            System.out.println("3. Ticket table");
            System.out.println("4. System exit");
            System.out.println("----------------------------------------------------------------------------------------------------------------");
            System.out.print("Choice your number: ");
            int number = scanner.nextInt();
            System.out.println("----------------------------------------------------------------------------------------------------------------\n");

            switch (number) {
                case 1: {
                    optionalMenu_client.menu_client(connection);
                    break;
                }

                case 2: {
                    optionalMenu_media.menu_media(connection);
                    break;
                }

                case 3: {
                   optionalMenu_ticket.menu_ticket(connection);
                    break;

                }

                case 4: {
                    System.exit(0);
                    break;
                }
            }
        }
    }
}
