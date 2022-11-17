package q1.panels.registers;

import java.util.Map;

import javax.swing.Box;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import q1.ClientePessoaJuridica;

public class PJRegister extends ClientRegister{
	String label = "CNPJ";
	public ClientePessoaJuridica render() {
	    ClientePessoaJuridica pj = new ClientePessoaJuridica();
	    Map<String, Object> panel = mountPanel(label);
	    
	    pj.setName(panel.get("name").toString());
	    pj.setCnpj(panel.get("code").toString());

	    return pj;
	  }
}
