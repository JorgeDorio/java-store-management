package q1.panels.registers;

import javax.swing.Box;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import q1.Item;

public class ItemRegister {
	public Item render() {
		Item item = new Item();
		Boolean repeat = true;

		JTextField name = new JTextField(10);
		JTextField value = new JTextField(10);
		JTextField cod = new JTextField(10);

		do {
		JPanel panel = new JPanel();
		panel.add(new JLabel("Código:"));
		panel.add(cod);
		panel.add(new JLabel("Nome: "));
		panel.add(name);
		panel.add(Box.createHorizontalStrut(15));
		panel.add(new JLabel("Valor: "));
		panel.add(value);

		int input = JOptionPane.showConfirmDialog(null, panel, "Insira os dados solicitados:", JOptionPane.OK_CANCEL_OPTION);

		if (input == 2) {
			JOptionPane.showMessageDialog(null, "Ação cancelada.\nItem não cadastrado.");
			repeat = false;

		} else if (name.getText().length() < 3 || Float.parseFloat(value.getText()) <= 0 || cod.getText().length() == 0) {
			JOptionPane.showMessageDialog(null,
					"Os campos devem ser preenchidos corretamente.\n" + "Por favor, tente novamente.");
		} else {
			item.setName(name.getText());
			item.setValue(Float.parseFloat(value.getText()));
			item.setCod(cod.getText());
			repeat = false;
		}
		} while (repeat);
		return item;
	}
}
