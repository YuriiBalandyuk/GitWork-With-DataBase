package DataBase;

import java.util.Scanner;

public class SimpleFunctionalMethods_ticket {

    public int write_fk_media_id(){
        Scanner scanner = new Scanner(System.in);
        int fk_media_id = 0;
        do{
            fk_media_id = scanner.nextInt();
            System.out.println("----------------------------------------------------------------------------------------------------------------");
        }while(fk_media_id == 0);
        return fk_media_id;
    }

    public int write_price(){
        Scanner scanner = new Scanner(System.in);
        int price = 0;
        do{
            price = scanner.nextInt();
            System.out.println("----------------------------------------------------------------------------------------------------------------");
        }while(price == 0);
        return price;
    }

    public int write_place(){
        Scanner scanner = new Scanner(System.in);
        int place = 0;
        do{
            place = scanner.nextInt();
            System.out.println("----------------------------------------------------------------------------------------------------------------");
        }while(place == 0);
        return place;
    }

    public String write_format(){
        Scanner scanner = new Scanner(System.in);
        String format = null;
        do{
            format = scanner.nextLine();
            System.out.println("----------------------------------------------------------------------------------------------------------------");
        }while(format.isEmpty());
        return format;
    }

    public int write_fk_shedule_of_sessions_id(){
        Scanner scanner = new Scanner(System.in);
        int fk_shedule_of_sessions_id = 0;
        do{
            fk_shedule_of_sessions_id = scanner.nextInt();
            System.out.println("----------------------------------------------------------------------------------------------------------------");
        }while(fk_shedule_of_sessions_id == 0);
        return fk_shedule_of_sessions_id;
    }

    public String write_hall(){
        Scanner scanner = new Scanner(System.in);
        String hall = null;
        do{
            hall = scanner.nextLine();
            System.out.println("----------------------------------------------------------------------------------------------------------------");
        }while(hall.isEmpty());
        return hall;
    }

    public int write_fk_box_office_id(){
        Scanner scanner = new Scanner(System.in);
        int fk_box_office_id = 0;
        do{
            fk_box_office_id = scanner.nextInt();
            System.out.println("----------------------------------------------------------------------------------------------------------------");
        }while(fk_box_office_id == 0);
        return fk_box_office_id;
    }
}
