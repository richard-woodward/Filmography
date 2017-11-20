package fr.eseo.dis.woodward.filmography.data;


/**
 * Created by rwoodward on 16/11/17.
 */

public class Role {


  private int idFilm;

  private int idActeur;

  private String nomRole;

  public Role(int idFilm, int idActeur, String nomRole) {
    this.idFilm = idFilm;
    this.idActeur = idActeur;
    this.nomRole = nomRole;
  }


  public int getIdFilm() {
    return idFilm;
  }

  public void setIdFilm(int idFilm) {
    this.idFilm = idFilm;
  }


  public int getIdActeur() {
    return idActeur;
  }

  public void setIdActeur(int idActeur) {
    this.idActeur = idActeur;
  }

  public String getNomRole() {
    return nomRole;
  }

  public void setNomRole(String nomRole) {
    this.nomRole = nomRole;
  }
}
