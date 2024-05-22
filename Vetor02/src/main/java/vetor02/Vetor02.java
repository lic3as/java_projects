/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetor02;

/**
 *
 * @author alice
 */
public class Vetor02 {
    
    public static void main(String[] args) {
        String mes[] = {"janeiro", "fevereiro", "março", "abril", "maio", "junho", "julho", "agosto", "setembro", "outubro", "novembro", "dezembro"}; //vetor com os meses do ano
        int dias[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31 ,30, 31}; //vetor com o total de dias de cada mês
        
        for(int i = 0; i < mes.length; i++){ //como os dois vetores possuem o mesmo tamanho, é possível fazer um único for
            //o loop inicializa na posição 0, vai sendo incrementado em 1 a cada iteração e para quando chegar ma última posição (i < comprimento de n)
            System.out.println("O mês de " + mes[i] + " tem " + dias[i] + " dias ao todo.");
            //a cada iteração, imprime o mês em questão e sua quantidade de dias
        }   
    }
    
}
