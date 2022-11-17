package q1.panels;

import javax.swing.JOptionPane;

public class MainMenu {
	public int render() {
		Object[] buttons = { "Cadastrar Cliente", "Listar Clientes", "Cadastrar Item", "Cadastrar Compra",
				"Finalizar Programa" };

		int clicked = JOptionPane.showOptionDialog(null, "Selecione a ação que deseja executar", "Menu",
				JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, null, buttons, null);

		return clicked;
	}
}
