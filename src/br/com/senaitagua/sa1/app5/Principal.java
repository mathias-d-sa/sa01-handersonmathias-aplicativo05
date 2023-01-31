package br.com.senaitagua.sa1.app5;

import javax.swing.JOptionPane;

import br.com.senaitagua.sa1.bo.MediaTriBO;

public class Principal {

	public static void main(String[] args) {

		MediaTriBO cbo = new MediaTriBO();
		
		String resp1 = JOptionPane.showInputDialog("Informe o faturamento do 1º mês: ");
		String resp2 = JOptionPane.showInputDialog("Informe o faturamento do 2º mês: ");
		double valor3 = Double.parseDouble(JOptionPane.showInputDialog("Informe o faturamento do 3º mês: "));
		
		double valor1 = Double.parseDouble(resp1);
		double valor2 = Double.parseDouble(resp2);
		//double valor3 = Double.parseDouble(resp3);
		
		JOptionPane.showMessageDialog(null, "A média trimestral é igual a: " + "R$" + cbo.mediaTrimestral(valor1, valor2, valor3));
		
	}

}
