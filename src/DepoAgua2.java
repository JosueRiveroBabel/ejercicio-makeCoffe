public class DepoAgua2 implements DepositoAgua{


    public DepoAgua2(){
    }
    @Override
    public void enjuagar() {
        System.out.println("Deposito de agua 2: enjuaga el circuito ");
    }

    @Override
    public void verterSobreCafe() {
        System.out.println("Deposito de agua 2: verter agua");
    }
}
