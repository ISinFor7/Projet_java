package DB;
import org.json.JSONObject;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Controleur {

    // Méthode pour lire un fichier JSON et retourner son contenu sous forme de chaîne de caractères
    public String lireFichierJSON(String cheminFichier) {
        // Implémentation à venir
        return null;
    }

    // Méthode pour écrire un objet JSON dans un fichier
    public void ecrireFichierJSON(JSONObject objetJSON, String cheminFichier) {
        // Implémentation à venir
    }

    // Méthode pour vérifier si un fichier JSON est vide
    public boolean fichierJSONEstVide(String cheminFichier) {
        // Implémentation à venir
        return false;
    }

    // Méthode pour mettre à jour les préférences d'un artiste et le sauvegarder dans un autre fichier JSON
    public void mettreAJourPreferencesArtiste(String nomArtiste) {
        // Implémentation à venir
    }

    // Méthode pour ajouter un nouvel artiste dans le fichier JSON
    public void ajouterArtiste(String nomArtiste) {
        // Implémentation à venir
    }

    // Méthode pour créer un nouveau fichier JSON pour un nouvel utilisateur
    public void nouvelUtilisateur(String nomUtilisateur) {
        // Implémentation à venir
    }

    // Méthode pour supprimer un artiste du fichier JSON
    public void supprimerArtiste(String nomArtiste) {
        // Implémentation à venir
    }

    // Méthode pour modifier le nom d'un artiste dans le fichier JSON
    public void modifierNomArtiste(String ancienNom, String nouveauNom) {
        // Implémentation à venir
    }

    // Méthode pour lister les artistes préférés d'un utilisateur à partir du fichier JSON
    public void listerArtistesPreferes(String nomUtilisateur) {
        // Implémentation à venir
    }

    // Méthode pour rechercher un artiste dans le fichier JSON
    public void rechercherArtiste(String nomArtiste) {
        // Implémentation à venir
    }
}