package DataBase;

import java.util.Scanner;

public class SimpleFunctionalMethods_media {
    public String write_title(){
        Scanner scanner = new Scanner(System.in);
        String title = null;
        do{
            title = scanner.nextLine();
            System.out.println("----------------------------------------------------------------------------------------------------------------");
        }while(title.isEmpty());
        return title;
    }

    public int write_fk_studio_id(){
        Scanner scanner = new Scanner(System.in);
        int fk_studio_id = 0;
        do{
            fk_studio_id = scanner.nextInt();
            System.out.println("----------------------------------------------------------------------------------------------------------------");
        }while(fk_studio_id == 0);
        return fk_studio_id;
    }

    public String write_description(){
        Scanner scanner = new Scanner(System.in);
        String description = null;
        do{
            description = scanner.nextLine();
            System.out.println("----------------------------------------------------------------------------------------------------------------");
        }while(description.isEmpty());
        return description;
    }

    public int write_fk_media_category_id(){
        Scanner scanner = new Scanner(System.in);
        int fk_media_category = 0;
        do{
            fk_media_category = scanner.nextInt();
            System.out.println("----------------------------------------------------------------------------------------------------------------");
        }while(fk_media_category == 0);
        return fk_media_category;
    }

    public String write_fees(){
        Scanner scanner = new Scanner(System.in);
        String fees= null;
        do{
            fees = scanner.nextLine();
            System.out.println("----------------------------------------------------------------------------------------------------------------");
        }while(fees.isEmpty());
        return fees;
    }

    public int write_fk_cinema_id(){
        Scanner scanner = new Scanner(System.in);
        int fk_cinema_id = 0;
        do{
            fk_cinema_id = scanner.nextInt();
            System.out.println("----------------------------------------------------------------------------------------------------------------");
        }while(fk_cinema_id == 0);
        return fk_cinema_id;
    }
}
