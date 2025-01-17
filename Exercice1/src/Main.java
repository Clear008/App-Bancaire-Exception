
public class Main {
    public static void main(String[] args) {
        try {
            // Test du constructeur
            EntierNaturel en1 = new EntierNaturel(5);
            System.out.println("Valeur initiale : " + en1.getVal());

            // Test de setVal
            en1.setVal(10);
            System.out.println("Nouvelle valeur : " + en1.getVal());

            // Test de decrementer
            en1.decrementer();
            System.out.println("Après décrément : " + en1.getVal());

            // Test avec une valeur négative
            new EntierNaturel(-5);

        } catch (NombreNegatifException e) {
            System.out.println("Valeur négative qui a causé l'erreur : " + e.getNombreNegatif());
        }

        try {
            EntierNaturel en3 = new EntierNaturel(1);
            System.out.println("Valeur initiale : " + en3.getVal());
            en3.decrementer();
            en3.decrementer();

        } catch (NombreNegatifException e) {
            System.out.println("Exception attrapée : " + e.getMessage());
            System.out.println("Valeur négative qui a causé l'erreur : " + e.getNombreNegatif());
        }
    }
}
