package io.oasp.gastronomy.restaurant.doctorsmanagement.common.api;

import io.oasp.gastronomy.restaurant.general.common.api.ApplicationEntity;

/**
 * This is the interface for a {@link Doctor} that represents a {@link Doctor}.
 *
 */
public interface Doctor extends ApplicationEntity {

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
   * @return rpps
   */
  public String getRpps();

  /**
   * @param rpps new value of {@link #getrpps}.
   */
  public void setRpps(String rpps);

  /**
   * @return adeli
   */
  public String getAdeli();

  /**
   * @param adeli new value of {@link #getadeli}.
   */
  public void setAdeli(String adeli);

}
