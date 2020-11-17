package cafeaps;
import static cafeaps.CafeAPS.relatorio;

public class SoloDrenagem {
    boolean drenagem;

    public SoloDrenagem(boolean fertil) {
        this.drenagem = fertil;
        defineSoloDrenagem();
    }
    
    public void defineSoloDrenagem(){
        if (this.drenagem) {
            relatorio.addRelatorioPositivo("O solo tem uma boa drenagem");
        }
        else{
            relatorio.addRelatorioNegativo("O solo não ter uma boa drenagem pode atrapalhar");
        }
    }
}