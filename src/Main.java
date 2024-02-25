import Agua.*;
import Cafe.*;
import Edulcorante.*;
import Molino.*;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static Map<String,DepositoCafe> depositosCafe = new HashMap<>();
    public static Map<String,DepositoAgua> depositosAgua = new HashMap<>();
    public static Map<String,Edulcorante> depositosEdulcorante = new HashMap<>();

    private static void bootStrap(){
        depositosCafe.put("N",new DepCafeNormal());
        depositosCafe.put("D",new DepCafeDescafeinado());
        depositosAgua.put("1",new DepoAgua1());
        depositosAgua.put("2",new DepoAgua2());
        depositosEdulcorante.put("S",new Sacarina());
        depositosEdulcorante.put("A",new Azucar());

    }

    public static void main(String[] args) {
        bootStrap();
//        args = new String[3];
//        args[0] = "N";
//        args[1] = "S";
//        args[2] = "2";

        Molino molino = new Molino1();
        DepositoCafe depositoCafe = depositosCafe.get(args[0]);
        Edulcorante edulcorante = depositosEdulcorante.get(args[1]);
        DepositoAgua depositoAgua = depositosAgua.get(args[2]);

        if (depositosCafe.get(args[0])==(null) || depositosEdulcorante.get(args[1])==(null) || depositosAgua.get(args[2])==(null)) {
            System.err.println("Error en el uso de parametros.");
            System.exit(1);
        }




        depositoCafe.verter();
        molino.Moler();
        depositoAgua.verterSobreCafe();
        edulcorante.verterEdulcorante();
        depositoAgua.enjuagar();
    }


}
