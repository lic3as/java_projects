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
public class Fatorial {
 
    private int num = 0; //número do fatorial iniciado com  0 (pode usar apenas nessa classe - private)
    private int fat = 1; //resultado do fatorial iniciado com 1 (private)
    private String formula = ""; //string com a fórmula inicia vazia (private)
    
    public  void setValor(int n){ //calcular o fatorial através de um valor n
        num = n; //armazena n em num
        int f = 1; //armazenar o valor do fatorial
        String s = ""; //armazenar o valor da string
        for(int c = n; c > 1; c --){
            f *= c; //calcular o fatorial
            s += c + " x "; //adicionar o valor e o símbolo de multiplicação a fórmula
        }
        s += "1 = "; //finalizar a fórmula
        fat = f; //armazena f em fat
        formula = s; //armazena s em formula
    }
    
    public int getFatorial(){ //retorna o valor do fatorial
        return fat;
    }
    
    public String getFormula(){ //retorna o valor da fórmula
        return formula;
    }
    
}
