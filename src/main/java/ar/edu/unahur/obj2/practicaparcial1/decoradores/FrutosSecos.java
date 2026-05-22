package ar.edu.unahur.obj2.practicaparcial1.decoradores;

import ar.edu.unahur.obj2.practicaparcial1.recetas.IReceta;

public class FrutosSecos extends IngredienteDecorador{

    public FrutosSecos(IReceta receta) {
        super(receta);
    }

    @Override
    public String getNombreIngrediente() {
        return "Frutos Secos";
    }

    @Override
    public Integer getValorAdicional() {
        return 594;
    }

}
