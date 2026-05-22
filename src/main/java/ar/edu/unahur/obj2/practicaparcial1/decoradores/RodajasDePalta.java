package ar.edu.unahur.obj2.practicaparcial1.decoradores;

import ar.edu.unahur.obj2.practicaparcial1.recetas.IReceta;

public class RodajasDePalta extends IngredienteDecorador{

    public RodajasDePalta(IReceta receta) {
        super(receta);
    }

    @Override
    public String getNombreIngrediente() {
        return "Rodajas de palta";
    }

    @Override
    public Integer getValorAdicional() {
        return 160;
    }

}
