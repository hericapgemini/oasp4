package io.oasp.gastronomy.restaurant.cpapmanagement.dataaccess.api;

import javax.persistence.Entity;
import javax.persistence.Table;

import io.oasp.gastronomy.restaurant.cpapmanagement.common.api.Medecin;
import io.oasp.gastronomy.restaurant.general.dataaccess.api.ApplicationPersistenceEntity;

/**
 * @author vanguyen
 *
 */
@Entity
// Table is a reserved word in SQL/RDBMS and can not be used as table name
@Table(name = "Medecin")
public class MedecinEntity extends ApplicationPersistenceEntity implements Medecin {

  private static final long serialVersionUID = 2L;

  private String nom;

  private String prenom;

  private String RPPS;

  private String Adeli;

  /**
   * The constructor.
   */
  public MedecinEntity() {

    super();

  }

  /**
   * @return nom
   */
  public String getNom() {

    return this.nom;
  }

  /**
   * @param nom new value of {@link #setNom}.
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
