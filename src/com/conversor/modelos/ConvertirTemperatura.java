package com.conversor.modelos;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class ConvertirTemperatura {	
	
	private DecimalFormat df = new DecimalFormat("0.00");
	
	public void convertir(String conversorTemperatura, double temperatura) {
		temperatura = Double.parseDouble(df.format(temperatura));
		switch (conversorTemperatura) {
		case "Celsius a Fahrenheit": {
			JOptionPane.showMessageDialog(null, temperatura + " grados celsius son " + df.format(1.8 * temperatura + 32) +" grados Fahrenheit");
			break;
		}
		case "Celsius a Kelvin": {
			JOptionPane.showMessageDialog(null, temperatura + " grados celsius son " + df.format(temperatura + 273) +" grados Kelvin");
			break;
		}
		case "Fahrenheit a Celsius": {
			JOptionPane.showMessageDialog(null, temperatura + " grados Fahrenheit son " + df.format((temperatura - 32) / 1.8) +" grados Celsius");
			break;
		}
		case "Fahrenheit a Kelvin": {
			JOptionPane.showMessageDialog(null, temperatura + " grados Fahrenheit son " + df.format((temperatura - 32) * (5.0 / 9) + 273.15) +" grados Kelvin");
			break;
		}
		case "Kelvin a Celsius":{
			JOptionPane.showMessageDialog(null, df.format(temperatura) + " grados Kelvin son " + df.format(temperatura - 273) +" grados Celsius");
			break;
		}
		case "Kelvin a Fahrenheit":{
			JOptionPane.showMessageDialog(null, df.format(temperatura) + " grados Kelvin son " + df.format(temperatura * (9/5.0) - 459.67) +" grados Fahrenheit");
			break;
		}
		default:
			throw new IllegalArgumentException("Valor inesperado: " + conversorTemperatura);
		}
	}
}

