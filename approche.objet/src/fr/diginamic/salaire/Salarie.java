package fr.diginamic.salaire;

public class Salarie extends Intervenant {
	
	private Double salaireMensuel;

	public Salarie(String nom, String prenom, Double salaireMensuel) {
		super(nom, prenom);
		this.salaireMensuel = salaireMensuel;
	}

	@Override
	public Double getSalaire() {
		return this.salaireMensuel;
	}

}
