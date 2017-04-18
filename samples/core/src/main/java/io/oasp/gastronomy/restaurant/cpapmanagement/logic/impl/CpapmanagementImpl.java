package io.oasp.gastronomy.restaurant.cpapmanagement.logic.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.security.RolesAllowed;
import javax.inject.Inject;
import javax.inject.Named;
import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import io.oasp.gastronomy.restaurant.cpapmanagement.dataaccess.api.MedecinEntity;
import io.oasp.gastronomy.restaurant.cpapmanagement.dataaccess.api.UserEntity;
import io.oasp.gastronomy.restaurant.cpapmanagement.dataaccess.api.dao.MedecinDao;
import io.oasp.gastronomy.restaurant.cpapmanagement.dataaccess.api.dao.UserDao;
import io.oasp.gastronomy.restaurant.cpapmanagement.logic.api.Cpapmanagement;
import io.oasp.gastronomy.restaurant.cpapmanagement.logic.api.to.MedecinEto;
import io.oasp.gastronomy.restaurant.cpapmanagement.logic.api.to.UserEto;
import io.oasp.gastronomy.restaurant.general.common.api.constants.PermissionConstants;
import io.oasp.gastronomy.restaurant.general.logic.base.AbstractComponentFacade;

/**
 * Implementation class for {@link Cpapmanagement}.
 *
 */
@Named
@Transactional
@Component
public class CpapmanagementImpl extends AbstractComponentFacade implements Cpapmanagement {

  private static final Logger LOG = LoggerFactory.getLogger(CpapmanagementImpl.class);

  private UserDao userDao;

  private MedecinDao medecinDao;

  /**
   * The constructor.
   */

  public CpapmanagementImpl() {

    super();
  }

  @Override
  @RolesAllowed(PermissionConstants.FIND_TABLE)
  public UserEto findUser(long id) {

    LOG.debug("Get User with id '" + id + "' from database.");

    return getBeanMapper().map(getUserDao().findOne(id), UserEto.class);

  }

  @Override
  @RolesAllowed(PermissionConstants.FIND_TABLE)
  public List<UserEto> findAllUser() {

    List<UserEntity> users = getUserDao().findAll();
    List<UserEto> usersBo = new ArrayList<>();

    for (UserEntity user : users) {
      usersBo.add(getBeanMapper().map(user, UserEto.class));
    }

    return usersBo;
  }

  /**
   * @return the {@link UserDao} instance.
   */

  public UserDao getUserDao() {

    return this.userDao;
  }

  /**
   * Sets the field 'userDao'.
   *
   * @param userDao New value for userDao
   */

  @Inject
  public void setUserDao(UserDao userDao) {

    this.userDao = userDao;

  }

  @Override
  @RolesAllowed(PermissionConstants.FIND_TABLE)
  public MedecinEto findMedecin(long id) {

    LOG.debug("Get Medecin with id '" + id + "' from database.");

    return getBeanMapper().map(getMedecinDao().findOne(id), MedecinEto.class);

  }

  @Override
  @RolesAllowed(PermissionConstants.FIND_TABLE)
  public List<MedecinEto> findAllMedecin() {

    List<MedecinEntity> medecins = getMedecinDao().findAll();
    List<MedecinEto> medecinBo = new ArrayList<>();
    for (MedecinEntity medecin : medecins) {
      medecinBo.add(getBeanMapper().map(medecin, MedecinEto.class));
    }
    return medecinBo;
  }

  /**
   * @return the {@link MedecinDao} instance.
   */

  public MedecinDao getMedecinDao() {

    return this.medecinDao;
  }

  /**
   * Sets the field 'MedecinDao'.
   *
   * @param MedecinDao New value for MedecinDao
   */

  @Inject
  public void setMedecinDao(MedecinDao medecinDao) {

    this.medecinDao = medecinDao;
  }

  @Override
  @RolesAllowed(PermissionConstants.FIND_TABLE)
  public MedecinEto addMedecin(final MedecinEto doctorID) {

    List<MedecinEntity> medecins = getMedecinDao().findAll();
    List<MedecinEto> medecinBo = new ArrayList<>();
    boolean medecinExists = false;
    for (MedecinEntity medecin : medecins) {

      if (medecin != null && doctorID != null && medecin.getId() == doctorID.getId()) {
        medecinExists = true;
        break;
      }
    }
    if (!medecinExists) {
      medecinBo.add(doctorID);
      medecinBo.add(getBeanMapper().map(doctorID, MedecinEto.class));
      return (MedecinEto) medecinBo;
    }
    return doctorID;
  }

  @Override
  @RolesAllowed(PermissionConstants.FIND_TABLE)
  public void deleteMedecin(long medecinID) {

    LOG.debug("Get Medecin with id '" + medecinID + "' from database.");

    getMedecinDao().delete(medecinID);

  }

  @Override
  @RolesAllowed(PermissionConstants.FIND_TABLE)

  public MedecinEntity updateDoctor(MedecinEntity doctorID) {

    List<MedecinEntity> medecins = getMedecinDao().findAll();
    List<MedecinEto> medecinBo = new ArrayList<>();

    for (MedecinEntity medecin : medecins) {

      if (medecin != null && doctorID != null && medecin.getId() == doctorID.getId()) {
        medecin.setId(doctorID.getId());
        medecin.setNom(doctorID.getNom());
        medecin.setPrenom(doctorID.getPrenom());
        return medecin;
      } else {
        break;
      }

    }
    return doctorID;

  }

}
