public class App {
    public static void main(String[] args) throws Exception {
        var dados = new FonteDeDados();
        var cm = new VisualizadorDeMedia();
        var cs = new VisualizadorDeSomatorio();
        var cmax = new VisualizadorDeMaximo();

        Scanner s = new Scanner(System.in);
        int valor = 0;

        // Menu para ativar os visualizadores
        boolean ligadoMedia = false;
        boolean ligadoSomatorio = false;
        boolean ligadoMaximo = false;

        while (true) {
            System.out.println("\nOpções: ");
            System.out.println("-1 = Ligar/Desligar visualizador de Somatório");
            System.out.println("-2 = Ligar/Desligar visualizador de Média");
            System.out.println("-3 = Ligar/Desligar visualizador de Máximo");
            System.out.println("Entre um valor positivo maior que zero (0 = fim):");

            valor = Integer.parseInt(s.nextLine());

            if (valor == -1) {
                if (!ligadoSomatorio) {
                    dados.adicionarObserver(cs);
                    ligadoSomatorio = true;
                    System.out.println("Visualizador de Somatório ligado.");
                } else {
                    dados.removerObserver(cs);
                    ligadoSomatorio = false;
                    System.out.println("Visualizador de Somatório desligado.");
                }
            } else if (valor == -2) {
                if (!ligadoMedia) {
                    dados.adicionarObserver(cm);
                    ligadoMedia = true;
                    System.out.println("Visualizador de Média ligado.");
                } else {
                    dados.removerObserver(cm);
                    ligadoMedia = false;
                    System.out.println("Visualizador de Média desligado.");
                }
            } else if (valor == -3) {
                if (!ligadoMaximo) {
                    dados.adicionarObserver(cmax);
                    ligadoMaximo = true;
                    System.out.println("Visualizador de Máximo ligado.");
                } else {
                    dados.removerObserver(cmax);
                    ligadoMaximo = false;
                    System.out.println("Visualizador de Máximo desligado.");
                }
            } else if (valor > 0) {
                dados.add(valor);
            } else if (valor == 0) {
                break;
            }
        }
        System.out.println("Fim");
        s.close();
    }
}