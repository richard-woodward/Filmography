package fr.eseo.dis.woodward.filmography.data;


/**
 * Created by rwoodward on 16/11/17.
 */

public class Internaute {


  private String email;

  private String nom;

  private String prenom;

  private String region;

  private int anneeNaissance;

  public Internaute(String email, String nom, String prenom, String region, int anneeNaissance) {
    this.email = email;
    this.nom = nom;
    this.prenom = prenom;
    this.region = region;
    this.anneeNaissance = anneeNaissance;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
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


  public String getRegion() {
    return region;
  }

  public void setRegion(String region) {
    this.region = region;
  }

  public int getAnneeNaissance() {
    return anneeNaissance;
  }

  public void setAnneeNaissance(int anneeNaissance) {
    this.anneeNaissance = anneeNaissance;
  }
}
