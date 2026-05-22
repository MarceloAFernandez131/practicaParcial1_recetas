package ar.edu.unahur.obj2.practicaparcial1.recetas;

public class Receta implements IReceta{
    private String nombre;
    private String autor;
    private Integer valorNutricionalBase;
    private Integer aniosTradicion;

    public Receta(String nombre, String autor, Integer valorNutricionalBase, Integer aniosTradicion) {
        this.nombre = nombre;
        this.autor = autor;
        this.valorNutricionalBase = valorNutricionalBase;
        this.aniosTradicion = aniosTradicion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setValorNutricionalBase(Integer valorNutricionalBase) {
        this.valorNutricionalBase = valorNutricionalBase;
    }

    public void setAniosTradicion(Integer aniosTradicion) {
        this.aniosTradicion = aniosTradicion;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public Integer getValorNutricional() {
        return valorNutricionalBase;
    }

    @Override
    public String getAutor() {
        return autor;
    }

    @Override
    public Integer getAniosTradicion() {
        return aniosTradicion;
    }

    @Override
    public Boolean esTradicional() {
        return Boolean.valueOf(aniosTradicion >= 20);
    }
}
