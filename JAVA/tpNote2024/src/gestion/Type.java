package gestion;

public enum Type {
	PLATE,
	MACHINE,
	HYBRIDE;
	
	
	public boolean isTD() {
		return this.equals(HYBRIDE) || this.equals(PLATE);
	}
	
	public boolean isTP() {
		return this.equals(MACHINE) || this.equals(HYBRIDE);
	}
}
