package sets;

import java.lang.reflect.Field;

import annotations.ToString;

public class Pays {
	
	@ToString(separator=" -> ", uppercase=true)
	private String nom;
	
	private int nbHabitants;
	
	@ToString(separator=" $")
	private int pibParHabitant;
	
	public Pays(String nom, int nbHabitants, int pibParHabitant) {
		this.nom = nom;
		this.nbHabitants = nbHabitants;
		this.pibParHabitant = pibParHabitant;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getNbHabitants() {
		return nbHabitants;
	}

	public void setNbHabitants(int nbHabitants) {
		this.nbHabitants = nbHabitants;
	}

	public int getPibParHabitant() {
		return pibParHabitant;
	}

	public void setPibParHabitant(int pibParHabitant) {
		this.pibParHabitant = pibParHabitant;
	}
	
	public String toString() {
		Class<?> classe = this.getClass();
		Field[] fields = classe.getDeclaredFields();
		String retour = "";
		for(Field unField : fields) {
			if(unField.isAnnotationPresent(ToString.class)) {
				try {
					if(unField.getAnnotation(ToString.class).uppercase()) {
						retour += unField.get(this).toString().toUpperCase();
					} else {
						retour += unField.get(this);
					}
					retour += unField.getAnnotation(ToString.class).separator();
				} catch (IllegalArgumentException e) {
					e.printStackTrace();
				} catch (IllegalAccessException e) {
					e.printStackTrace();
				}
			}
		}
		return retour;
	}
	
	public long getPibTotal() {
		return (long) this.nbHabitants * this.pibParHabitant;
	}
	
}
