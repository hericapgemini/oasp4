package io.oasp.gastronomy.restaurant.cpapmanagement.logic.api.to;

import io.oasp.gastronomy.restaurant.cpapmanagement.common.api.User;
import io.oasp.module.basic.common.api.to.AbstractEto;

/**
 * {@link AbstractEto ETO} for {@link User}.
 *
 */
public class UserEto extends AbstractEto implements User {

  private static final long serialVersionUID = 1L;

  private String nom;

  private String prenom;

  private String email;

  private String motdepasse;

  /**
   * The constructor.
   */
  public UserEto() {

    super();
  }

  /**
   * @return nom
   */
  public String getNom() {

    return this.nom;
  }

  /**
   * @param nom new value of {@link #getnom}.
   */
  public void setNom(String nom) {

    this.nom = nom;
  }

  /**
   * @return prenom
   */
  public String getPrenom() {

    return this.prenom;
  }

  /**
   * @param prenom new value of {@link #getprenom}.
   */
  public void setPrenom(String prenom) {

    this.prenom = prenom;
  }

  /**
   * @return email
   */
  public String getEmail() {

    return this.email;
  }

  /**
   * @param email new value of {@link #getemail}.
   */
  public void setEmail(String email) {

    this.email = email;
  }

  /**
   * @return motdepasse
   */
  public String getMotdepasse() {

    return this.motdepasse;
  }

  /**
   * @param motdepasse new value of {@link #getmotdepasse}.
   */
  public void setMotdepasse(String motdepasse) {

    this.motdepasse = motdepasse;
  }

}
