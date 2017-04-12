package io.oasp.gastronomy.restaurant.cpapmanagement.logic.api.to;

import io.oasp.gastronomy.restaurant.cpapmanagement.common.api.Medecin;
import io.oasp.module.basic.common.api.to.AbstractEto;

/**
 * {@link AbstractEto ETO} for {@link Medecin}.
 *
 */
public class MedecinEto extends AbstractEto implements Medecin {

  private static final long serialVersionUID = 3L;

  private String nom;

  private String prenom;

  private String RPPS;

  private String Adeli;

  /**
   * The constructor.
   */
  public MedecinEto() {

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
   * @return RPPS
   */
  public String getRPPS() {

    return this.RPPS;
  }

  /**
   * @param prenom new value of {@link #getRpps}.
   */

  public void setRPPS(String rpps) {

    this.RPPS = rpps;
  }

  /**
   * @return Adeli
   */
  public String getAdeli() {

    return this.Adeli;
  }

  /**
   * @param prenom new value of {@link #getAdeli}.
   */
  public void setAdeli(String adeli) {

    this.Adeli = adeli;
  }
}
