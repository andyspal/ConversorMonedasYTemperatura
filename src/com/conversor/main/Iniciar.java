package com.conversor.main;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Iniciar {
	public static void main(String[] args) {
		String[] menuPrincipal = {"Temperatura", "Moneda"};

		String seleccionPrincipal = (String) JOptionPane.showInputDialog(null,"Seleccione una opcion de conversion", "Conversor", JOptionPane.PLAIN_MESSAGE, null, menuPrincipal, menuPrincipal[0]);
		
		switch (seleccionPrincipal) {
		case "Temperatura":
			String temperaturaString;
			double temperatura;
			temperaturaString = JOptionPane.showInputDialog(null, "Ingrese la temperatura a convertir: ");
			try {
				temperatura = Double.parseDouble(temperaturaString);
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "El valor ingresado no es un número.");
			}
			break;
		case "Moneda":
			String monedaString;
			double moneda;
			monedaString = JOptionPane.showInputDialog(null, "Ingrese la cantidad de dinero que deseas convertir: ");
			try {
				moneda = Double.parseDouble(monedaString);
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "El valor ingresado no es un número.");
			}
			break;
		default:
			break;
		}
		
	}
}
