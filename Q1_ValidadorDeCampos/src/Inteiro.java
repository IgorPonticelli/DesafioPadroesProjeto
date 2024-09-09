public class Inteiro implements ValidatorTypesFactory {
    @Override
    public boolean valida(Tipo tipo, String valor) {
        for(int i=0;i<valor.length();i++){
            if (!Character.isDigit(valor.charAt(i))){
                return false;
            }
        }
        return true;
    }
}