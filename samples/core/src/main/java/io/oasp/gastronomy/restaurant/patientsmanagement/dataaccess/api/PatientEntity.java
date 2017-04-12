package io.oasp.gastronomy.restaurant.patientsmanagement.dataaccess.api;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

import io.oasp.gastronomy.restaurant.general.dataaccess.api.ApplicationPersistenceEntity;
import io.oasp.gastronomy.restaurant.patientsmanagement.common.api.Patient;

/**
 * @author rgueye
 *
 */

@Entity
// Table is a reserved word in SQL/RDBMS and can not be used as table name
@Table(name = "Patient")
public class PatientEntity extends ApplicationPersistenceEntity implements Patient {
  private static final long serialVersionUID = 1L;

  private int id;

  private String nom;

  private String prenom;

  private Date dateDeNaissance;

  private String sexe;

  private Double poids;

  private String email;

  private Double taille;

  private String adeli;

  private Integer idMachine;

  /**
   * The constructor.
   */
  public PatientEntity() {

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
   * @return dateDeNaissance
   */
  public Date getDateDeNaissance() {

    return this.dateDeNaissance;
  }

  /**
   * @param datedenaissance new value of {@link #getdatedenaissance}.
   */
  public void setDateDeNaissance(Date datedenaissance) {

    this.dateDeNaissance = datedenaissance;

  }

  /**
   * @return sexe
   */
  public String getSexe() {

    return this.sexe;
  }

  /**
   * @param sexe new value of {@link #getsexe}.
   */
  public void setSexe(String sexe) {

    this.sexe = sexe;

  }

  /**
   * @return poids
   */
  public Double getPoids() {

    return this.poids;
  }

  /**
   * @param poids new value of {@link #poids}.
   */
  public void setPoids(Double poids) {

    this.poids = poids;
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
   * @return taille
   */
  public Double getTaille() {

    return this.taille;
  }

  /**
   * @param taille new value of {@link #gettaille}.
   */
  public void setTaille(Double taille) {

    this.taille = taille;

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

  /**
   * @return idmachine
   */
  public Integer getIdMachine() {

    return this.idMachine;
  }

  /**
   * @param idmachine new value of {@link #getidmachine}.
   */
  public void setIdMachine(Integer idmachine) {

    this.idMachine = idmachine;

  }

}
