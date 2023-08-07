public class App {
    public static void main(String[] args) throws Exception {
        int altura = 10;
        int largura = 5;

        TransporteNautico transporteNautico = new TransporteNautico();
        TransporteTerrestre transporteTerrestre = new TransporteTerrestre();

        double freteNautico = transporteNautico.calculaFrete(altura, largura);
        double freteTerrestre = transporteTerrestre.calculaFrete(altura, largura);

        System.out.println("Frete Transporte Náutico: " + freteNautico);
        System.out.println("Frete Transporte Terrestre: " + freteTerrestre);
    }
}
