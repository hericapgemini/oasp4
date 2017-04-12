package io.oasp.gastronomy.restaurant.doctorsmanagement.logic.api.to;

import io.oasp.gastronomy.restaurant.doctorsmanagement.common.api.Doctor;
import io.oasp.module.basic.common.api.to.AbstractEto;

/**
 * {@link AbstractEto ETO} for {@link Doctor}.
 *
 */
public class DoctorEto extends AbstractEto implements Doctor {

  private static final long serialVersionUID = 1L;

  private String nom;

  private String prenom;

  private String rpps;

  private String adeli;

  /**
   * The constructor.
   */
  public DoctorEto() {

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
   * @return rpps
   */
  public String getRpps() {

    return this.rpps;
  }

  /**
   * @param rpps new value of {@link #getrpps}.
   */
  public void setRpps(String rpps) {

    this.rpps = rpps;
  }

  /**
   * @return adeli
   */
  public String getAdeli() {

    return this.adeli;
  }

  /**
   * @param adeli new value of {@link #getadeli}.
   */
  public void setAdeli(String adeli) {

    this.adeli = adeli;
  }
}
