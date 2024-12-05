package com.mycompany.poo3;

import java.util.Scanner;
import entidades.Student;

public class POO3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Student st = new Student();

        System.out.print("Nome: ");
        st.nome = s.next();
        System.out.print("");
        
        for(int i = 0; i < 3; i++){ 
          System.out.print("Nota: ");
          st.nota = s.nextDouble();
      
         st.soma = (float) (st.soma + st.Notas());
        }
       
        if(st.Soma() >= 60.0){
            System.out.printf("\nNota final: %.2f%n",st.Soma());
            System.out.println("Aprovado!");
        } else { 
            System.out.printf("\nNota final: %.2f%n",st.Soma());
            System.out.println("Reprovado.");
            
            if (st.Resto() > 1){
               System.out.printf("Faltando %.2f pontos",st.Resto());
            }else{
               System.out.printf("Faltando %.2f ponto",st.Resto());
            }
        }
       
    }
}
