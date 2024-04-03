package DB;


import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;



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

    public void artistesdispo(String cheminFichier) throws org.json.simple.parser.ParseException, ParseException {
        JSONParser parser = new JSONParser();
        try (Reader reader = new FileReader(cheminFichier)) {
            // Parser le fichier JSON pour obtenir les données
            Object obj = parser.parse(reader);
            if (obj instanceof JSONObject) {
                JSONObject jsonObject = (JSONObject) obj;
                JSONArray artistesArray = (JSONArray) jsonObject.get("artistes");
                if (artistesArray != null) {
                    // Si nous avons trouvé la liste d'artistes, nous parcourons chaque objet artiste pour extraire le nom
                    List<String> artistesList = new ArrayList<>();
                    for (Object artisteObj : artistesArray) {
                        if (artisteObj instanceof JSONObject) {
                            JSONObject artiste = (JSONObject) artisteObj;
                            String nomArtiste = (String) artiste.get("nom");
                            artistesList.add(nomArtiste);
                        }
                    }
                    System.out.println("la liste des artistes dispnibles sont "+artistesList );
                } else {
                    System.out.println("Le fichier ne contient pas une liste d'artistes.");
                }
            } else {
                System.out.println("Le contenu du fichier n'est pas un objet JSON.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }

        public void creerNouvelUtilisateur(String nomUtilisateur, int age,String adressemail) {
        // Créer un objet JSON avec le nom de l'utilisateur et son âge
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("nom", nomUtilisateur);
        jsonObject.put("age", age);
        jsonObject.putIfAbsent("adressemail", adressemail);

        // Chemin du fichier JSON à créer
        String cheminFichier = "BASE/" + nomUtilisateur + ".json";

        // Écrire l'objet JSON dans le fichier
        try (FileWriter file = new FileWriter(cheminFichier)) {
            file.write(jsonObject.toJSONString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    
}



