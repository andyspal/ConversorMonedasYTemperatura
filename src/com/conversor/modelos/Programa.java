package com.conversor.modelos;

import javax.swing.JOptionPane;

public class Programa {
	public  Programa() {
		String[] menuPrincipal = {"Temperatura", "Moneda"};
		
		String seleccionPrincipal = (String) JOptionPane.showInputDialog(null,"Seleccione una opcion de conversion", "Conversor", JOptionPane.PLAIN_MESSAGE, null, menuPrincipal, menuPrincipal[0]);
		
		switch (seleccionPrincipal) {
		case "Temperatura":
			String temperaturaString;
			double temperatura;
			temperaturaString = JOptionPane.showInputDialog(null, "Ingrese la temperatura a convertir: ");
			try {
				temperatura = Double.parseDouble(temperaturaString);
				String[] temperaturas = {"Celsius a Fahrenheit", "Celsius a Kelvin","Fahrenheit a Celsius", "Fahrenheit a Kelvin", "Kelvin a Celsius", "Kelvin a Fahrenheit"};
				String conversionTemperatura = (String) JOptionPane.showInputDialog(null, "Elige una opcion para convertir: ", "Temperatura", JOptionPane.QUESTION_MESSAGE, null, temperaturas, temperaturas[0]);
				ConvertirTemperatura convertirTemperatura = new ConvertirTemperatura();
				convertirTemperatura.convertir(conversionTemperatura, temperatura);
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
				String[] monedas = {"Pesos a Dólar","Pesos a Euro", "Pesos a Libras", "Pesos a Yen", "Pesos a Won surCoreano", "Dólar a Pesos","Euro a Pesos", "Libras a Pesos","Yen a Pesos","Won surCoreano a Pesos"};
				String conversionMoneda = (String) JOptionPane.showInputDialog(null, "Elige una opción para convertir","Monedas", JOptionPane.QUESTION_MESSAGE, null, monedas, monedas[0]);
				ConvertirMoneda convertirMoneda = new ConvertirMoneda();
				convertirMoneda.convertir(conversionMoneda, moneda);
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "El valor ingresado no es un número.");
			}
			break;
		default:
			throw new IllegalArgumentException("Valor inesperado: " + seleccionPrincipal);
		}
	}
}
