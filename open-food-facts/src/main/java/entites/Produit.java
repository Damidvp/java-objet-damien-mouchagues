package entites;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public class Produit {
	
	private static final AtomicInteger ID_FACTORY = new AtomicInteger();
	private int id;
	private Categorie categorie;
	private Marque marque;
	private Character grade;
	private Double energie100g;
	private Double graisse100g;
	private Double sucres100g;
	private Double fibres100g;
	private Double proteines100g;
	private ArrayList<Ingredient> listeIngredients;
	private ArrayList<Additif> listeAdditifs;
	private ArrayList<Allergene> listeAllergenes;
	
	public Produit(Categorie categorie, Marque marque, Character grade, Double energie100g, Double graisse100g,
			Double sucres100g, Double fibres100g, Double proteines100g, ArrayList<Ingredient> listeIngredients,
			ArrayList<Additif> listeAdditifs, ArrayList<Allergene> listeAllergenes) {
		this.setId(ID_FACTORY.incrementAndGet());
		this.categorie = categorie;
		this.marque = marque;
		this.grade = grade;
		this.energie100g = energie100g;
		this.graisse100g = graisse100g;
		this.sucres100g = sucres100g;
		this.fibres100g = fibres100g;
		this.proteines100g = proteines100g;
		this.listeIngredients = listeIngredients;
		this.listeAdditifs = listeAdditifs;
		this.listeAllergenes = listeAllergenes;
	}

	public Categorie getCategorie() {
		return categorie;
	}

	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}

	public Marque getMarque() {
		return marque;
	}

	public void setMarque(Marque marque) {
		this.marque = marque;
	}

	public Character getGrade() {
		return grade;
	}

	public void setGrade(Character grade) {
		this.grade = grade;
	}

	public Double getEnergie100g() {
		return energie100g;
	}

	public void setEnergie100g(Double energie100g) {
		this.energie100g = energie100g;
	}

	public Double getGraisse100g() {
		return graisse100g;
	}

	public void setGraisse100g(Double graisse100g) {
		this.graisse100g = graisse100g;
	}

	public Double getSucres100g() {
		return sucres100g;
	}

	public void setSucres100g(Double sucres100g) {
		this.sucres100g = sucres100g;
	}

	public Double getFibres100g() {
		return fibres100g;
	}

	public void setFibres100g(Double fibres100g) {
		this.fibres100g = fibres100g;
	}

	public Double getProteines100g() {
		return proteines100g;
	}

	public void setProteines100g(Double proteines100g) {
		this.proteines100g = proteines100g;
	}

	public ArrayList<Ingredient> getListeIngredients() {
		return listeIngredients;
	}

	public void setListeIngredients(ArrayList<Ingredient> listeIngredients) {
		this.listeIngredients = listeIngredients;
	}

	public ArrayList<Additif> getListeAdditifs() {
		return listeAdditifs;
	}

	public void setListeAdditifs(ArrayList<Additif> listeAdditifs) {
		this.listeAdditifs = listeAdditifs;
	}

	public ArrayList<Allergene> getListeAllergenes() {
		return listeAllergenes;
	}

	public void setListeAllergenes(ArrayList<Allergene> listeAllergenes) {
		this.listeAllergenes = listeAllergenes;
	}

	@Override
	public String toString() {
		return "Produit [id=" + id + ", categorie=" + categorie.toString() + ", marque=" + marque.toString() + ", grade=" + grade + ", energie100g="
				+ energie100g + ", graisse100g=" + graisse100g + ", sucres100g=" + sucres100g + ", fibres100g="
				+ fibres100g + ", proteines100g=" + proteines100g + ", listeIngredients=" + listeIngredients.toString()
				+ ", listeAdditifs=" + listeAdditifs.toString() + ", listeAllergenes=" + listeAllergenes.toString() + "]";
	}

	/** Getter
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/** Setter
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	
	public void resetId() {
		ID_FACTORY.set(0);
	}
	
	
}
