package src.app;
import src.model.Cuenta;

public class TitularDeLaCuenta implements Runnable{
    private Cuenta cuenta;

    public TitularDeLaCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }

    public TitularDeLaCuenta() {
	}

	@Override
    public void run(){
        for (int i=1; i<=1; i++){
            hacerRetiro(2000);
            if (cuenta.getSaldo() < 0) {
                System.out.println("La cuenta está sobregirada");
            }
        }
    }

    private synchronized void hacerRetiro( int cantidadDeRetiro){
        if (cuenta.getSaldo() >= cantidadDeRetiro){
            System.out.println(Thread.currentThread().getName() + " está haciendo un retiro de $"+cantidadDeRetiro);
            try {
                Thread.sleep(3000);
            } catch (InterruptedException ex){
            }
            cuenta.retiro(cantidadDeRetiro);
            System.out.println(Thread.currentThread().getName() + " completó el retiro de $"+cantidadDeRetiro);
        } else {
            System.out.println("No hay suficiente dinero en la cuente de " + 
                Thread.currentThread().getName() + " para retirar " + cuenta.getSaldo());
        }

        System.out.println("Luego de los retiros de ")
    }
}
