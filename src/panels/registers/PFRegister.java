package q1.panels.registers;

import java.util.Map;

import javax.swing.Box;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import q1.ClientePessoaFisica;

public class PFRegister extends ClientRegister {
	String label = "CPF";
	public ClientePessoaFisica render() {
		ClientePessoaFisica pf = new ClientePessoaFisica();
		Map<String, Object> panel = mountPanel(label);

		pf.setName(panel.get("name").toString());
		pf.setCpf(panel.get("code").toString());

		return pf;
	}
}
