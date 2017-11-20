package fr.eseo.dis.woodward.filmography.data;

/**
 * Created by rwoodward on 20/11/17.
 */

public class RoleWithActor {

  private final Artiste actor;
  private final Role role;

  public RoleWithActor(Artiste actor, Role role) {
    this.actor = actor;
    this.role = role;
  }

  public Artiste getActor() {
    return actor;
  }

  public Role getRole() {
    return role;
  }
}
