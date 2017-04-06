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

import io.oasp.gastronomy.restaurant.cpapmanagement.dataaccess.api.UserEntity;
import io.oasp.gastronomy.restaurant.cpapmanagement.dataaccess.api.dao.UserDao;
import io.oasp.gastronomy.restaurant.cpapmanagement.logic.api.Cpapmanagement;
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

  /**
   * The constructor.
   */
  public CpapmanagementImpl() {

    super();
  }

}
