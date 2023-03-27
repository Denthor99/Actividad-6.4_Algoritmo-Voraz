package org.ieslosremedios.daw1.prog.ut6.actividad64;

import java.util.Arrays;

public class TestMochilaFraccionaria {
    public static void main(String[] args) {
        Double max = 100.0;
        int n = 5;
        Double[] pesos = {10.0, 20.0, 30.0, 40.0, 50.0};
        Double[] valores = {20.0, 30.0, 66.0, 40.0, 60.0};

        ProblemaMochilaFaccionaria pmf = new ProblemaMochilaFaccionaria(max,n,pesos,valores);
        pmf.voraz();
        System.out.println(Arrays.toString(pmf.solucion));
    }
}
