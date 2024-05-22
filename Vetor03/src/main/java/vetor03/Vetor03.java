/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetor03;

import java.util.Arrays;

/**
 *
 * @author alice
 */
public class Vetor03 {
    
    public static void main(String[] args) {
        double v[] = {3.2, 2.75, 0, -3.7}; //vetor de double com 4 posições
        
        Arrays.sort(v); //o método sort da classe Arrays ordena o vetor
        
        //FOR EACH (para cada): for utilizado exclusivamente para vetores
        for(double valor: v){ //armazena cada posição do vetor v em valor a cada iteração
            System.out.println(valor + " "); //imprime cada posição separada por um espaço
        }
    }
    
}
