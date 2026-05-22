package ar.edu.unahur.obj2.practicaparcial1.nutricionista;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unahur.obj2.practicaparcial1.cliente.Cliente;
import ar.edu.unahur.obj2.practicaparcial1.recetas.IReceta;
import ar.edu.unahur.obj2.practicaparcial1.recetas.Receta;

public class Nutricionista {
    private static Nutricionista instance = new Nutricionista();
    private static final List<IReceta> recetas = new ArrayList<>();
    private static String nombreAutor = "Lic. Escofier";
    
    private Nutricionista() {}

    public static String getNombreAutor() {
        return nombreAutor;
    }

    public static void setNombreAutor(String nombreAutor) {
        Nutricionista.nombreAutor = nombreAutor;
    }

    public void agregarReceta(IReceta receta) {
        recetas.add(receta);
    }

    public static Nutricionista getInstance() {
        return instance;
    }

    public void visitarCliente(Cliente cliente) {
        IReceta recetaAEntregar = recetas.stream()
        .filter(r -> cliente.leGustaLaReceta(r))
        .findFirst()
        .orElse(new Receta("Batido magico", 
        nombreAutor, 
        2000, 
        0));
        cliente.recebirReceta(recetaAEntregar);
    }

}
