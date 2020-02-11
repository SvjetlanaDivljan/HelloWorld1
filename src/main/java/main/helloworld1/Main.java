package main.helloworld;

import java.util.Scanner;

/**
 *
 * @author Korisnik
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        System.out.println("HelloWorld");
//        System.out.println("Svjetlana Divljan");
//        System.out.println("--------------------");
//        int age = 5;
//                if (age > 18) {
//                    System.out.println("Osoba je punoletna.");
//                    } else {
//                    System.out.println("Osoba je maloletna.");
//                } 
                System.out.println("--------------------");
//                System.out.print("Unesite broj godina: ");
//                Scanner input = new Scanner (System.in);
//                int userAge = input.nextInt();
//                
//                System.out.println("Korisnik je uneo: " + userAge);
//                if (userAge > 18) {
//                    System.out.println("Osoba je punoletna.");
//                    } else {
//                    System.out.println("Osoba je maloletna.");
//                } 
                System.out.println("--------------------");
                
                System.out.print("Unesite broj godina: ");
                Scanner input = new Scanner (System.in);
                int personAge = input.nextInt();
                
                if (personAge <= 0 && personAge > 150) {
                    System.out.println("invalid");
                } else if (personAge<= 5) {
                    System.out.println("baby");
                } else if (personAge <= 11 ){
                    System.out.println("kid");    
                } else if (personAge<= 17){
                    System.out.println("teen"); 
                } else if (personAge >= 18){
                    System.out.println("adult"); 
                }
//                0-5 -> baby
//                6-11 -> kid
//                11-17 -> teen
//                18+ -> adult
//                Other -> invalid
                        
//        System.out.println("Unesite broj gosina");   
//        Scanner input2= New Scanner(System.in)
                
    }
    
}
