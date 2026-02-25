/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package main;

import controller.PagoLuzController;
import repository.ClienteRepository;
import vista.PagarLuzView;

/**
 * Clase main.
 *
 * @author Alejandro Rodríguez Lugo - 251622
 */
public class EvaluacionPagarLuz {

    /**
     * Método main.
     *
     * @param args
     */
    public static void main(String[] args) {
        PagarLuzView vista = new PagarLuzView();
        ClienteRepository repo = new ClienteRepository();
        new PagoLuzController(vista, repo);
        vista.setVisible(true);
    }
}
