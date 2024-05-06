package com.mycompany.solucion;
import java.util.Scanner;
public class Solucion {

    public static void main(String[] args) {
                Scanner input = new Scanner(System.in);
        
        
        menu("1");
        int color1 = input.nextInt();
         menu("2");
        int color2 = input.nextInt();
         menu("3");
        int color3 = input.nextInt();
        
        
        System.out.println(color1);
        System.out.println(color2);
        System.out.println(color3);
    }
    
    public static void menu(String color) {
        System.out.println("Ingrsa el color: " + color);
        System.out.println("0 Negro");
        System.out.println("1 Marron");
        System.out.println("2 Rojo");
        System.out.println("3 Naranja");
        System.out.println("4 Amarillo");
        System.out.println("5 Verde");
        System.out.println("6 Azul");
        System.out.println("7 Violeta");
        System.out.println("8 Gris");
        System.out.println("9 Blanco");
    }
}