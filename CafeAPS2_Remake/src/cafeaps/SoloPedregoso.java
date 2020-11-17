package cafeaps;
import static cafeaps.CafeAPS.relatorio;

public class SoloPedregoso {
    boolean pedregoso;

    public SoloPedregoso(boolean pedregoso) {
        this.pedregoso = pedregoso;
        defineSoloPedregoso();
    }
    
    public void defineSoloPedregoso(){
        if (this.pedregoso) {
            relatorio.addRelatorioNegativo("O ideal é o solo não ser pedregoso");
        }
        else{
            relatorio.addRelatorioPositivo("O solo não é pedregoso");
        }
    }
}