package io.oasp.gastronomy.restaurant.cpapmanagement.common.api;

import io.oasp.gastronomy.restaurant.general.common.api.ApplicationEntity;

/**
 * This is the interface for a {@link User} that represents a {@link User}.
 *
 */
public interface User extends ApplicationEntity {

  /**
   * @return nom
   */
  public String getNom();

  /**
   * @param nom new value of {@link #getnom}.
   */
  public void setNom(String nom);

  /**
   * @return prenom
   */
  public String getPrenom();

  /**
   * @param prenom new value of {@link #getprenom}.
   */
  public void setPrenom(String prenom);

  /**
   * @return email
   */
  public String getEmail();

  /**
   * @param email new value of {@link #getemail}.
   */
  public void setEmail(String email);

  /**
   * @return motdepasse
   */
  public String getMotdepasse();

  /**
   * @param motdepasse new value of {@link #getmotdepasse}.
   */
  public void setMotdepasse(String motdepasse);

}
