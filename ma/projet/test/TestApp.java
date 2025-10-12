package ma.projet.test;

import ma.projet.bean.Categorie;
import ma.projet.bean.Article;

public class TestApp {
	public static void main(String[] args) {
		// 1. Créer les catégories
		Categorie[] categories = new Categorie[2];
		categories[0] = new Categorie("Ordinateur Portable", "O PR");
		categories[1] = new Categorie("Ordinateur Poste", "O PO");

		// 2. Créer les articles
		Article[] articles = new Article[4];
		articles[0] = new Article(14, "DELL INSPIRON", categories[0]);
		articles[1] = new Article(4, "SONY VAIO", categories[0]);
		articles[2] = new Article(74, "TERRA", categories[1]);
		articles[3] = new Article(785, "HP Compaq", categories[1]);

		// 3. Affichage des articles par catégorie
		for (int i = 0; i < categories.length; i++) {
			System.out.println(categories[i].getLibelle() + " :");
			for (int j = 0; j < articles.length; j++) {
				if (articles[j].getCategorie().getId() == categories[i].getId()) {
					System.out.println("  - " + articles[j]);
				}
			}
			System.out.println();
		}
	}
}
