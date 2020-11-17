package cafeaps;
import static cafeaps.CafeAPS.relatorio;

public class Profundidade {
    int profundidade;

    public Profundidade(int profundidade) {
        this.profundidade = profundidade;
        defineSoloProfund();
    }

    
    public void defineSoloProfund(){
        if (this.profundidade < 1) {
            relatorio.addRelatorioNegativo("A profundidade do solo deve ser de no mínimo 1 metro.");
        }
        else{
            relatorio.addRelatorioPositivo("O solo apresenta uma boa profundidade para o plantio.");
        }
    }
}