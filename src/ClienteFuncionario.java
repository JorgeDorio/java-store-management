package q1;

public class ClienteFuncionario extends Cliente {
	private String type = "Funcionário";
	private String ctps;
	
	public String getType() {
		return type;
	}

	public float returnOff(float value) {
		float off = 0;
		if (value > 200) {
			off = (float) (value * 0.85);
		} else {
			off = (float) (value * 0.9);
		}
		return off;
	}

	public String getCtps() {
		return ctps;
	}

	public void setCtps(String ctps) {
		this.ctps = ctps;
	}
}
