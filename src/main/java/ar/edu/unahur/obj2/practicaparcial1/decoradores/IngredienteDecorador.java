package ar.edu.unahur.obj2.practicaparcial1.decoradores;

import ar.edu.unahur.obj2.practicaparcial1.recetas.IReceta;

public abstract class IngredienteDecorador implements IReceta{
    private final IReceta receta;

    public IngredienteDecorador(IReceta receta) {
        this.receta = receta;
    }

    @Override
    public Boolean esTradicional() {
        return receta.esTradicional();
    }

    @Override
    public Integer getAniosTradicion() {
        return receta.getAniosTradicion();
    }

    @Override
    public String getAutor() {
        return receta.getAutor();
    }

    @Override
    public String getNombre() {
        return receta.getNombre() + " con " + this.getNombreIngrediente();
    }

    protected abstract String getNombreIngrediente();

    @Override
    public Integer getValorNutricional() {
        return receta.getValorNutricional() + this.getValorAdicional();
    }

    protected abstract Integer getValorAdicional();

    
    


    
}
