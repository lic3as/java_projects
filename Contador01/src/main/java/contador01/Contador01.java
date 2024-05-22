/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contador01;

/**
 *
 * @author alice
 */
public class Contador01 {
    
    public static void main(String[] args) {
        
        int cc = 0; //contador de cambalhotas
        while(cc < 10){ //repete 4 vezes (enquanto cc for menor que 4
            cc++;
            if(cc == 5 || cc == 7){
                continue; //o comando continue faz com que volte para o while novamente, ou seja, não executa os comandos da frente e já vai para um novo loop
                //nesse caso, as cambalhotas 5 e 7 não serão imprimidas
            }
            System.out.println("Cambalhota"   + cc);
        }
        int cp = 0; //contador de pulos
        while(cp < 10){
            cp++;
            if(cp == 3){
                break; //o comando break quebra o loop, ou seja, quando houver um break, o programa automaticamente sai do loop
                //nesse caso, quando cp for igual a 3, o loop irá parar e não serão imprimidos mais pulos
            }
            System.out.println("Pulo " + cp);
        }
    }
    
}
