package cafeaps;
import static cafeaps.CafeAPS.relatorio;

public class Altitude {
    int altitude;

    public Altitude(int altitude) {
        this.altitude = altitude;
        calcularAltitude();
    }
    
    public void calcularAltitude() {
        if (altitude < 600){
            relatorio.addRelatorioNegativo("Uma altitude menor do que 600 metros não é ideal para o plantio");
        } else if (altitude > 1200) {
            relatorio.addRelatorioNegativo("Altitudes elevadas não ideais para plantar sua cultura");
        }else {
            relatorio.addRelatorioPositivo("A altitude declarada é ideal para cultivar");
        }
    }
}