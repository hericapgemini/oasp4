package io.oasp.gastronomy.restaurant.patientsmanagement.common.api;

import java.sql.Date;

import io.oasp.gastronomy.restaurant.general.common.api.ApplicationEntity;

/**
 * @author rgueye
 *
 */
public interface Patient extends ApplicationEntity {

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
   * @return datedenaissance
   */
  public Date getDateDeNaissance();

  /**
   * @param datedenaissance new value of {@link #getdatedenaissance}.
   */
  public void setDateDeNaissance(Date datedenaissance);

  /**
   * @return sexe
   */
  public String getSexe();

  /**
   * @param sexe new value of {@link #getsexe}.
   */
  public void setSexe(String sexe);

  /**
   * @return poids
   */
  public Double getPoids();

  /**
   * @param poids new value of {@link #getpoids}.
   */
  public void setPoids(Double poids);

  /**
   * @return email
   */
  public String getEmail();

  /**
   * @param email new value of {@link #getemail}.
   */
  public void setEmail(String email);

  /**
   * @return taille
   */
  public Double getTaille();

  /**
   * @param taille new value of {@link #gettaille}.
   */
  public void setTaille(Double taille);

  /**
   * @return adeli
   */
  public String getAdeli();

  /**
   * @param adeli new value of {@link #getadeli}.
   */
  public void setAdeli(String adeli);

  /**
   * @return idmachine
   */
  public Integer getIdMachine();

  /**
   * @param idmachine new value of {@link #getidmachine}.
   */
  public void setIdMachine(Integer idmachine);

}
