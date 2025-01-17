class NombreNegatifException extends Exception {
    private int nombreNegatif;

    public NombreNegatifException(int nombreNegatif) {
        super("Nombre négatif non autorisé : " + nombreNegatif);
        this.nombreNegatif = nombreNegatif;
    }

    public int getNombreNegatif() {
        return nombreNegatif;
    }
}
