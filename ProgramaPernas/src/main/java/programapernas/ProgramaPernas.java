/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programapernas;

import java.util.Scanner;

/**
 *
 * @author alice
 */
public class ProgramaPernas {
    
    public static void main(String[] args) {
        
        Scanner tec = new Scanner(System.in);
        System.out.println("Quantas pernas?");
        int pernas = tec.nextInt(); //pegar o valor das pernas
        
        String tipo; //pro resultado
        System.out.print("Isso é um(a) ");
        //o switch serve para quando vc tem várias alternativas para uma mesma váriável de entrada, cada valor é um caso e o caso default é o que não tem nenhum dos outros valores
        //a cada fim de case deve ser colocado um break pra que o final seja reconhecido
        //ou seja, case 1 significa o caso em que a variável pernas é igual a 1
        switch(pernas){
            case 1:
                tipo = "saci";
                break;
            case 2:
                tipo = "bípede";
                break;
            case 3:
                tipo = "tripé";
                break;
            case 4:
                tipo = "quadrúpede";
                break;
            case 6:
                tipo = "aranha";
                break;
            default:
                tipo = "ET";
                break;
        }
        System.out.println(tipo);
    }
    
}
