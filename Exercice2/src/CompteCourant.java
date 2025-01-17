class CompteCourant extends CompteBancaire {
    private double decouvertAutorise;

    public CompteCourant(String numero, String titulaire, double soldeInitial, double decouvertAutorise) {
        super(numero, titulaire, soldeInitial);
        this.decouvertAutorise = decouvertAutorise;
    }

    @Override
    public void retrait(double montant) throws FondsInsuffisantsException {
        if (montant <= 0) {
            return;
        }
        if (solde + decouvertAutorise >= montant) {
            solde -= montant;
            System.out.println("Retrait de " + montant + "DH effectué. Nouveau solde : " + solde + "DH");
        } else {
            throw new FondsInsuffisantsException("Fonds insuffisants. Solde actuel : " + solde +
                    "DH, Découvert autorisé : " + decouvertAutorise + "DH");
        }
    }
}