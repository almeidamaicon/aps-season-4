package cafeaps;
import static cafeaps.CafeAPS.relatorio;

public class Area {
    int largura; 
    int comprimento;
    
    public Area(int largura, int comprimento) {
        this.largura = largura; 
        this.comprimento = comprimento;
        
        calcularArea();
    }
    
    public void calcularArea(){
        int areaTerreno = largura * comprimento;
        System.out.println(areaTerreno);
        if (areaTerreno < 100){
            relatorio.addRelatorioNegativo("Área informada em metros quadrados não é ideal para plantar");
        }else {
            relatorio.addRelatorioPositivo("Área informada em metros quadrados é ideal");
        }
    }
}
