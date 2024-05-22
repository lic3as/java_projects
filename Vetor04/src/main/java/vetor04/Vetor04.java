/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetor04;

import java.util.Arrays;

/**
 *
 * @author alice
 */
public class Vetor04 {
    
    public static void main(String[] args) {
        int vet[] = {3, 7, 6, 1, 9, 4, 2}; //vetor de inteiros com 7 posições        
        for(int valor:vet){
            System.out.print(valor + " ");
        }
        System.out.println("");
        //método para busca binária em um vetor com a classe Arrays:
        int posicao = Arrays.binarySearch(vet, 4); //aramazenar a posição do valor 9 em vet
        //Arrays.binarySearch(nome do vetor, valor a ser buscado) -> retorna a posição do valor no vetor
        System.out.println("Encontrei o valor na posição " + posicao);
    }
    
}
