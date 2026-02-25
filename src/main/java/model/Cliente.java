package model;

/**
 * Clase que representa la entidad cliente.
 *
 * @author Alejandro Rodríguez Lugo - 251622
 */
public class Cliente {

    private String numeroServicio;
    private String nombre;
    private String tarifa;
    private int consumoKwh;
    private double totalPagar;
    private String periodo;
    private String fechaLimite;

    /**
     * Inicializa constructor vacio.
     */
    public Cliente() {
    }

    /**
     * Crea una instancia de Cliente con todos sus atributos detallados.
     *
     * @param numeroServicio Identificador único del contrato de servicio.
     * @param nombre Nombre completo del titular del servicio.
     * @param tarifa Tipo de tarifa aplicada (ej. Doméstica, Comercial).
     * @param consumoKwh Cantidad de energía consumida en kilovatios-hora.
     * @param totalPagar Monto económico total a liquidar.
     * @param periodo Intervalo de tiempo correspondiente a la facturación.
     * @param fechaLimite Fecha máxima para realizar el pago sin recargos.
     */
    public Cliente(String numeroServicio, String nombre, String tarifa, int consumoKwh, double totalPagar, String periodo, String fechaLimite) {
        this.numeroServicio = numeroServicio;
        this.nombre = nombre;
        this.tarifa = tarifa;
        this.consumoKwh = consumoKwh;
        this.totalPagar = totalPagar;
        this.periodo = periodo;
        this.fechaLimite = fechaLimite;
    }

    /**
     * Obtiene el número identificador del servicio.
     *
     * @return Una cadena con el número de servicio.
     */
    public String getNumeroServicio() {
        return numeroServicio;
    }

    /**
     * Obtiene el nombre del cliente.
     *
     * @return El nombre del titular.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Obtiene la tarifa aplicada al cliente.
     *
     * @return El tipo de tarifa.
     */
    public String getTarifa() {
        return tarifa;
    }

    /**
     * Obtiene el consumo registrado en Kwh.
     *
     * @return Valor entero del consumo.
     */
    public int getConsumoKwh() {
        return consumoKwh;
    }

    /**
     * Obtiene el total acumulado a pagar.
     *
     * @return Monto total en formato double.
     */
    public double getTotalPagar() {
        return totalPagar;
    }

    /**
     * Obtiene el periodo de facturación actual.
     *
     * @return Descripción del periodo (ej. "Enero 2024").
     */
    public String getPeriodo() {
        return periodo;
    }

    /**
     * Obtiene la fecha límite de pago.
     *
     * @return Fecha en formato String.
     */
    public String getFechaLimite() {
        return fechaLimite;
    }

    /**
     * Actualiza el monto total a pagar.
     *
     * @param totalPagar El nuevo monto calculado.
     */
    public void setTotalPagar(double totalPagar) {
        this.totalPagar = totalPagar;
    }

    /**
     * Establece el número de servicio.
     *
     * @param numeroServicio Nuevo identificador de servicio.
     */
    public void setNumeroServicio(String numeroServicio) {
        this.numeroServicio = numeroServicio;
    }

    /**
     * Establece el nombre del titular.
     *
     * @param nombre Nombre del cliente.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Establece la tarifa del servicio.
     *
     * @param tarifa Tipo de tarifa a asignar.
     */
    public void setTarifa(String tarifa) {
        this.tarifa = tarifa;
    }

    /**
     * Establece el consumo en Kwh.
     *
     * @param consumoKwh Cantidad de energía.
     */
    public void setConsumoKwh(int consumoKwh) {
        this.consumoKwh = consumoKwh;
    }

    /**
     * Establece el periodo de facturación.
     *
     * @param periodo Rango de fechas o nombre del mes.
     */
    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    /**
     * Establece la fecha de vencimiento del recibo.
     *
     * @param fechaLimite Fecha de corte.
     */
    public void setFechaLimite(String fechaLimite) {
        this.fechaLimite = fechaLimite;
    }

    /**
     * Devuelve una representación textual simplificada del cliente.
     *
     * @return Cadena que contiene el número de servicio y el nombre.
     */
    @Override
    public String toString() {
        return "Servicio: " + numeroServicio + ",  " + nombre;
    }
}
