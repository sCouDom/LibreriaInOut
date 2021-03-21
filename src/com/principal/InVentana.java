package com.principal;

import javax.swing.*;

public class InVentana implements InterfaceComun {
    @Override
    public void visualizar(String mensaje) {

    }

    @Override
    public void introducirDatos() {
        String entrada= JOptionPane.showInputDialog(null,"Por favor, introduzca los datos de entrada");

    }
}
