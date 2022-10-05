package pro192.pe;

import data.Brick;
import java.util.Scanner;

public class Pro192Pe {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String code;
        double price;
        
        System.out.print("Enter Brick code: ");
        code = sc.nextLine();
        System.out.print("Enter Brick price: ");
        price = Double.parseDouble(sc.nextLine());
        Brick br = new Brick(code, price);
        
        int option;
        
        System.out.println("1. Tc = 1 - test getCode()");
        System.out.println("2. Tc = 2 - test setCode()");
        System.out.print("Enter TC: ");
        option = Integer.parseInt(sc.nextLine());
        
        if(option == 1){
            System.out.println("OUTPUT: ");
            System.out.println(br.getCode());
        }else{
            
            System.out.print("Enter new Brick price: ");
            price = Double.parseDouble(sc.nextLine());
            br.setPrice(price);
            System.out.println("OUTPUT: ");
            System.out.println(br.getPrice());
            
        }

    }

}
