package DB;


import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner; // import the Scanner class 
import java.util.jar.JarException;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;













public class Controleur {

    public String lireFichierJSON(String cheminFichier) {
        StringBuilder contenu = new StringBuilder();
        try (FileReader reader = new FileReader(cheminFichier)) {
            int caractere;
            while ((caractere = reader.read()) != -1) {
                contenu.append((char) caractere);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return contenu.toString();
    }

    public void ecrireFichierJSON(JSONObject objetJSON, String cheminFichier) {
        try (FileWriter writer = new FileWriter(cheminFichier)) {
            writer.write(objetJSON.toJSONString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public boolean fichierJSONEstVide(String cheminFichier) {
        try (FileReader reader = new FileReader(cheminFichier)) {
            return reader.read() == -1;
        } catch (IOException e) {
            e.printStackTrace();
            return true;
        }
    }

    public void mettreAJourPreferencesArtiste(String nomArtiste) {
        // Implémentation à compléter
    }

    public void creerNouvelUtilisateur() {


            Scanner myObj = new Scanner(System.in);
            String nomUtilisateur;
            
        
        // Enter username and press Enter
        System.out.println("Entrer votre nom d'utilisateur : "); 
        nomUtilisateur = myObj.nextLine();
        System.out.println("votre age :  ");
        int age = myObj.nextInt();
        System.out.println("votre profil a été cree avec succés " + nomUtilisateur);  

        // Créer un objet JSON avec le nom de l'utilisateur
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("nom", nomUtilisateur);
        jsonObject.put("age", age);

        // Chemin du fichier JSON à créer
        String cheminFichier = "BASE/" + nomUtilisateur + ".json";

        // Écrire l'objet JSON dans le fichier
        try (FileWriter file = new FileWriter(cheminFichier)) {
            file.write(jsonObject.toString());
            System.out.println("votre profil  a  créé avec succès pour l'utilisateur : " + nomUtilisateur);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Implémentation à compléter
    }

    public void ajouterArtistePrefere(String nomArtiste, String nomUtilisateur, String cheminFichier) {
        // Implémentation à compléter
    }

    public void supprimerArtistePrefere(String nomArtiste, String nomUtilisateur, String cheminFichier) {
        // Implémentation à compléter
    }

    public JSONObject rechercherUtilisateur(String nomUtilisateur, String cheminFichier) {
        // Implémentation à compléter
        return null;
    }

    public JSONArray rechercherArtistePrefere(String nomArtiste, String cheminFichier) {
        // Implémentation à compléter
        return null;
    }

    public JSONArray genererRecommandations(String nomUtilisateur, String cheminFichier) {
        // Implémentation à compléter
        return null;
    }

    public void afficherImageAlbum(String cheminFichier) throws ParseException {
        try {
            JSONParser jsonP = new JSONParser();
        
            // Parser le fichier JSON
            JSONObject jsonO = (JSONObject)jsonP.parse(new FileReader("DB/test.json"));
            // Extraire le chemin de l'image de l'album
            String cheminImage = jsonO.get("image").toString();

            // Charger l'image à partir du chemin
            BufferedImage image = ImageIO.read(new File(cheminImage));

            // Afficher l'image (ceci est une étape spécifique à votre interface utilisateur)
            afficherImage(image);
        } catch (IOException e) {
            // Gérer les exceptions
            e.printStackTrace();
        }
    }

     // Méthode pour afficher l'image dans votre interface utilisateur (à adapter selon votre interface)
    private void afficherImage(BufferedImage image) {
        // Code pour afficher l'image dans votre interface utilisateur
    }
}



