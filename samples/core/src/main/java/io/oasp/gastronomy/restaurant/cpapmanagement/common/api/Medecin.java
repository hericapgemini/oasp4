package io.oasp.gastronomy.restaurant.cpapmanagement.common.api;

import io.oasp.gastronomy.restaurant.general.common.api.ApplicationEntity;

/**
 * This is the interface for a {@link Medecin} that represents a {@link Medecin}.
 *
 */
public interface Medecin extends ApplicationEntity {

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
   * @param prenom new value of {@link #getPrenom}.
   */

  public void setPrenom(String prenom);

  /**
   * @return RPPS
   */

  public String getRPPS();

  /**
   * @param RPPS new value of {@link #getRPPS}.
   */

  public void setRPPS(String rpps);

  /**
   * @return Adeli
   */

  public String getAdeli();

  /**
   * @param Adeli new value of {@link #getAdeli}.
   */

  public void setAdeli(String Adeli);

}