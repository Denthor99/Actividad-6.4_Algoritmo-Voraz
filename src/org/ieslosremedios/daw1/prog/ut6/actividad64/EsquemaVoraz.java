package org.ieslosremedios.daw1.prog.ut6.actividad64;

public abstract class EsquemaVoraz {
    // Atributos internos del algoritmo
    Object[] solucion;
    Double candidato;
    int etapa;
    public void voraz () {
        inicializa();
        while (!fin()) {
            seleccionaYEliminaCandidato();
            if (esPrometedor()) {
                anotaEnSolucion();
            }
        }
    }

    protected abstract void anotaEnSolucion();

    protected abstract boolean esPrometedor();

    protected abstract void seleccionaYEliminaCandidato();

    protected abstract boolean fin();

    protected abstract void inicializa();

}