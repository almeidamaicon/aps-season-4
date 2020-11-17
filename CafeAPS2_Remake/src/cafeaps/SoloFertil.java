package cafeaps;
import static cafeaps.CafeAPS.relatorio;

public class SoloFertil {
    boolean fertil;

    public SoloFertil(boolean fertil) {
        this.fertil = fertil;
        defineSoloFertil();
    }
    
    public void defineSoloFertil(){
        if (this.fertil) {
            relatorio.addRelatorioPositivo("O solo é fértil");
        }
        else{
            relatorio.addRelatorioNegativo("O ideal é o solo ser fértil");
        }
    }
}