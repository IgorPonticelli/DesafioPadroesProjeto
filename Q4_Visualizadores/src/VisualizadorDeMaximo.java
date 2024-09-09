class VisualizadorDeMaximo implements Observer {
    private List<Integer> valores;

    @Override
    public void atualizar(List<Integer> valores) {
        this.valores = valores;
        exibeMaximo();
    }

    public void exibeMaximo() {
        Integer max = valores.stream()
            .mapToInt(Integer::intValue)
            .max()
            .orElse(0);
        System.out.println("Máximo: " + max + ", quantidade de elementos analisados: " + valores.size());
    }
}