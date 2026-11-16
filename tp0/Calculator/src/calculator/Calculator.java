/*
 * Olivier Lesenfans Lundi 16 Novembre 2026 tp 0
 */
package calculator;

import java.util.Scanner;

/**
 *
 * @author olivierlesenfans
 */
public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Please enter the operator:");
        System.out.println("1) add");
        System.out.println("2) substract");
        System.out.println("3) multiply");
        System.out.println("4) divide");
        System.out.println("5) modulo");
        
        Scanner sc = new Scanner(System.in);
        System.out.println("\n Entrer l'opérateur :");
        int operateur;
        
        operateur = sc.nextInt();
        
        System.out.println("Entrez deux nombres");
        
        /*Exo 4*/
        
        int operande1;
        Scanner sc2 = new Scanner(System.in);
        operande1 = sc2.nextInt();
        
        int operande2;
        Scanner sc3 = new Scanner(System.in);
        operande2 = sc3.nextInt();
        
        float res = 0;
        
        switch(operateur){
            case 1:
               res = operande1 + operande2;
               break;
            case 2:
                res = operande1 - operande2;
                break;
            case 3:
                res = operande1 * operande2;
                break;
            case 4:
                if (operande2 != 0)
                    res = (float)operande1 / operande2;
                else
                    System.out.println("Erreur, divisio, par zero");
                break;
     
            case 5:
                res = operande1 % operande2;
                break;
                
            default:
                System.out.println("Opérateur invalide !");
                return;
        }
        System.out.println("The result is: "+res);
    }
}
