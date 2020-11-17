package cafeaps;
import static cafeaps.CafeAPS.relatorio;

public class EpocaPlantar {
    int mes;
    
    public EpocaPlantar(int mes) {
        this.mes = mes;
        calcularEpoca();
    }
    

    public void calcularEpoca(){
        if (this.mes == 11 || this.mes == 12){
            relatorio.addRelatorioPositivo("Entre Novembro e Dezembro é época do ano para se plantar o café arábica.");
        } else {
            relatorio.addRelatorioNegativo("Não é recomendado o plantio de café nessa época do ano, será melhor entre Novembro e Dezembro");
        }
    }
}