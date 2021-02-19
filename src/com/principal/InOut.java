package com.principal;

import javax.swing.*;

public class InOut {
    public static void escribirConsola(String msg){
        System.out.println(msg);
    }
    public static void escribirVentana(String msg){
        JOptionPane.showMessageDialog(null, msg);
    }
}
