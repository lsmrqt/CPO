/*
 * TP0 Exercice 1
 * Marquet Louis
 * TDB 2
 * 27/09/2021
 */
package exo1;

import java.util.Scanner;

/**
 * @author louis
 */
public class Exo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Bonjour");
        System.out.println("Au-revoir");
        
        String prenom; /*dit que la valeur n'est pas utilisé donc inutile*/
        Scanner sc;
        sc = new Scanner(System.in);
        System.out.println("Bonjour, quel est votre prenom ?");
        prenom = sc.nextLine();
    }
    
}
