package Zoo;

import java.lang.String;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

enum typeAnimal {
	mammifère,
	insecte,
	primate,
	chill,
	féroce;
}
public class Secteur {
	
	typeAnimal typeAnimauxDansSecteur;
	List<Animal> animauxDansSecteur;
	
	public Secteur(typeAnimal test1,List<Animal> animauxDansSecteur1 ) {
		typeAnimauxDansSecteur = test1;
		animauxDansSecteur=animauxDansSecteur1;
	}

	public static void main(String[] args) {
	}
	
	public void ajouterAnimal(Animal animal)
	{
		
	}
	
	public int getNombreAnimaux()
	{
		return 0;
	}
	public typeAnimal obtenirType()
	{
		typeAnimal mammifère= typeAnimal.mammifère;
		return mammifère;
	}
	
}
