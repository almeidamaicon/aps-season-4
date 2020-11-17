package cafeaps;

public class Relatorios {
    String textoPositivo = "";
    String textoNegativo = "";
    int pontoPositivo = 0;
    int pontoNegativo = 0;
        
    public void addRelatorioPositivo(String novoTexto) {
        textoPositivo += "- " + novoTexto + "\n";
        pontoPositivo++;
    }
    
    public void addRelatorioNegativo(String novoTexto) {
        textoNegativo += "- " + novoTexto + "\n";
        pontoNegativo++;
    }
    
    public String getRelatorioPositivo() {
        return textoPositivo;
    }
    
    public String getRelatorioNegativo() {
        return textoNegativo;
    }
    
    public String getRelatorioFinal() {
        String relFinal;
        if (pontoPositivo > pontoNegativo) {
            relFinal = "esse é um bom momento e local para a plantação do café arábica.";
        } else {
            relFinal = "esse é não é um bom momento e local para a plantação do café arábica.";
        }
        return("Quanto mais pontos positivos, melhor será sua plantação. O contrário só prejudicará a mesma."
            + "Temos um total de " + pontoPositivo + " ponto(s) postivo(s) e " + pontoNegativo + " ponto(s) negativo(s). Matematicamente falando,"
            + relFinal);
    }
}
