class CompteEpargne extends CompteBancaire {
    private double tauxInteret;

    public CompteEpargne(String numero, String titulaire, double soldeInitial, double tauxInteret) {
        super(numero, titulaire, soldeInitial);
        this.tauxInteret = tauxInteret;
    }

    @Override
    public void retrait(double montant) throws FondsInsuffisantsException {
        if (montant <= 0) {
            return;
        }
        if (solde >= montant) {
            solde -= montant;
            System.out.println("Retrait de " + montant + "DH effectué. Nouveau solde : " + solde + "DH");
        } else {
            throw new FondsInsuffisantsException("Fonds insuffisants. Solde actuel : " + solde + "DH");
        }
    }

    public void appliquerInterets() {
        double interets = solde * tauxInteret;
        solde += interets;
        System.out.println("Intérêts appliqués : " + interets + "DH. Nouveau solde : " + solde + "DH");
    }
}