package ar.edu.unahur.obj2.practicaparcial1.recetas;

public interface IReceta {
    String getNombre();
    Integer getValorNutricional();
    String getAutor();
    Integer getAniosTradicion();
    Boolean esTradicional();
    String getNombreIngrediente();
    Integer getValorAdicional();
}