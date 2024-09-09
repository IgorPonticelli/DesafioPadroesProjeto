public class App {
    public static void main(String[] args) throws Exception {
        Codificador cod = new Codificador();

        String aux = "Desafio Padrões de Projeto";

        cod.setStrategy(new CodificadorSimplesStrategy());
        System.out.println(aux);
        aux = cod.codifica(aux);
        System.out.println(aux);
        aux = cod.deCodifica(aux);
        System.out.println(aux);

        cod.setStrategy(new CodificadorDeslocaStrategy());
        aux = cod.codifica(aux);
        System.out.println(aux);
        aux = cod.deCodifica(aux);
        System.out.println(aux);
    }
}
