/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparacaostring;

/**
 *
 * @author alice
 */
public class ComparacaoString {
    
    public static void main(String[] args) {
        
        String nome1 = "Gustavo";
        String nome2 = "Gustavo";
        String nome3 = new String("Gustavo");
        
        String res = (nome1 == nome2) ? "Igual" : "Diferente"; //se nome1 e nome2 forem iguais, res recebe "igual", senão, res recebe "diferente"
        System.out.println(res);
        
        String res2 = (nome1 == nome3) ? "Igual" : "Diferente"; //se nome1 e nome2 forem iguais, res2 recebe "igual, senão, res2 recebe "difenrete"
        System.out.println(res2);
        //nesse caso, vai dar "diferente" porque os objetos, apesar de possuírem nomes iguais, foram instanciados de forma diferente, então, para o computador eles são diferentes
        // enquanto nome1 e nome2 são variáveis, nome3 é um objeto, pra objetos, deve ser utilizado o .equals:
        String res3 = (nome1.equals(nome3)) ? "Igual" : "Diferente"; 
        System.out.println(res3);
        //nesse caso, vai dar "igual" porque  a comparação será feita com os conteúdos
        
        //operadores lógicos:
        //  && (e, and)
        //  || (ou, or)
        //  ^ (ou exclusivo, xor)
        //  ! (não, not)
    }
    
}
