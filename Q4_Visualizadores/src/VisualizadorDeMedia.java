class VisualizadorDeMedia implements Observer {
    private List<Integer> valores;

    @Override
    public void atualizar(List<Integer> valores) {
        this.valores = valores;
        exibeMedia();
    }

    public void exibeMedia() {
        double media = valores.stream()
            .mapToInt(Integer::intValue)
            .average()
            .orElse(0.0);
        System.out.println("Média: " + media + ", quantidade de elementos analisados: " + valores.size());
    }
}