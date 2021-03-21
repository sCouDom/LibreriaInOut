package com.principal;

public class Impresora  implements InterfaceComun {
    @Override
    public void visualizar(String mensaje) {
        System.out.println(mensaje);
    }

    @Override
    public void introducirDatos() {

    }
}
