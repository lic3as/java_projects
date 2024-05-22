/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetor01;

/**
 *
 * @author alice
 */
public class Vetor01 {
    
    public static void main(String[] args) {
        //CRIAÇÃO DE VETORES
        //
        //forma 1:
        int n[] = new int[4]; //criar um vetor n de 4 posições
        n[0] = 3; //posição 0 recebe 3
        n[1] = 5; //posição 1 recebe 5
        n[2] = 8; //posição 2 recebe 8
        n[3] = 2; //posiçõa 3 recebe 2
        System.out.println("Total de posições de n: " + n.length); //length é um método para pegar o comprimento do vetor
        //lembrando que as posições do vetor começam em 0, ou seja, se tem 4 posições, a primeira é n[0] e a última é n[3]
        //
        //forma 2:
        int m[] = {7, 0, 2, 6}; //vetor com 4 posições com os valores já atribuídos
        //m[0] = 7; m[1] = 0; m[2] = 2; m[3] = 6
        //
        //IMPRESSÃO DE VETORES
        //
        //forma 1 (quando sabe o comprimento do vetor):
        //for(int i = 0; i <= 3; i++){ //cada interação imprimirá uma posição do vetor, por isso, começa em 0, vai até 3 e incrementa de 1 em 1
        //    System.out.println("n[" + i + "] = " + n[i]); //imprime n na posição i
        //}
        //
        //forma 2 (geral para qualquer vetor):
        for(int i = 0; i <= n.length - 1; i++){ //a condição de parada será o comprimento de n-1, ou seja, a última posição do vetor
            System.out.println("n[" + i + "] = " + n[i]);
        }
        
        
    }
    
}
