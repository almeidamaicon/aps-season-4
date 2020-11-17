package cafeaps;

import view.Screen;

public class CafeAPS {   
    public static Relatorios relatorio = new Relatorios();
    
    public static void main(String[] args) {
        Screen.main(args);
    }
    
    public static String textoSobre() {
        return ("Atualmente, e principalmente no Brasil, o consumo de café é muito grande. Somos o segundo maior consumidor atrás apenas dos Estados Unidos.\n"
                + "\nComeçando no século 19, o café foi um produto muito exportado em nosso país, com compradores em todo mundo.\n"
                + "O café arabica é um tipo de café natural da Arábia, sendo considerada uma espécie gourmet muito apreciada.\n"
                + "\nNosso programa auxilia o produtor de café a escolher as melhores condições de plantio, aumento de rendimento e aproveitamento do solo, segundo as informações escolhidas por ele.");
    }
}
