package DataBase;

import java.util.Scanner;

public class SimpleFunctionalMethods_client {
    public String write_name(){
        Scanner scanner = new Scanner(System.in);
        String name = null;
        do{
            name = scanner.nextLine();
            System.out.println("----------------------------------------------------------------------------------------------------------------");
        }while(name.isEmpty());
        return name;
    }

    public String write_surname(){
        Scanner scanner = new Scanner(System.in);
        String surname = null;
        do{
            surname = scanner.nextLine();
            System.out.println("----------------------------------------------------------------------------------------------------------------");
        }while(surname.isEmpty());
        return surname;
    }

    public String write_parent(){
        Scanner scanner = new Scanner(System.in);
        String parent = null;
        do{
            parent = scanner.nextLine();
            System.out.println("----------------------------------------------------------------------------------------------------------------");
        }while(parent.isEmpty());
        return parent;
    }

    public int write_phone_number(){
        Scanner scanner = new Scanner(System.in);
        int phone_number = 0;
        do{
            phone_number = scanner.nextInt();
            System.out.println("----------------------------------------------------------------------------------------------------------------");
        }while(phone_number == 0);
        return phone_number;
    }

    public String write_e_mail(){
        Scanner scanner = new Scanner(System.in);
        String e_mail = null;
        do{
            e_mail = scanner.nextLine();
            System.out.println("---------------------------------------------------------------------------------------------------------------");
        }while(e_mail.isEmpty());
        return e_mail;
    }
}
