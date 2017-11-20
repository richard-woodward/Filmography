package fr.eseo.dis.woodward.filmography.data;


/**
 * Created by rwoodward on 16/11/17.
 */

public class Artiste {

  private int idArtiste;
  private String nom;
  private String prenom;
  private int anneeNaissance;

  public Artiste(int idArtiste, String nom, String prenom, int anneeNaissance) {
    this.idArtiste = idArtiste;
    this.nom = nom;
    this.prenom = prenom;
    this.anneeNaissance = anneeNaissance;
  }

  public int getIdArtiste() {
    return idArtiste;
  }


  public void setIdArtiste(int idArtiste) {
    this.idArtiste = idArtiste;
  }


  public String getNom() {
    return nom;
  }

  public void setNom(String nom) {
    this.nom = nom;
  }


  public String getPrenom() {
    return prenom;
  }

  public void setPrenom(String prenom) {
    this.prenom = prenom;
  }

  public int getAnneeNaissance() {
    return anneeNaissance;
  }

  public void setAnneeNaissance(int anneeNaissance) {
    this.anneeNaissance = anneeNaissance;
  }
}
