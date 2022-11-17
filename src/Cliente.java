package q1;

public abstract class Cliente {

	private String name;

	public abstract float returnOff(float value);

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
