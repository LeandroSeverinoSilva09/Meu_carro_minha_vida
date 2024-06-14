package meu_carro_minha_vida;

/**
 *
 * @author Vinicius
 */
public class Combustivel {
    private double valorAlcool;
    private double valorGasolina;

    public double getValorAlcool() {
        return valorAlcool;
    }

    public void setValorAlcool(double valorAlcool) {
        this.valorAlcool = valorAlcool;
    }

    public double getValorGasolina() {
        return valorGasolina;
    }

    public void setValorGasolina(double valorGasolina) {
        this.valorGasolina = valorGasolina;
    }

    public String ViabilidadeEconomica() {
        double relacao = getValorAlcool() / getValorGasolina();

        if (relacao <= 0.70) {
            return "ALCOOL";
        } else if (relacao > 0.70) {
            return "GASOLINA";
        } else {
            return "ERRO";
        }
    }

}
