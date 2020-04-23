package model;

public class Ally{

	private int totalLife;
	private int armour;
	private String name;
	private String race;
	
	

	public Ally() {
		super();
	
	}

	public Ally(int totalLife, int armour, String name, String race) {
		super();
		this.totalLife = totalLife;
		this.armour = armour;
		this.name = name;
		this.race = race;
	}

	public int getTotalLife() {
		return totalLife;
	}

	public void setTotalLife(int totalLife) {
		this.totalLife = totalLife;
	}

	public int getArmour() {
		return armour;
	}

	public void setArmour(int armour) {
		this.armour = armour;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRace() {
		return race;
	}

	public void setRace(String race) {
		this.race = race;
	}

	@Override
	public String toString() {
		return "Ally [totalLife=" + totalLife + ", armour=" + armour + ", name=" + name + ", race=" + race + "]";
	}

	

}
