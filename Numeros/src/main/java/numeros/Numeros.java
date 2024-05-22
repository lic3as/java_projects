/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numeros;

import java.util.Scanner;

/**
 *
 * @author alice
 */
public class Numeros {
    
    public static void main(String[] args) {
        int num; //valor do número
        int sum = 0; //armazenar a soma dos números (começa em 0)
        String resposta; //se quer continuar a adicionar valores
        Scanner tec = new Scanner(System.in); //scanner para entrada de dados
        
        do{
            System.out.println("Digite um número: ");
            num = tec.nextInt(); //pegar o valor digitado para o número
            sum += num; //armazenar as somas dos valores digitados em soma
            System.out.println("Quer continuar? S / N");
            resposta = tec.next(); //pegar a resposta do usuário (s ou n)
        } while(resposta.equals("S")); //enquanto a resposta for sim
        
        System.out.println("A soma de todos os valores é " + sum);
    }
    
}
