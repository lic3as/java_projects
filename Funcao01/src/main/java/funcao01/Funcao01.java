/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funcao01;

/**
 *
 * @author alice
 */
public class Funcao01 {
 
    public static void main(String[] args) {
        
        Fatorial f = new Fatorial(); //novo objeto fatorial, possui todos os atributos da classe Fatorial
        
        f.setValor(5); //calculando o fatorial de 5
        System.out.println(f.getFormula()); //imprimindo a fórmula do fatorial de 5
        System.out.println(f.getFatorial()); //imprimindo o resultado do fatorial de 5
        
    }
    
}
