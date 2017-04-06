package io.oasp.gastronomy.restaurant.cpapmanagement.logic.base.usecase;

import javax.inject.Inject;

import io.oasp.gastronomy.restaurant.cpapmanagement.dataaccess.api.dao.UserDao;
import io.oasp.gastronomy.restaurant.general.logic.base.AbstractUc;

/**
 *
 */
public abstract class AbstractUserUc extends AbstractUc {

  /** @see #getUserDao() */
  private UserDao userDao;

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

}
