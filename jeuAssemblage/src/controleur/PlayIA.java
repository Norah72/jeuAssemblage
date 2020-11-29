package controleur;

import java.util.*;

public class PlayIA implements InterfacePlay{
    
    public int choix(int borneInf, int borneSup){
        System.out.println("Inf : "+ borneInf+ "  |  Sup : "+borneSup);
        int choix = ((new Random()).nextInt(borneSup-borneInf + 1))+borneInf;
        System.out.println("Chhooiixx : "+choix); // chhooiix ?? D'accord =l
        return choix;
    }
    
    public ArrayList<Integer> selectCoordonnees(int largeurPlateau, int longueurPlateau){
        return new ArrayList(Arrays.asList(((new Random()).nextInt(largeurPlateau))+1, ((new Random()).nextInt(longueurPlateau))+1));
    }
    
}
