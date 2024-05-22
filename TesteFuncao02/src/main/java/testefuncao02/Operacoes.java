/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testefuncao02;

/**
 *
 * @author alice
 */
public class Operacoes {
 
    public static String contador(int i, int f){ //método com retorn do tipo string e com 2 inteiros de entrada
        //esse método irá imprimir a contagem de i até f
        //o static é para o método poder ser usado dentro de outro static
        //o public é para o método poder ser acessado por qualquer classe ou método do pacote
        String s = ""; //inicia com vazio
        for(int c = i; i <= f; c++){ //ir de i até f incrementando 1 
            s += c + " "; //adiciona a string o valor e um espaço em branco
        }
        return s; //retorno da string
    }
    
}
