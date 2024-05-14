/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programamedia;

import java.util.Scanner;

/**
 *
 * @author alice
 */
public class ProgramaMedia {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Primeira nota: ");
        float n1 = teclado.nextFloat();
        System.out.println("Segunda nota: ");
        float n2 = teclado.nextFloat();
        
        float media = (n1 + n2)/2;        
        System.out.println("Sua média foi " + media);
        
        if(media > 9){
            System.out.println("Parabéns!");
        }
        
    }
    
}
