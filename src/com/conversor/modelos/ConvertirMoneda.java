package com.conversor.modelos;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class ConvertirMoneda {
	
	private DecimalFormat df = new DecimalFormat("#.00");
	
	public void convertir(String conversorMoneda, double moneda) {
		moneda = Double.parseDouble(df.format(moneda));
		switch (conversorMoneda) {
		// 1USD = 37.71UYU
		case "Pesos a Dólar": {
			JOptionPane.showMessageDialog(null,"Tienes $" + df.format(moneda / 37.71) + " dólares");
			break;
		}
		// 1EUR = 40.89UYU
		case "Pesos a Euro": {
			JOptionPane.showMessageDialog(null,"Tienes $" + df.format(moneda / 40.89) + " euros");
			break;
		}
		// 1GBP = 47.64UYU
		case "Pesos a Libras": {
			JOptionPane.showMessageDialog(null,"Tienes $" + df.format(moneda / 47.64) + " libras");
			break;
		}
		// 1JPY = 0.26UYU
		case "Pesos a Yen": {
			JOptionPane.showMessageDialog(null,"Tienes $" + df.format(moneda / 0.26) + " yenes");
			break;
		}
		//1KRW = 0.03UYU
		case "Pesos a Won Surcoreano": {
			JOptionPane.showMessageDialog(null,"Tienes $" + df.format(moneda / 0.03) + " wones");
			break;
		}
		case "Dólar a Pesos": {
			JOptionPane.showMessageDialog(null,"Tienes $" + df.format(moneda * 37.71) + " pesos");
			break;
		}
		case "Euro a Pesos": {
			JOptionPane.showMessageDialog(null,"Tienes $" +df.format(moneda / 40.89) + " pesos");
			break;
		}
		case "Libras a Pesos": {
			JOptionPane.showMessageDialog(null,"Tienes $" + df.format(moneda * 47.64) + " pesos");
			break;
		}
		case "Yen a Pesos": {
			JOptionPane.showMessageDialog(null,"Tienes $" + df.format(moneda * 0.26) + " pesos");
			break;
		}
		case "Won Coreano a Pesos": {
			JOptionPane.showMessageDialog(null,"Tienes $" + df.format(moneda * 0.03) + " pesos");
			break;
		}
		default:
			throw new IllegalArgumentException("Valor inesperado: " + conversorMoneda);
		}
	}
}
