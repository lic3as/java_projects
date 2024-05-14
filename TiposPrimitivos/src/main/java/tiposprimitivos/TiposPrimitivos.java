/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiposprimitivos;

import java.util.Scanner;

/**
 *
 * @author alice
 */
public class TiposPrimitivos {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in); //tem que usar o objeto scanner para entrada de dados
        System.out.println("Digite o nome do aluno: ");
        String nome = teclado.nextLine(); //para scanner receber uma string
        System.out.println("Digite a nota do aluno: ");
        float nota = teclado.nextFloat(); //para scanner receber um float
        
        System.out.format("A nota de %s é %.1f \n", nome, nota); //sout format é para formatar como será mostrada a saída (semelhante a como funciona no C)
        
    }
    
}

