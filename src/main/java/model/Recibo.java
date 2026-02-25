package model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Clase que representa la entidad del recibo.
 *
 * @author Alejandro Rodríguez Lugo - 251622
 */
public class Recibo {

    private final Cliente cliente;
    private final String tarjeta;
    private final String folio;
    private final String fechaPago;

    /**
     * Crea un nuevo recibo, genera un folio único basado en tiempo y registra
     * el momento exacto del pago.
     *
     * @param cliente Cliente al que se le realiza el pago.
     * @param tarjeta Tarjeta utilizada.
     */
    public Recibo(Cliente cliente, String tarjeta) {
        this.cliente = cliente;
        this.tarjeta = tarjeta;
        this.folio = generarFolio();
        this.fechaPago = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
    }

    /**
     * Genera un folio único basado en el timestamp actual convertido a
     * hexadecimal.
     *
     * * @return Un string con el folio único de transacción.
     */
    private String generarFolio() {
        return "TXN-" + Long.toHexString(System.currentTimeMillis()).toUpperCase();
    }

    /**
     * Obtiene el cliente asociado.
     *
     * @return Cliente.
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * Obtiene el número de tarjeta original.
     *
     * @return El número de tarjeta sin máscara.
     */
    public String getTarjeta() {
        return tarjeta;
    }

    /**
     * Obtiene el folio de la transacción.
     *
     * @return El folio generado al momento de la creación.
     */
    public String getFolio() {
        return folio;
    }

    /**
     * Obtiene la fecha y hora del pago formateada.
     *
     * @return Fecha en formato dd/MM/yyyy HH:mm:ss.
     */
    public String getFechaPago() {
        return fechaPago;
    }

    /**
     * Devuelve la tarjeta enmascarada: **** **** **** 1234
     *
     * @return
     */
    public String getTarjetaMascarada() {
        String raw = tarjeta.replaceAll("\\s", "");
        if (raw.length() < 4) {
            return tarjeta;
        }
        return "**** **** **** " + raw.substring(raw.length() - 4);
    }
}
