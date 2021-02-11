package src.model;

public class Cuenta {
    private int saldo = 12000;

    public int getSaldo() {
        return saldo;
    }

    public void retiro(int cantidad){
        saldo = saldo - cantidad;
    }
}
