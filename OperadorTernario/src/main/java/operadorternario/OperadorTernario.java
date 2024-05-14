/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadorternario;

/**
 *
 * @author alice
 */
public class OperadorTernario {
    
    public static void main(String[] args) {
        
        int n1, n2, r;
        n1 = 4;
        n2 = 8;
        r = (n1 > n2) ? 0 : 1; //operador ternário: se n1 > n2, r recebe 0, senão, r recebe 1
        System.out.println(r);
        int s = (n1 > n2) ? n1 + n2 : n1 - n2; //se n1 > n2, faz n1 + n2, senão, faz n1 - n2
        System.out.println(s);
        
        //operadores relacionais:
        //  > (maior que)
        //  < (menor que)
        //  >= (maior ou igual a)
        //  <= (menor ou igual a)
        //  == (igual a)
        //  != (diferente de)
        
    }
    
}
