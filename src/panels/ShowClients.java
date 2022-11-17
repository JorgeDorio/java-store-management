package q1.panels;

import javax.swing.JOptionPane;

import q1.ClienteFuncionario;
import q1.ClientePessoaFisica;
import q1.ClientePessoaJuridica;

public class ShowClients {
	public void render(ClienteFuncionario[] cf, ClientePessoaFisica[] pf, ClientePessoaJuridica[] pj, int[] counter) {
		String print = new String();

		for (int i = 0; i < counter[0]; i++) {
			print += "\nNome: " + cf[i].getName();
			print += "\nCTPS: " + cf[i].getCtps();
			print += "\nTipo: Funcionário\n";
		}

		for (int i = 0; i < counter[1]; i++) {
			print += "\nNome: " + pf[i].getName();
			print += "\nCPF: " + pf[i].getCpf();
			print += "\nTipo: Pessoa Física\n";
		}

		for (int i = 0; i < counter[2]; i++) {
			print += "\nNome: " + pj[i].getName();
			print += "\nCNPJ: " + pj[i].getCnpj();
			print += "\nTipo: Pessoa Jurídica\n";
		}

		JOptionPane.showMessageDialog(null, print);
	}
}
