package Zoo;

import java.lang.String;
import java.util.ArrayList;
import java.util.List;


public class Zoo {
	int NB_VISITEUR_MAX_PAR_SECTEUR =100;
	int visiteurs;
	List<Secteur> secteursAnimaux;
	int nbvisiteyrMaxParSecteur;
	
	public Zoo(int visi,List<Secteur> list1, int nbr ) {
		visiteurs=visi;
		secteursAnimaux=list1;
		nbvisiteyrMaxParSecteur = nbr;
		
	}
	
	public void ajouterSecteur(Animal animal)
	{
		
	}
	
	public void nouveauVisiteur()
	{
		
	}
	
	public int getLimiteVisiteur()
	{
		return NB_VISITEUR_MAX_PAR_SECTEUR * secteursAnimaux.size();
	}
	
	public void nouvelAnimal()
	{
		
	}
	
	public int nombreAnimaux()
	{
		return 9;
	}
	
	
	
	
	
	
}
