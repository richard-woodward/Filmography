package fr.eseo.dis.woodward.filmography.data;


/**
 * Created by rwoodward on 16/11/17.
 */

public class Notation {


  private int id_film;

  private String email;

  private int note;

  public Notation(int id_film, String email, int note) {
    this.id_film = id_film;
    this.email = email;
    this.note = note;
  }


  public int getId_film() {
    return id_film;
  }

  public void setId_film(int id_film) {
    this.id_film = id_film;
  }


  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }


  public int getNote() {
    return note;
  }

  public void setNote(int note) {
    this.note = note;
  }
}
