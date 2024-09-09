public class Codificador {
    private CodificadorStrategy strategy;

    public void setStrategy(CodificadorStrategy strategy) {
        this.strategy = strategy;
    }

    public String codifica(String str) {
        if (strategy == null) {
            throw new IllegalStateException("Strategy not set");
        }
        return strategy.codifica(str);
    }

    public String deCodifica(String str) {
        if (strategy == null) {
            throw new IllegalStateException("Strategy not set");
        }
        return strategy.deCodifica(str);
    }
}
