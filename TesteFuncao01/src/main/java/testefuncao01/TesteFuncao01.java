/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testefuncao01;

/**
 *
 * @author alice
 */
public class TesteFuncao01 {
    
    //método soma:
    static void soma(int a, int b){ //método sem retorno (void), com 2 inteiros (a e b) como entradas
        //o static deve ser colocado para que o método funcione dentro do main que também é static
        int s = a + b; //s recebe a soma de a e b
        System.out.println("A soma é " + s); //impressão do resultado
    }
    
    //método subtração:
    static int subtracao(int a, int b){ //método com retorno inteiro (int), com 2 inteiros (a e b) como entradas
        int s = a - b; //s recebe a subtração de a e b
        return s; //retorna o valor de s
    }
    
    //método main(principal): existe em todos os programas e é a primeira a ser executada
    public static void main(String[] args) {
        System.out.println("Commeçou o programa"); //só pra deixar claro que o programa inicia no main
        soma(5, 2); //chamada do método sem retonro (ele só é executado quando chamado)
        int sub = subtracao(5, 2); //como o método subtraçao possui retorno, ele deve ser armazenado em uma variável, no caso, sub
        System.out.println("A subtração é " + sub); //a impressão do resultado só é feita depois utilizando sub
    }
    
}
