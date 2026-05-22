package ar.edu.unahur.obj2.practicaparcial1.criterios;

import java.util.List;

import ar.edu.unahur.obj2.practicaparcial1.recetas.IReceta;

public class Premium implements ICriterio{
    private final List<String> autores;

    public Premium(List<String> autores) {
        this.autores = autores;
    }
    
    @Override
    public Boolean leGusta(IReceta receta) {
        return Boolean.valueOf(autores.contains(receta.getAutor()));
    }
}
