/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciorepita;

import javax.swing.JOptionPane; //biblioteca com painéis já prontoos

/**
 *
 * @author alice
 */
public class ExercicioRepita {
    
    public static void main(String[] args) {
        //mensagem
        //JOptionPane.showMessageDialog(null, "Olá, mundo!", "Boas vindas", JOptionPane.INFORMATION_MESSAGE); //mostrar uma mensagem (janela da mensagem, mensagens)
        //tem como selecionar também o ícone da janela (JOptionPane.ERROR_MESSAGE, JOptionPane.INFORMATION_MESSAGE, JOptionPane.QUESTION_MESSAGE, etc)
        
        //mensagem com entrada de dados
        //JOptionPane.showInputDialog(null, "Informe um número: "); //entrada de dados(nome da janala, argumentos)
        //isso pode ser usado pra colocar o valor informado em uma variável:
        //int num = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um  número: ")); //pegar o valor pelo input e armazenar em num
        //JOptionPane.showMessageDialog(null, "Você digitou o número " + num); //imprimir o número através da mensagem
        
        //programa envolvendo o JOptionPane:
        int num; //número que será informado pelo usuário
        int sum = 0; //soma dos números informados, inicia em 0
        int qtdNum = 0; //armazenar a quantidade de números digitados
        int qtdPares = 0; //armazenar a quantidade de pares
        int qtdImpares = 0; //armazenar a quantidade de ímpares
        int qtdMaior = 0; //armazenar a quantidade de maiores que 100
        int media; //média dos valores (sum / qtdNum)
        
        do{
            num = Integer.parseInt(JOptionPane.showInputDialog(null, "<html> Informe um número: <br> <em> (Digite 0 para sair) </em> </html>")); //pegar o valor do número e armaenar em num, mostrar as informações no painel também
            sum += num; //fazer o somatório dos números digitados
            qtdNum++; //mais um número digitado
            if(num % 2 == 0){
                qtdPares++; //mais um número par
            } else {
                qtdImpares++; //mais um número ímpar
            } 
            if(num > 100){
                qtdMaior++; //mais um número maior que 100
            }
        } while(num != 0); //o 0 interrompe o programa, enquanto o número for diferente de 0
        media = sum / qtdNum; //cálculo da média
        
        JOptionPane.showMessageDialog(null, "<html> Resultado Final <hr>" + "Valor do somatório: " + sum + "<br>Total de valores: " + qtdNum + "<br>Total de pares: " + qtdPares + "<br>Total de ímpares: " + qtdImpares + "<br>Acima de 100: " + qtdMaior + "<br>Média dos valores: " + media + "</html>"); //apresentar o resultado na mensagem
        //com html dá pra formatar todo o texto
    }
    
}
