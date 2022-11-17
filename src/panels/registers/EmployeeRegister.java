package q1.panels.registers;

import java.util.Map;

import q1.ClienteFuncionario;

public class EmployeeRegister extends ClientRegister{
	String label = "CTPS";
	public ClienteFuncionario render() {
		
		ClienteFuncionario cf = new ClienteFuncionario();
		Map<String, Object> panel = mountPanel(label);

	    cf.setName(panel.get("name").toString());
	    cf.setCtps(panel.get("code").toString());

	    return cf;
	}
}
