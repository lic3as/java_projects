/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetor05;

import java.util.Arrays;

/**
 *
 * @author alice
 */
public class Vetor05 {
 
    public static void main(String[] args) {
        int num[] = new int[25]; //novo vetor com 25 posições
        Arrays.fill(num, 0); //preencher todas as posições do vetor automaticamente com 0
        for(int v:num){
            System.out.print(num[v] + " ");
        }
    }
    
}
