package ar.edu.unahur.obj2.practicaparcial1.criterios;

import ar.edu.unahur.obj2.practicaparcial1.recetas.IReceta;

public class RecetaTradicional implements ICriterio{
    //Patron Singleton
    private static RecetaTradicional instance = new RecetaTradicional();
    private RecetaTradicional() {}
    public static RecetaTradicional getInstance() {return instance;}
    
    @Override
    public Boolean leGusta(IReceta receta) {
        return Boolean.valueOf(receta.esTradicional());
    }

}
