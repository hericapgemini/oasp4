package io.oasp.gastronomy.restaurant.cpapmanagement.logic.impl.usecase;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.security.RolesAllowed;
import javax.inject.Inject;
import javax.inject.Named;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.oasp.gastronomy.restaurant.cpapmanagement.dataaccess.api.UserEntity;
import io.oasp.gastronomy.restaurant.cpapmanagement.dataaccess.api.dao.UserDao;
import io.oasp.gastronomy.restaurant.cpapmanagement.logic.api.to.UserEto;
import io.oasp.gastronomy.restaurant.cpapmanagement.logic.api.usecase.UcFindUser;
import io.oasp.gastronomy.restaurant.cpapmanagement.logic.base.usecase.AbstractUserUc;
import io.oasp.gastronomy.restaurant.general.common.api.constants.PermissionConstants;
import io.oasp.gastronomy.restaurant.general.logic.api.UseCase;

/**
 * Implementation of {@link UcFindUser}.
 *
 */
@Named
@UseCase
public class UcFindUserImpl extends AbstractUserUc implements UcFindUser {

  private static final Logger LOG = LoggerFactory.getLogger(UcFindUserImpl.class);

  /** @see #getUserDao() */
  private UserDao userDao;

  @Override
  @RolesAllowed(PermissionConstants.FIND_TABLE)
  public UserEto findUser(long id) {

    LOG.debug("Get User with id '" + id + "' from database.");

    return getBeanMapper().map(getUserDao().findOne(id), UserEto.class);

  }

  /**
   * @param cpapmanagement new value of {@link #getcpapmanagement}.
   *
   * @Inject public void setCpapmanagement(Cpapmanagement cpapmanagement) {
   *
   *         this.cpapmanagement = cpapmanagement; }
   **/

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
  @Override
  public UserDao getUserDao() {

    return this.userDao;
  }

  /**
   * Sets the field 'userDao'.
   *
   * @param userDao New value for userDao
   */
  @Override
  @Inject
  public void setUserDao(UserDao userDao) {

    this.userDao = userDao;
  }

}
