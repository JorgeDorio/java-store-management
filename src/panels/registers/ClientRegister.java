package q1.panels.registers;

import java.util.HashMap;
import java.util.Map;

import javax.swing.Box;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public abstract class ClientRegister {
	public Map<String, Object> mountPanel(String label) {
		JTextField name = new JTextField(10);
		JTextField code = new JTextField(10);
		Map<String, Object> map = new HashMap<>();

		Boolean repeat = true;

		do {
			JPanel panel = new JPanel();
			panel.add(new JLabel("Nome:"));
			panel.add(name);
			panel.add(Box.createHorizontalStrut(15));
			panel.add(new JLabel(label + ":"));
			panel.add(code);

			int input = JOptionPane.showConfirmDialog(null, panel, "Insira os dados solicitados:",
					JOptionPane.OK_CANCEL_OPTION);
			map.put("name", name.getText());
			map.put("code", code.getText());
			if (input == 2) {
				JOptionPane.showMessageDialog(null, "Ação cancelada.\nCliente não cadastrado.");
				repeat = false;

			} else if (name.getText().length() < 3 || code.getText().length() < 3) {
				JOptionPane.showMessageDialog(null,
						"Os campos devem ser preenchidos corretamente.\n" + "Por favor, tente novamente.");
			} else {
				repeat = false;
			}
		} while (repeat);

		return map;
	}

}
