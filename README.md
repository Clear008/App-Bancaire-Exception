# Exercices Java - Gestion d'Exceptions et Comptes Bancaires

Ce projet contient deux exercices pratiques en Java, démontrant la gestion des exceptions et l'implémentation de classes.

---

## Exercice 1 : Gestion des Entiers Naturels

### Description
Implémentation d'une classe `EntierNaturel` pour gérer des entiers positifs ou nuls avec gestion d'exceptions personnalisées.

### Classes
- **`EntierNaturel`** : Classe principale pour la gestion des entiers naturels.
- **`NombreNegatifException`** : Exception personnalisée pour les nombres négatifs.

### Fonctionnalités
- **Constructeur avec validation** : Empêche l'initialisation avec un nombre négatif.
- **Accesseurs en lecture/écriture** : Méthodes `getVal()` et `setVal()` pour interagir avec l'attribut `val`.
- **Méthode de décrémentation** : Diminue la valeur de `val` tout en vérifiant qu'elle reste valide.
- **Gestion des exceptions** : Levée de l'exception `NombreNegatifException` pour les nombres négatifs.

---

## Exercice 2 : Système de Gestion Bancaire

### Description
Implémentation d'un système simple de gestion de comptes bancaires avec différents types de comptes et gestion d'exceptions.

### Classes
- **`CompteBancaire`** : Classe de base pour la gestion des comptes.
- **`CompteCourant`** : Hérite de `CompteBancaire` et autorise un découvert.
- **`CompteEpargne`** : Hérite de `CompteBancaire` et permet le calcul d'intérêts.
- **`FondsInsuffisantsException`** : Exception levée pour un solde insuffisant lors des retraits ou transferts.
- **`CompteInexistantException`** : Exception levée si le compte destinataire d'un transfert est introuvable.
- **`Main`** : Classe principale avec des tests pour valider le comportement des classes.

### Fonctionnalités
- **Création et gestion de comptes** : Ajout et suppression de comptes.
- **Dépôt et retrait d'argent** : Méthodes pour ajouter ou retirer des fonds avec validation.
- **Transfert entre comptes** : Transferts sécurisés avec gestion d'exceptions.
- **Gestion du découvert autorisé** : Implémenté dans la classe `CompteCourant`.
- **Calcul des intérêts** : Fonctionnalité spécifique à `CompteEpargne`.
- **Gestion des exceptions** : Messages clairs pour les erreurs de fonds insuffisants ou comptes inexistants.

---
