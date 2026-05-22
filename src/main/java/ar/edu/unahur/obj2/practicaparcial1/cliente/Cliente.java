package ar.edu.unahur.obj2.practicaparcial1.cliente;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unahur.obj2.practicaparcial1.criterios.ComeTutti;
import ar.edu.unahur.obj2.practicaparcial1.criterios.ICriterio;
import ar.edu.unahur.obj2.practicaparcial1.recetas.IReceta;

public class Cliente {
    private final Integer dni;
    private final List<IReceta> recetasRecibidas = new ArrayList<>();
    private ICriterio criterio = new ComeTutti();
    
    public Cliente(Integer dni, ICriterio criterio) {
        this.dni = dni;
        this.criterio = criterio;
    }

    public Cliente(Integer dni) {
        this.dni = dni;
    }

    public Integer getDni() {
        return dni;
    }

    public List<IReceta> getRecetasRecibidas() {
        return recetasRecibidas;
    }

    public ICriterio getCriterio() {
        return criterio;
    }

    public void setCriterio(ICriterio criterio) {
        this.criterio = criterio;
    }

    public void recebirReceta(IReceta receta) {
        recetasRecibidas.add(receta);
    }

    public Integer valorTotalReceta(IReceta receta) {
        return receta.getValorNutricional();
    }

    public Boolean leGustaLaReceta(IReceta receta) {
        return Boolean.valueOf(criterio.leGusta(receta));
    }
}
