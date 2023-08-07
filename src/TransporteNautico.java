public class TransporteNautico extends Transportadora {
    public double calculaFrete(int altura, int largura) {
        return 0.1 * (altura + largura);
    }
}