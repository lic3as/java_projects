/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadoreslogicos;

/**
 *
 * @author alice
 */
public class OperadoresLogicos {
    
    public static void main(String[] args) {
        
        int x, y, z;
        x = 4;
        y = 7; 
        z = 12; 
        boolean r = (x < y && y < z) ? true : false; // se x < y e y < z, r recebe true, senão r recebe false
        System.out.println(r);
        
    }
    
}
