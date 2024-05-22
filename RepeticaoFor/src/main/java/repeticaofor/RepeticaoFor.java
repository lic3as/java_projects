/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repeticaofor;

/**
 *
 * @author alice
 */
public class RepeticaoFor {
    
    public static void main(String[] args) {
        //estruta for(inicializa a variável contador, escreve a condição de parada, incremento do contador)
        //o for é uma estrutura onde o contador é automático, a cada repetição ele é checado e incrementado automaticaamente em uma única linha
        for(int cc = 0; cc < 4; cc++){ //cc inicializa com 0, continua enquanto cc for menor que 4 e incrementa em 1 a cada repetição
            System.out.println("Cambalhota " + cc);
        }
        
        //não é obrigatório que count comece com 0 ou que o incremento seja apenas de 1:
        //for(int count = 5; count <= 15; count += 2){ 
        //    System.out.println(count);
        //}
        //também não é obrigatório que seja realizado um incremento a cada repetição, pode ser utilizado um decremento, sem problemas
    
        //1 até 100 pulando de 10 em 10
        for(int num = 1; num <= 100; num += 10){
            System.out.println(num);
        }
    }
    
}
