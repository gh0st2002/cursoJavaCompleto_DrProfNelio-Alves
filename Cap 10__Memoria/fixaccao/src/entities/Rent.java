package entities;

public class Rent {
	private String name;
	private String emai;
	
	public Rent() {
		
	}

	public Rent(String name, String emai) {
		this.name = name;
		this.emai = emai;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmai() {
		return emai;
	}

	public void setEmai(String emai) {
		this.emai = emai;
	}

	@Override
	public String toString() {
		return name + ", " + emai ;
	}
	
	
}
