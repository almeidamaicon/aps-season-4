package cafeaps;
import static cafeaps.CafeAPS.relatorio;

public class Temperatura {
    int temperatura;
    
    public Temperatura(int temperatura) {
        this.temperatura = temperatura;
        calcularTemperatura();
    }
    

    public void calcularTemperatura(){
        if (temperatura < 18 || temperatura > 22 ){
            relatorio.addRelatorioNegativo("Não é a melhor temperatura para o plantio.");
        } else {
            relatorio.addRelatorioPositivo("Essa é a melhor temperatura para se plantar o café");
        }
    }
}