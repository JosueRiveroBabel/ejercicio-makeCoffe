package Agua;

public class DepoAgua1 implements DepositoAgua{

    public DepoAgua1(){
    }
    @Override
    public void enjuagar() {
        System.out.println("Deposito de agua 1: enjuaga el circuito ");
    }

    @Override
    public void verterSobreCafe() {
        System.out.println("Deposito de agua 1: verter agua");
    }
}
