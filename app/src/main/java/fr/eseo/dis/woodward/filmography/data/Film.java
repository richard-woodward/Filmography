package fr.eseo.dis.woodward.filmography.data;


import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by rwoodward on 16/11/17.
 */

public class Film implements Parcelable {


  public static final Parcelable.Creator<Film> CREATOR = new Parcelable.Creator<Film>() {

    public Film createFromParcel(Parcel source) {
      return new Film(source);
    }


    public Film[] newArray(int size) {
      return new Film[size];
    }
  };
  private int idFilm;
  private String titre;
  private int annee;
  private int idRealisateur;
  private String genre;
  private String resume;
  private String codePays;

  public Film(int idFilm, String titre, int annee, int idRealisateur, String genre, String resume,
      String codePays) {
    this.idFilm = idFilm;
    this.titre = titre;
    this.annee = annee;
    this.idRealisateur = idRealisateur;
    this.genre = genre;
    this.resume = resume;
    this.codePays = codePays;
  }

  public Film(Parcel in) {
    this.idFilm = in.readInt();
    this.titre = in.readString();
    this.annee = in.readInt();
    this.idRealisateur = in.readInt();
    this.genre = in.readString();
    this.resume = in.readString();
    this.codePays = in.readString();
  }

  public int getIdFilm() {
    return idFilm;
  }

  public void setIdFilm(int idFilm) {
    this.idFilm = idFilm;
  }

  public String getTitre() {
    return titre;
  }

  public void setTitre(String titre) {
    this.titre = titre;
  }

  public int getAnnee() {
    return annee;
  }

  public void setAnnee(int annee) {
    this.annee = annee;
  }

  public int getIdRealisateur() {
    return idRealisateur;
  }

  public void setIdRealisateur(int idRealisateur) {
    this.idRealisateur = idRealisateur;
  }

  public String getGenre() {
    return genre;
  }

  public void setGenre(String genre) {
    this.genre = genre;
  }

  public String getResume() {
    return resume;
  }

  public void setResume(String resume) {
    this.resume = resume;
  }

  public String getCodePays() {
    return codePays;
  }

  public void setCodePays(String codePays) {
    this.codePays = codePays;
  }

  public int describeContents() {
    return 0;
  }

  public void writeToParcel(Parcel dest, int flags) {

    dest.writeInt(this.idFilm);
    dest.writeString(this.titre);
    dest.writeInt(this.annee);
    dest.writeInt(this.idRealisateur);
    dest.writeString(this.genre);
    dest.writeString(this.resume);
    dest.writeString(this.codePays);
  }
}
