package constantes;

public enum ParafiscalesStrings {

    MENSAJE_SOLICITUD_NOMBRE ("Ingresa El Nombre Del EmpleadO: "),
    SOLICITUDSALARIO("Ingresa el salario del empleado: "),
    EMPLEADO("El Empleado "),
    SALARIOBASE("Con salario Base De : $"),
    DESCEUNTOSCORRESPONDEN("Sus Descuentos Corresponden a:"),
    PENSION("Pension $"),
    DESCEUNTOSALUD("Descuento Salud $"),
    TOTALSALARIO(" su salario Final es de $");

    private String mensaje;

    ParafiscalesStrings(String s) {
        this.mensaje = s;
    }

    public String getMensaje() {

        return mensaje;
    }
}
