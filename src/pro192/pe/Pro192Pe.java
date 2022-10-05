package pro192.pe;

import data.Brick;
import data.ColorBrick;
import java.util.Scanner;

public class Pro192Pe {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String code, marker;
        double price;
        
        System.out.print("Enter Brick code: ");
        code = sc.nextLine();
        System.out.print("Enter Brick price: ");
        price = Double.parseDouble(sc.nextLine());
        System.out.print("Enter Brick maker: ");
        marker = sc.nextLine();
        Brick br = new Brick(code, price);
        Brick colorBr = new ColorBrick(code, marker, price);
        
        
        int option;
        
        System.out.println("1. Tc = 1 - test toString()");
        System.out.println("2. Tc = 2 - test setCode()");
        System.out.print("Enter TC: ");
        option = Integer.parseInt(sc.nextLine());
        
        if(option == 1){
            System.out.println("OUTPUT: ");
            System.out.println(br.toString());
            System.out.println(colorBr.toString());
        }else{
            System.out.println("OUTPUT: ");
            System.out.println(colorBr.getPrice());
            
        }

    }

}
