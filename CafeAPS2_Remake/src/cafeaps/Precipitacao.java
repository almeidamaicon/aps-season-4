package cafeaps;
import static cafeaps.CafeAPS.relatorio;

public class Precipitacao {
    int precipitacao;
    
    public Precipitacao (int precipitacao) {
        this.precipitacao = precipitacao;
        calcularPrecipitacao();
    }
    
    public void calcularPrecipitacao()  {
        if (precipitacao < 600) {
            relatorio.addRelatorioNegativo("A preciptação anual é muito baixa, pouca chuva pode atrapalhar.");
        } else if (precipitacao > 1500) {
            relatorio.addRelatorioNegativo("A preciptação anual é muito alta para a plantação, muita chuva pode atrapalhar.");
        }
        else {
            relatorio.addRelatorioPositivo("Preciptação anual é ideal para a plantação.");
        }
    }
}