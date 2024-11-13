package com.mycompany.mavenproject1;

import java.util.Scanner;

public class Programa {
    
    public static void main(String[] args) {
        
        Scanner s = new Scanner (System.in);
        
        System.out.println("Digite um numero: ");
        Integer num = s.nextInt();
        
        switch (num) {
            case 1 -> System.out.print("Domingo, Otimo dia!");
            
            case 2 -> System.out.print("Segunda, Otimo dia!");
            
            case 3 -> System.out.print("Terca, Otimo dia!");
            
            case 4 -> System.out.print("Quarta, Otimo dia!");
            
            case 5 -> System.out.print("Quinta, Otimo dia!");
            
            case 6 -> System.out.print("Sexta, Otimo dia!");
            
            case 7 -> System.out.print("Sabado, Otimo dia!");
            
            default -> System.out.print("Número invalido!");
            
        }
        
    }
}
