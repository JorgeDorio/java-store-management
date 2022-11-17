package q1.panels.registers;

import javax.swing.Box;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import q1.ClientePessoaJuridica;
import q1.Item;

public class SalePJRegister {
	public int[] render(ClientePessoaJuridica[] arrPJ, Item[] arrItem) {
		JPanel panel = new JPanel();
		String[] customers = new String[arrPJ.length];
		for (int i = 0; i < arrPJ.length; i++) {
			if (arrPJ[i] != null) {
				customers[i] = arrPJ[i].getName();
			}
			;
		}
		JComboBox<String> dropdownCustomers = new JComboBox<String>(customers);
		panel.add(new JLabel("Cliente:"));
		panel.add(dropdownCustomers);
		panel.add(Box.createHorizontalStrut(15));

		String[] itens = new String[arrItem.length];
		for (int i = 0; i < arrItem.length; i++) {
			if (arrItem[i] != null) {
				itens[i] = arrItem[i].getName();
			}
			;
		}
		JComboBox<String> dropdownItens = new JComboBox<String>(itens);
		panel.add(new JLabel("Produto:"));
		panel.add(dropdownItens);
		panel.add(Box.createHorizontalStrut(15));

		JTextField amount = new JTextField(10);
		panel.add(new JLabel("Quantidade: "));
		panel.add(amount);

		JOptionPane.showMessageDialog(null, panel);

		int[] response = { dropdownCustomers.getSelectedIndex(), dropdownCustomers.getSelectedIndex(),
				Integer.parseInt(amount.getText()) };

		return response;
	}
}
