package io.oasp.gastronomy.restaurant.doctorsmanagement.dataaccess.api;

import javax.persistence.Entity;
import javax.persistence.Table;

import io.oasp.gastronomy.restaurant.doctorsmanagement.common.api.Doctor;
import io.oasp.gastronomy.restaurant.general.dataaccess.api.ApplicationPersistenceEntity;

/**
 * @author redjekou
 *
 */
@Entity
// Table is a reserved word in SQL/RDBMS and can not be used as table name
@Table(name = "Docteur")
public class DoctorEntity extends ApplicationPersistenceEntity implements Doctor {

  private static final long serialVersionUID = 1L;

  private String nom;

  private String prenom;

  private String rpps;

  private String adeli;

  /**
   * The constructor.
   */
  public DoctorEntity() {

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
