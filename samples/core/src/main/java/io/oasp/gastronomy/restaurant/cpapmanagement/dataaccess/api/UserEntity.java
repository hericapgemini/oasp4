package io.oasp.gastronomy.restaurant.cpapmanagement.dataaccess.api;

import javax.persistence.Entity;
import javax.persistence.Table;

import io.oasp.gastronomy.restaurant.cpapmanagement.common.api.User;
import io.oasp.gastronomy.restaurant.general.dataaccess.api.ApplicationPersistenceEntity;

/**
 *
 * @author rchiker
 *
 */
@Entity
// Table is a reserved word in SQL/RDBMS and can not be used as table name
@Table(name = "Utilisateur")
public class UserEntity extends ApplicationPersistenceEntity implements User {

  private static final long serialVersionUID = 1L;

  private String nom;

  private String prenom;

  private String email;

  private String motdepasse;

  /**
   * The constructor.
   */
  public UserEntity() {

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
