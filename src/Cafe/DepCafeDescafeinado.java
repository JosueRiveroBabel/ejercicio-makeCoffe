package Cafe;

public class DepCafeDescafeinado implements DepositoCafe{

    public DepCafeDescafeinado(){
    }
    @Override
    public void verter() {
        System.out.println("Deposito de cafe descafeinado: verter cafe");
    }
}
