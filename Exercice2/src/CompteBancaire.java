
abstract class CompteBancaire {
    protected String numero;
    protected double solde;
    protected String titulaire;

    public CompteBancaire(String numero, String titulaire, double soldeInitial) {
        this.numero = numero;
        this.titulaire = titulaire;
        this.solde = soldeInitial;
    }

    public void depot(double montant) {
        if (montant > 0) {
            solde += montant;
            System.out.println("Dépôt de " + montant + "DH effectué. Nouveau solde : " + solde + "DH");
        }
    }

    public abstract void retrait(double montant) throws FondsInsuffisantsException;

    public void afficherSolde() {
        System.out.println("Solde du compte " + numero + " (" + titulaire + ") : " + solde + "DH");
    }

    public String getNumero() {
        return numero;
    }

    public double getSolde() {
        return solde;
    }
}