package ar.edu.unahur.obj2.practicaparcial1.decoradores;

import ar.edu.unahur.obj2.practicaparcial1.recetas.IReceta;

public class SemillasDeChia extends IngredienteDecorador{

    public SemillasDeChia(IReceta receta) {
        super(receta);
    }

    @Override
    public String getNombreIngrediente() {
        return "Semilla de Chia";
    }

    @Override
    public Integer getValorAdicional() {
        return 490;
    }

}
