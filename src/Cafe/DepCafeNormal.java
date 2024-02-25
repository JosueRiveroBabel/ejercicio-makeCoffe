package Cafe;

public class DepCafeNormal implements DepositoCafe{

    public DepCafeNormal(){
    }
    @Override
    public void verter() {
        System.out.println("Deposito de cafe normal: verter cafe");
    }
}
