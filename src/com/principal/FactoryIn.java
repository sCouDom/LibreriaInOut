package com.principal;

public class FactoryIn {


    public static InterfaceComun getProductoEntrada(int tipo) {
        switch (tipo) {
            case 1:
                return new InConsola();
            case 2:
                return new InVentana();

            default:
                return null;
        }
    }
}