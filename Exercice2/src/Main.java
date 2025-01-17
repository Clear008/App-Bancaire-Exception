import java.util.ArrayList;

public class Main {
    private static ArrayList<CompteBancaire> comptes;

    public static void main(String[] args) {
        // Initialisation de l'ArrayList
        comptes = new ArrayList<CompteBancaire>();

        try {
            // Création des comptes
            CompteCourant cc1 = new CompteCourant("CC1", "Saad Beniss", 1000, 500);
            CompteEpargne ce1 = new CompteEpargne("CE1", "Marwa Sbaa", 2000, 0.05);

            // Ajout des comptes à la liste
            comptes.add(cc1);
            comptes.add(ce1);
            System.out.println("Comptes créés et ajoutés à la liste");

            // Test des opérations
            System.out.println("\n=== État initial des comptes ===");
            for (CompteBancaire compte : comptes) {
                compte.afficherSolde();
            }

            System.out.println("\n=== Test des opérations ===");
            cc1.depot(500);
            cc1.retrait(2000);

            ce1.depot(1000);
            ce1.appliquerInterets();

            // Test de transfert
            System.out.println("\n=== Test de transfert ===");
            transfert("CC1", "CE1", 500);

            // Test avec compte inexistant
            System.out.println("\n=== Test avec compte inexistant ===");
            transfert("CC999", "CE1", 100);

        } catch (FondsInsuffisantsException e) {
            System.out.println("Erreur : " + e.getMessage());
        } catch (CompteInexistantException e) {
            System.out.println("Erreur : " + e.getMessage());
        }

        // Suppression d'un compte
        System.out.println("\n=== Suppression de compte ===");
        comptes.removeIf(compte -> compte.getNumero().equals("CC1"));
        System.out.println("Compte CC1 supprimé");

        System.out.println("\n=== État final des comptes ===");
        for (CompteBancaire compte : comptes) {
            compte.afficherSolde();
        }
    }

    // Méthode utilitaire pour trouver un compte
    private static CompteBancaire trouverCompte(String numero) throws CompteInexistantException {
        for (CompteBancaire compte : comptes) {
            if (compte.getNumero().equals(numero)) {
                return compte;
            }
        }
        throw new CompteInexistantException("Compte " + numero + " introuvable");
    }

    // Méthode pour effectuer un transfert
    private static void transfert(String numSource, String numDest, double montant)
            throws CompteInexistantException, FondsInsuffisantsException {
        CompteBancaire source = trouverCompte(numSource);
        CompteBancaire destination = trouverCompte(numDest);

        source.retrait(montant);
        destination.depot(montant);
        System.out.println("Transfert de " + montant + "DH effectué avec succès");
    }
}