package controller;

import model.Cliente;
import repository.ClienteRepository;
import model.BusquedaObservador;
import vista.DetalleConsumeView;
import vista.PagarLuzView;
import vista.SolicitarNumView;

/**
 * Controlador encargado de gestionar el flujo de pago del servicio de luz.
 *
 * @author Alejandro Rodríguez Lugo - 251622
 */
public class PagoLuzController {

    private final PagarLuzView vista;
    private final ClienteRepository repo;

    /**
     * Constructor que inicializa el controlador con sus dependencias.
     *
     * @param vista Instancia de la interfaz de usuario para el pago de luz.
     * @param repo Repositorio de acceso a datos de los clientes.
     */
    public PagoLuzController(PagarLuzView vista, ClienteRepository repo) {
        this.vista = vista;
        this.repo = repo;
        inicializar();
    }

    /**
     * Configura los escuchadores de la vista. Establece un observador para la
     * búsqueda dinámica en el campo de texto y gestiona el evento de selección
     * en la lista de resultados para navegar hacia la vista de detalle.
     */
    private void inicializar() {
        SolicitarNumView panelBusqueda = vista.getSolicitarNumView();
        BusquedaObservador observador = new BusquedaObservador(repo, panelBusqueda);
        panelBusqueda.getTxtBusqueda().getDocument().addDocumentListener(observador);
        vista.getSolicitarNumView().getListaClientes().addListSelectionListener(e -> {
            if (!e.getValueIsAdjusting()) {
                Cliente seleccionado = vista.getSolicitarNumView().getListaClientes().getSelectedValue();
                if (seleccionado != null) {
                    irADetalle(seleccionado);
                }
            }
        });
    }

    /**
     * Realiza la transición de la interfaz hacia el panel de detalle de
     * consumo.
     *
     * @param cliente Cliente cuyos datos se muestran.
     */
    private void irADetalle(Cliente cliente) {
        DetalleConsumeView vistaDetalle = new DetalleConsumeView(cliente);
        javax.swing.JPanel contenedorInterno = vista.getSolicitarNumView().getPanelDetalle();
        PantallasController.getInstance().cambiarPanel(contenedorInterno, vistaDetalle);
    }
}
