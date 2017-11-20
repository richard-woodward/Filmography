package fr.eseo.dis.woodward.filmography.data;


/**
 * Created by rwoodward on 16/11/17.
 */

public class Pays {


  public String code;

  public String nom;

  public String langue;

  public Pays(String code, String nom, String langue) {
    this.code = code;
    this.nom = nom;
    this.langue = langue;
  }

  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }


  public String getNom() {
    return nom;
  }

  public void setNom(String nom) {
    this.nom = nom;
  }


  public String getLangue() {
    return langue;
  }

  public void setLangue(String langue) {
    this.langue = langue;
  }
}
