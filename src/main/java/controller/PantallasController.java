/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import javax.swing.JPanel;

/**
 * Controlador centralizado para la gestión y navegación de pantallas.
 *
 * @author Alejandro Rodríguez Lugo - 251622
 */
public class PantallasController {

    private static PantallasController instance;

    /**
     * Constructor privado para evitar la instanciación externa.
     */
    private PantallasController() {
    }

    /**
     * Obtiene la instancia única.
     *
     * @return Instancia.
     */
    public static synchronized PantallasController getInstance() {
        if (instance == null) {
            instance = new PantallasController();
        }
        return instance;
    }

    /**
     * Reemplaza el contenido de un contenedor por un nuevo panel.
     *
     * @param contenedor El destino.
     * @param nuevoPanel Panel que se desea mostrar en el destino.
     */
    public void cambiarPanel(JPanel contenedor, JPanel nuevoPanel) {
        if (contenedor == null) {
            return;
        }
        contenedor.removeAll();
        contenedor.setLayout(new java.awt.BorderLayout());
        contenedor.add(nuevoPanel, java.awt.BorderLayout.CENTER);
        contenedor.revalidate();
        contenedor.repaint();
    }
}
