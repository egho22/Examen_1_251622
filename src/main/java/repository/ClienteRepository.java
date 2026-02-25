package repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import model.Cliente;

/**
 * Clase que simula una persistencia de datos.
 *
 * @author Alejandro Rodríguez Lugo - 251622
 */
public class ClienteRepository {

    private final List<Cliente> clientes = new ArrayList<>();

    /**
     * Añade clientes en la memoria para trabajar.
     */
    public ClienteRepository() {
        clientes.add(new Cliente("1001234", "Alejandro Rodríguez Lugo", "DAC", 480, 1240.00, "Ene–Feb 2026", "28/02/2026"));
        clientes.add(new Cliente("1005678", "Juan Pérez López", "1A", 210, 358.50, "Ene–Feb 2026", "01/03/2026"));
        clientes.add(new Cliente("1009012", "Ana Martínez Vega", "1", 155, 198.00, "Ene–Feb 2026", "22/02/2026"));
        clientes.add(new Cliente("2001111", "Carlos Ramírez Torres", "1B", 320, 620.80, "Ene–Feb 2026", "03/03/2026"));
        clientes.add(new Cliente("2005555", "Laura Sánchez Díaz", "1C", 415, 890.30, "Ene–Feb 2026", "02/03/2026"));
        clientes.add(new Cliente("3051111", "Roberto Flores Mejía", "1D", 530, 1100.00, "Ene–Feb 2026", "28/02/2026"));
        clientes.add(new Cliente("3102468", "Sofía Herrera Campos", "1E", 620, 1380.50, "Ene–Feb 2026", "01/03/2026"));
        clientes.add(new Cliente("4008899", "Diego Morales Cruz", "2", 900, 2400.00, "Ene–Feb 2026", "05/03/2026"));
    }

    /**
     * Devuelve clientes cuyo número de servicio contiene el criterio.
     *
     * @param criterio
     * @return
     */
    public List<Cliente> buscarPorNumero(String criterio) {
        if (criterio == null || criterio.isBlank()) {
            return new ArrayList<>();
        }
        return clientes.stream()
                .filter(c -> c.getNumeroServicio().contains(criterio.trim()))
                .collect(Collectors.toList());
    }
}
