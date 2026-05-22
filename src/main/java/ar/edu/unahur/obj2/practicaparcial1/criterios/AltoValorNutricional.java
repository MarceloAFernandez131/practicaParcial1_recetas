package ar.edu.unahur.obj2.practicaparcial1.criterios;

import ar.edu.unahur.obj2.practicaparcial1.recetas.IReceta;

public class AltoValorNutricional implements ICriterio{
    private Integer valorMinimo;

    public AltoValorNutricional(Integer valorMinimo) {
        this.valorMinimo = valorMinimo;
    }

    @Override
    public Boolean leGusta(IReceta receta) {
        return Boolean.valueOf(receta.getValorNutricional() > valorMinimo);
    }

}
