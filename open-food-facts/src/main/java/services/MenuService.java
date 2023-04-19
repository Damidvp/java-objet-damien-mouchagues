package services;

import java.util.Scanner;

import entites.Stock;

public abstract class MenuService {
	
	public abstract void traiter(Stock stockProduits, Scanner scanner);
	
}
