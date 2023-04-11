package geometrie;

public class TestObjetGeometrique {

	public static void main(String[] args) {
		
		ObjetGeometrique[] tabGeometries = new ObjetGeometrique[2];
		tabGeometries[0] = new Cercle(3);
		tabGeometries[1] = new Rectangle(6, 10);
		for(ObjetGeometrique uneGeometrie : tabGeometries) {
			System.out.println(uneGeometrie.toString());
		}
	}

}
