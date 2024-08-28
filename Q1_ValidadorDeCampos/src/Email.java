public class Email implements ValidatorTypesFactory{
    @Override
    public boolean valida(Tipo tipo, String valor) {
        int posA = valor.indexOf('@');
                int posPt = valor.indexOf('.');
                if (posA <= 0 || posPt <= 0) return false;
                return true;
    }
}