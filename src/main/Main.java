package main;

import impuestos.ParafiscalesLogica;
import static constantes.ParafiscalesStrings.*;

import javax.swing.*;

public class Main {

    public static void main(String [] args){

        ParafiscalesLogica parafiscalesLogica = new ParafiscalesLogica();

        String nombre = JOptionPane.showInputDialog(null,
                MENSAJE_SOLICITUD_NOMBRE.getMensaje());

        String salario = JOptionPane.showInputDialog(null,
                SOLICITUDSALARIO.getMensaje());

        parafiscalesLogica.setNombre(nombre);
        parafiscalesLogica.setSalario(Double.parseDouble(salario));
        JOptionPane.showMessageDialog(null,
                EMPLEADO.getMensaje()
                + parafiscalesLogica.getNombre() +"\n"
                + SALARIOBASE.getMensaje()+parafiscalesLogica.getSalario()
                +DESCEUNTOSCORRESPONDEN.getMensaje()+"\n"
                + PENSION.getMensaje()+parafiscalesLogica.calcularPension()
                +"\n"+DESCEUNTOSALUD.getMensaje()+parafiscalesLogica.calcularSalud()+"\n"
                +TOTALSALARIO.getMensaje()+ parafiscalesLogica.totalSalario());


    }
}
