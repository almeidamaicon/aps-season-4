package cafeaps;
import static cafeaps.CafeAPS.relatorio;

public class SoloArenoso {
    boolean arenoso;

    public SoloArenoso(boolean arenoso) {
        this.arenoso = arenoso;
        defineSoloArenoso();
    }
    
    public void defineSoloArenoso(){
        if (this.arenoso) {
            relatorio.addRelatorioNegativo("Solo excessivamente arenoso pode atrapalhar");
        }
        else{
            relatorio.addRelatorioPositivo("O solo não é arenoso");
        }
    }
}