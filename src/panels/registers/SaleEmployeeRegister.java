package q1.panels.registers;

import javax.swing.Box;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import q1.ClienteFuncionario;
import q1.Item;

public class SaleEmployeeRegister {
	public int[] render(ClienteFuncionario[] arrF, Item[] arrItem) {
		JPanel panel = new JPanel();
		String[] customers = new String[arrF.length];
		for (int i = 0; i < arrF.length; i++) {
			if (arrF[i] != null) {
				customers[i] = arrF[i].getName();
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
