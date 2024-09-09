class VisualizadorDeSomatorio implements Observer {
    private List<Integer> valores;

    @Override
    public void atualizar(List<Integer> valores) {
        this.valores = valores;
        exibeSomatorio();
    }

    public void exibeSomatorio() {
        Integer soma = valores.stream()
            .mapToInt(Integer::intValue)
            .sum();
        System.out.println("Somatório: " + soma + ", quantidade de elementos analisados: " + valores.size());
    }
}