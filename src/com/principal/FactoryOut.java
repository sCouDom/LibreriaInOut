package com.principal;

public class FactoryOut {

    public static InterfaceComun getProductoSalida(int tipo){
        switch (tipo){
            case 1:
                return new Consola();
            case 2:
                return new Ventana();
            case 3:
                return new Impresora();

            default:
                return null;
        }
    }
}
