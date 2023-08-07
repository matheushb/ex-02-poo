public class TransporteTerrestre extends Transportadora {
    public double calculaFrete(int altura, int largura) {
        return 0.2 * (altura / largura);
    }
}
