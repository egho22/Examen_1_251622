/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import repository.ClienteRepository;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import vista.SolicitarNumView;

/**
 * Clase encargada de observar los cambios en el campo de texto de búsqueda.
 *
 * @author Alejandro Rodríguez Lugo - 251622
 */
public class BusquedaObservador implements DocumentListener {

    private final ClienteRepository repo;
    private final SolicitarNumView vistaBusqueda;

    /**
     * Construye un nuevo observador de búsqueda.
     *
     * @param repo El repositorio que contiene la lógica de acceso a datos.
     * @param vistaBusqueda La instancia de la vista que contiene el campo de
     * texto.
     */
    public BusquedaObservador(ClienteRepository repo, SolicitarNumView vistaBusqueda) {
        this.repo = repo;
        this.vistaBusqueda = vistaBusqueda;
    }

    /**
     * Se activa cuando se inserta texto en el documento.
     *
     * @param e El evento de cambio en el documento.
     */
    @Override
    public void insertUpdate(DocumentEvent e) {
        ejecutarBusqueda();
    }

    /**
     * Se activa cuando se elimina texto del documento.
     *
     * @param e El evento de cambio en el documento.
     */
    @Override
    public void removeUpdate(DocumentEvent e) {
        ejecutarBusqueda();
    }

    /**
     * Se activa cuando hay cambios en los atributos del estilo del texto (poco
     * común en campos de texto plano).
     *
     * @param e El evento de cambio en el documento.
     */
    @Override
    public void changedUpdate(DocumentEvent e) {
        ejecutarBusqueda();
    }

    /**
     * Extrae el texto actual de la vista, consulta al repositorio los clientes
     * que coincidan con el número y actualiza la lista en la interfaz.
     */
    private void ejecutarBusqueda() {
        String criterio = vistaBusqueda.getTxtBusqueda().getText();
        var resultados = repo.buscarPorNumero(criterio);
        vistaBusqueda.actualizarLista(resultados);
    }
}
