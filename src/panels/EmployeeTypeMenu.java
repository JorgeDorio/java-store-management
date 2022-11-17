package q1.panels;

import javax.swing.JOptionPane;

public class EmployeeTypeMenu {
	public int render() {
		Object[] buttons = { "Funcionário", "Pessoa Física", "Pessoa Jurídica" };

	    int clicked = JOptionPane.showOptionDialog(null, "Selecione o tipo de cliente que deseja adicionar", "",
	        JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, null, buttons, null);
	    return clicked;
	}
}
