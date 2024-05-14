package horadosistema;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.Date;
import java.util.Locale;

public class HoraDoSistema {
    
    public static void main(String[] args) {
        //método para ver a data do sistema
        Date relogio = new Date(); //Date é um método, new está criando um novo objeto (relogio)
        System.out.println("A hora do sistema é:");
        System.out.println(relogio.toString()); //converte o objeto relógio (data) para uma string
        
        //método para ver o idioma do sistema
        Locale idioma = Locale.getDefault(); //Locale é um método, idioma é um objeto
        System.out.println("O idioma do sistema é:");
        System.out.println(idioma.getDisplayLanguage());
        
        //método para ver a resolução da tela do sistema
        Toolkit tela = Toolkit.getDefaultToolkit(); //Toolkit é um método, tela é um objeto
        System.out.println("A resolução do sistema é:");
        Dimension dimensao = tela.getScreenSize(); //Dimension é um método, dimensão é um objeto 
        System.out.println("Largura da tela = " + dimensao.width); //pegando a largura da domensão
        System.out.println("Altura da tela = " + dimensao.height); //pegando a altura da dimensão
;    }
    
}
