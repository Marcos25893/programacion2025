package tema7_parte3.wallapop;

import tema7_parte3.wallapop.io.FileUtils;
import tema7_parte3.wallapop.services.GestionComprasVentas;

public class AppGestion {
    public static void main(String[] args) {

        GestionComprasVentas gcv = FileUtils.loadCSV();
        gcv.transaccionesPorCategoria().forEach((k,v) ->
                System.out.println(k + " " + v));


    }
}
