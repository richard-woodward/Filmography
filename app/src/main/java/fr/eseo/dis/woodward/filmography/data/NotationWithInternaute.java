package fr.eseo.dis.woodward.filmography.data;

/**
 * Created by rwoodward on 20/11/17.
 */

public class NotationWithInternaute {

  private final Notation notation;

  private final Internaute internaute;

  public NotationWithInternaute(Notation notation, Internaute internaute) {
    this.notation = notation;
    this.internaute = internaute;
  }

  public Notation getNotation() {
    return notation;
  }

  public Internaute getInternaute() {
    return internaute;
  }
}
