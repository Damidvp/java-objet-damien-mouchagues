package fr.diginamic.automates;

import fr.diginamic.automates.entites.Cellule;
import fr.diginamic.automates.entites.Grid;

public class JeuDeLaVie {

	public static void main(String[] args) {
		
		int gridWidth = 17;
		int gridHeight = 17;
		Cellule[][] cellulesInitiales = new Cellule[gridHeight][gridWidth];
		
		//genererRandom(gridWidth, gridHeight, cellulesInitiales);
		//genererClignoteur(gridWidth, gridHeight, cellulesInitiales);
		genererSpaceship(gridWidth, gridHeight, cellulesInitiales);
		//genererPulsar(gridWidth, gridHeight, cellulesInitiales);
		Grid gridInitial = new Grid(gridWidth, gridHeight, cellulesInitiales);
		Grid nouveauGrid = new Grid();
		
		System.out.println("*** JEU DE LA VIE ***");
		System.out.println();
		afficherGeneration(gridInitial);
		
		while(true) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			nouveauGrid = new Grid(gridWidth, gridHeight, evolutionGeneration(gridInitial).getCellules());
			afficherGeneration(nouveauGrid);
			gridInitial = nouveauGrid;
		}
	}
	
	public static void afficherGeneration(Grid ensembleCellules) {
		for(int i=0; i<ensembleCellules.getHeight(); i++) {
			String line = "|";
			for(int j=0; j<ensembleCellules.getWidth(); j++) {
				if(ensembleCellules.getCellules()[i][j].isDead()) {
					line += " ";
				} else {
					line += "■";
				}
				line += "|";
			}
			System.out.println(line);
		}
		System.out.println();
	}
	
	//Cette méthode permettra de modifier le Grid pour la génération suivante
	public static Grid evolutionGeneration(Grid ensembleCellules) {
		Cellule[][] cellules = new Cellule[ensembleCellules.getHeight()][ensembleCellules.getWidth()];
		Grid newCellules = new Grid(ensembleCellules.getHeight(), ensembleCellules.getWidth(), cellules);
		for(int i=0; i<ensembleCellules.getHeight(); i++) {
			for(int j=0; j<ensembleCellules.getWidth(); j++) {
				
				int nbCellulesAdjacentes = getNbCellulesAdjacentes(ensembleCellules, j, i);
				switch(nbCellulesAdjacentes) {
				case 0, 1:
					if(!ensembleCellules.getCellules()[i][j].isDead()) {
						cellules[i][j] = new Cellule(i, j, true);
					} else {
						cellules[i][j] = ensembleCellules.getCellules()[i][j];
					}
					break;
				case 2:
					if(!ensembleCellules.getCellules()[i][j].isDead()) {
						cellules[i][j] = new Cellule(i, j, false);
					} else {
						cellules[i][j] = ensembleCellules.getCellules()[i][j];
					}
					break;
				case 3:
					if(ensembleCellules.getCellules()[i][j].isDead()) {
						cellules[i][j] = new Cellule(i, j, false);
					} else {
						cellules[i][j] = ensembleCellules.getCellules()[i][j];
					}
					break;
				case 4, 5, 6, 7, 8:
					if(!ensembleCellules.getCellules()[i][j].isDead()) {
						cellules[i][j] = new Cellule(i, j, true);
					} else {
						cellules[i][j] = ensembleCellules.getCellules()[i][j];
					}
					break;
				}
				newCellules.setCellules(cellules);
			}
		}
		return newCellules;
	}
	
	public static void afficherMenu() {
		System.out.println("1. Générer et afficher la prochaine génération");
		System.out.println("99. Quitter");
	}
	
	public static int getNbCellulesAdjacentes(Grid ensembleCellules, int positionX, int positionY) {
		int nbCellulesAdjacentes = 0;
		
		//Autres lignes
		if(positionY>0 && positionY<ensembleCellules.getHeight()-1) {
			if(positionX>0 && positionX<ensembleCellules.getWidth()-1) {
					if(!ensembleCellules.getCellules()[positionY-1][positionX-1].isDead()) {
						nbCellulesAdjacentes++;
					}
					if(!ensembleCellules.getCellules()[positionY][positionX-1].isDead()) {
						nbCellulesAdjacentes++;
					}
					if(!ensembleCellules.getCellules()[positionY+1][positionX-1].isDead()) {
						nbCellulesAdjacentes++;
					}
					if(!ensembleCellules.getCellules()[positionY+1][positionX].isDead()) {
						nbCellulesAdjacentes++;
					}
					if(!ensembleCellules.getCellules()[positionY+1][positionX+1].isDead()) {
						nbCellulesAdjacentes++;
					}
					if(!ensembleCellules.getCellules()[positionY][positionX+1].isDead()) {
						nbCellulesAdjacentes++;
					}
					if(!ensembleCellules.getCellules()[positionY-1][positionX+1].isDead()) {
						nbCellulesAdjacentes++;
					}
					if(!ensembleCellules.getCellules()[positionY-1][positionX].isDead()) {
						nbCellulesAdjacentes++;
					}
			} else if(positionX==0) {
				if(!ensembleCellules.getCellules()[positionY-1][positionX].isDead()) {
					nbCellulesAdjacentes++;
				}
				if(!ensembleCellules.getCellules()[positionY-1][positionX+1].isDead()) {
					nbCellulesAdjacentes++;
				}
				if(!ensembleCellules.getCellules()[positionY][positionX+1].isDead()) {
					nbCellulesAdjacentes++;
				}
				if(!ensembleCellules.getCellules()[positionY+1][positionX+1].isDead()) {
					nbCellulesAdjacentes++;
				}
				if(!ensembleCellules.getCellules()[positionY+1][positionX].isDead()) {
					nbCellulesAdjacentes++;
				}
			} else {
				if(!ensembleCellules.getCellules()[positionY-1][positionX].isDead()) {
					nbCellulesAdjacentes++;
				}
				if(!ensembleCellules.getCellules()[positionY-1][positionX-1].isDead()) {
					nbCellulesAdjacentes++;
				}
				if(!ensembleCellules.getCellules()[positionY][positionX-1].isDead()) {
					nbCellulesAdjacentes++;
				}
				if(!ensembleCellules.getCellules()[positionY+1][positionX-1].isDead()) {
					nbCellulesAdjacentes++;
				}
				if(!ensembleCellules.getCellules()[positionY+1][positionX].isDead()) {
					nbCellulesAdjacentes++;
				}
			}
		//Première ligne
		} else if(positionY==0) {
			if(positionX>0 && positionX<ensembleCellules.getWidth()-1) {
				if(!ensembleCellules.getCellules()[positionY][positionX-1].isDead()) {
					nbCellulesAdjacentes++;
				}
				if(!ensembleCellules.getCellules()[positionY+1][positionX-1].isDead()) {
					nbCellulesAdjacentes++;
				}
				if(!ensembleCellules.getCellules()[positionY+1][positionX].isDead()) {
					nbCellulesAdjacentes++;
				}
				if(!ensembleCellules.getCellules()[positionY+1][positionX+1].isDead()) {
					nbCellulesAdjacentes++;
				}
				if(!ensembleCellules.getCellules()[positionY][positionX+1].isDead()) {
					nbCellulesAdjacentes++;
				}
			} else if(positionX==0) {
				if(!ensembleCellules.getCellules()[positionY][positionX+1].isDead()) {
					nbCellulesAdjacentes++;
				}
				if(!ensembleCellules.getCellules()[positionY+1][positionX+1].isDead()) {
					nbCellulesAdjacentes++;
				}
				if(!ensembleCellules.getCellules()[positionY+1][positionX].isDead()) {
					nbCellulesAdjacentes++;
				}
			} else {
				if(!ensembleCellules.getCellules()[positionY+1][positionX].isDead()) {
					nbCellulesAdjacentes++;
				}
				if(!ensembleCellules.getCellules()[positionY+1][positionX-1].isDead()) {
					nbCellulesAdjacentes++;
				}
				if(!ensembleCellules.getCellules()[positionY][positionX-1].isDead()) {
					nbCellulesAdjacentes++;
				}
			}
		//Dernière ligne
		} else {
			if(positionX>0 && positionX<ensembleCellules.getWidth()-1) {
				if(!ensembleCellules.getCellules()[positionY][positionX-1].isDead()) {
					nbCellulesAdjacentes++;
				}
				if(!ensembleCellules.getCellules()[positionY-1][positionX-1].isDead()) {
					nbCellulesAdjacentes++;
				}
				if(!ensembleCellules.getCellules()[positionY-1][positionX].isDead()) {
					nbCellulesAdjacentes++;
				}
				if(!ensembleCellules.getCellules()[positionY-1][positionX+1].isDead()) {
					nbCellulesAdjacentes++;
				}
				if(!ensembleCellules.getCellules()[positionY][positionX+1].isDead()) {
					nbCellulesAdjacentes++;
				}
			} else if(positionX==0) {
				if(!ensembleCellules.getCellules()[positionY-1][positionX].isDead()) {
					nbCellulesAdjacentes++;
				}
				if(!ensembleCellules.getCellules()[positionY-1][positionX+1].isDead()) {
					nbCellulesAdjacentes++;
				}
				if(!ensembleCellules.getCellules()[positionY][positionX+1].isDead()) {
					nbCellulesAdjacentes++;
				}
			} else {
				if(!ensembleCellules.getCellules()[positionY-1][positionX].isDead()) {
					nbCellulesAdjacentes++;
				}
				if(!ensembleCellules.getCellules()[positionY-1][positionX-1].isDead()) {
					nbCellulesAdjacentes++;
				}
				if(!ensembleCellules.getCellules()[positionY][positionX-1].isDead()) {
					nbCellulesAdjacentes++;
				}
			}
		}
		
		return nbCellulesAdjacentes;
	}
	
	public static void genererRandom(int width, int height, Cellule[][] init) {
		for(int i=0; i<height; i++) {
			for(int j=0; j<width; j++) {
				boolean isDead = true;

				int tauxCellules = 6;
				int etatRandom = (int) (Math.random() * 10) + 1;
				if(etatRandom <= tauxCellules) {
					isDead = false;
				}

				init[i][j] = new Cellule(i, j, isDead);
			}
		}
	}
	
	public static void genererClignoteur(int width, int height, Cellule[][] init) {
		for(int i=0; i<height; i++) {
			for(int j=0; j<width; j++) {
				boolean isDead = true;

				if(i==5) {
					if(j>9 && j<13) {
						isDead = false;
					}
				}
				
				init[i][j] = new Cellule(i, j, isDead);
			}
		}
	}
	
	public static void genererSpaceship(int width, int height, Cellule[][] init) {
		for(int i=0; i<height; i++) {
			for(int j=0; j<width; j++) {
				boolean isDead = true;

				if((i==0 && j==1) ||(i==1 && j==2 || (i==2 && j==0)) || (i==2 && j==1) || (i==2 && j==2)) {
					isDead = false;
				}

				init[i][j] = new Cellule(i, j, isDead);
			}
		}
	}
	
	public static void genererPulsar(int width, int height, Cellule[][] init) {
		for(int i=0; i<height; i++) {
			for(int j=0; j<width; j++) {
				boolean isDead = true;
				
				if(i>1 && i<15 && (i!=3 || i!= 8 || i!=13)) {
					if(i==2 || i==7 || i==9 || i==14) {
						if((j>3 && j<7) || (j>9 && j<13)) {
							isDead = false;
						}
					} else if(i!=3 && i!=7 && i!=8 && i!=9 && i!=13) {
						if(j==2 || j==7 || j==9 || j==14) {
							isDead = false;
						}
					}
				}

				init[i][j] = new Cellule(i, j, isDead);
			}
		}
	}

}
