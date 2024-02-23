public class Main {
    public static void main(String[] args) {


        Molino molino = new Molino1();
        DepositoCafe depositoCafe;


        if (args[0].equals("D")) {
            depositoCafe = new DepCafeDescafeinado();
        } else {
            depositoCafe = new DepCafeNormal();
        }

        Edulcorante edulcorante;
        if (args[1].equals("S")) {
            edulcorante = new Sacarina();
        } else {
            edulcorante = new Azucar();
        }

        DepositoAgua depositoAgua;
        if (args[2].equals("1")) {
            depositoAgua = new DepoAgua1();
        } else {
            depositoAgua = new DepoAgua2();

        }

        depositoCafe.verter();
        molino.Moler();
        depositoAgua.verterSobreCafe();
        edulcorante.verterEdulcorante();
        depositoAgua.enjuagar();
    }


}
