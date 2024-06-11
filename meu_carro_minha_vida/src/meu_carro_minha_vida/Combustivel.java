package meu_carro_minha_vida;

/**
 *
 * @author Vinicius
 */
public class Combustivel {
    private double valorAlcool;
    private double valorGasolina;
    private double resultado;
    private double quantidadeAbastecida;
    private double distanciaPercorrida;
    private double valorAbastecido;
    private int diasCarroMes;

    public double getValorAbastecido() {
        return valorAbastecido;
    }

    public void setValorAbastecido(double valorAbastecido) {
        this.valorAbastecido = valorAbastecido;
    }

    public double getDistanciaPercorrida() {
        return distanciaPercorrida;
    }

    public void setDistanciaPercorrida(double distanciaPercorrida) {
        this.distanciaPercorrida = distanciaPercorrida;
    }

    public double getQuantidadeAbastecida() {
        return quantidadeAbastecida;
    }

    public void setQuantidadeAbastecida(double quantidadeAbastecida) {
        this.quantidadeAbastecida = quantidadeAbastecida;
    }

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

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }

    public int getDiasCarroMes() {
        return diasCarroMes;
    }

    public void setDiasCarroMes(int diasCarroMes) {
        this.diasCarroMes = diasCarroMes;
    }

    public double CalcularAutonomia() {
        double autonomia = distanciaPercorrida / quantidadeAbastecida;
        return autonomia;
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

    public double GastoMensal() {
        double custoPorKmGasolina = getValorGasolina() / CalcularAutonomia();
        double custoPorKmAlcool = getValorAlcool() / CalcularAutonomia();
        double gastoMensalGasolina = custoPorKmGasolina * distanciaPercorrida * diasCarroMes;
        double gastoMensalAlcool = custoPorKmAlcool * distanciaPercorrida * diasCarroMes;
        
        // Aqui você pode escolher retornar um dos valores ou ambos. 
        // No caso, vou retornar a soma dos dois gastos mensais.
        return gastoMensalGasolina + gastoMensalAlcool;
    }
}
