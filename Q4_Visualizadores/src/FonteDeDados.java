class FonteDeDados {
    private List<Integer> valores;
    private List<Observer> observers;

    public FonteDeDados() {
        valores = new LinkedList<>();
        observers = new ArrayList<>();
    }

    public void add(Integer valor) {
        if (valor < 0) throw new IllegalArgumentException("Valor inválido");
        valores.add(valor);
        notificarObservers();
    }

    public void adicionarObserver(Observer o) {
        observers.add(o);
    }

    public void removerObserver(Observer o) {
        observers.remove(o);
    }

    private void notificarObservers() {
        for (Observer o : observers) {
            o.atualizar(new ArrayList<>(valores));
        }
    }

    public int quantidade() {
        return valores.size();
    }

    public List<Integer> getValores() {
        return new ArrayList<>(valores);
    }
}
