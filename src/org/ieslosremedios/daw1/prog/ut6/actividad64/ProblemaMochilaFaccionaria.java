package org.ieslosremedios.daw1.prog.ut6.actividad64;

import java.util.Arrays;

public class ProblemaMochilaFaccionaria extends EsquemaVoraz{

    private int n;
    private Double max;
    private Double pesoActual;

    private Double[] pesos;
    private Double[] valores;

    public ProblemaMochilaFaccionaria(int n, Double max, Double[] pesos, Double[] valores) {
        this.n = n;
        this.max = max;
        this.pesos = pesos;
        this.valores = valores;
    }

    /**
     * Calcular candidato
     */
    @Override
    protected void anotaEnSolucion() {
        // TODO: CREAMOS UN CONDICIONAL, PUES DEBEMOS TENER EN CUENTA EL PESO
        // peso actual 80, peso etapa 30
        // 80+30<=max
        if (pesoActual + pesos[etapa] <= max){
            candidato=1;
        } else { //TODO:
            candidato=Double.valueOf((max - pesoActual)) / pesos[etapa];
        }

        solucion[etapa]=candidato;
        pesoActual= Double.valueOf(pesoActual) + (Double)candidato * Double.valueOf(pesos[etapa]);
    }

    /**
     * @return
     */
    @Override
    protected boolean esPrometedor() {
        return true;
    }

    /**
     *
     */
    @Override
    protected void seleccionaYEliminaCandidato() {
        Double mayor = Double.valueOf(valores[0])/pesos[0];
        for (int i = 1; i < n; i++) {
            if (mayor < Double.valueOf(valores[i])/pesos[i]) {
                mayor = Double.valueOf(valores[i])/Double.valueOf(pesos[i]);
                etapa=i;
            }
        }
        candidato = mayor;
        // Elimina candidato
        valores[etapa] = 0.0;
    }

    /**
     * @return
     */
    @Override
    protected boolean fin() {
        return max.equals(pesoActual);
    }

    /**
     *
     */
    @Override
    protected void inicializa() {
        solucion = new Object[n];
        Arrays.fill(solucion,0);
        pesoActual = 0.0;
    }
}
