package ar.edu.unahur.obj2.practicaparcial1.nutricionista;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import ar.edu.unahur.obj2.practicaparcial1.cliente.Cliente;
import ar.edu.unahur.obj2.practicaparcial1.criterios.*;
import ar.edu.unahur.obj2.practicaparcial1.recetas.*;
import ar.edu.unahur.obj2.practicaparcial1.decoradores.*;

public class NutricionistaTest {
    
    @Test
    void visitarAUnClienteDebeCrearBatidoMagico() {
        Cliente cliente = new Cliente(1212121);
        Nutricionista nutricionista = Nutricionista.getInstance();
        
        nutricionista.visitarCliente(cliente);
        IReceta recetaCliente = cliente.getRecetasRecibidas().get(0);

        assertEquals("Batido magico", recetaCliente.getNombre());
    }

    @Test
    void unaRecetaDecoradaSePuedeEntregarAlCliente() {
        Cliente cliente = new Cliente(1212121);
        Nutricionista nutricionista = Nutricionista.getInstance();
        IReceta polentaConChia = new SemillasDeChia(
            new Receta("Polenta con semilla","yo mismo",1000,0)
        );
        nutricionista.agregarReceta(polentaConChia);
        cliente.setCriterio(RecetaTradicional.getInstance());
        nutricionista.visitarCliente(cliente);
        IReceta recetaCliente = cliente.getRecetasRecibidas().get(0);
        assertEquals(polentaConChia, recetaCliente.getNombre());
        assertEquals(1400, recetaCliente.getValorNutricional());
    }
}
