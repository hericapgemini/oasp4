package io.oasp.gastronomy.restaurant.cpapmanagement.logic.impl.usecase;

import javax.annotation.security.RolesAllowed;
import javax.inject.Inject;
import javax.inject.Named;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.oasp.gastronomy.restaurant.cpapmanagement.logic.api.Cpapmanagement;
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

  private Cpapmanagement cpapmanagement;

  @Override
  @RolesAllowed(PermissionConstants.FIND_TABLE)
  public UserEto findUser(long id) {

    LOG.debug("Get User with id '" + id + "' from database.");

    return getBeanMapper().map(getUserDao().findOne(id), UserEto.class);

  }

  /**
   * @param cpapmanagement new value of {@link #getcpapmanagement}.
   */
  @Inject
  public void setCpapmanagement(Cpapmanagement cpapmanagement) {

    this.cpapmanagement = cpapmanagement;
  }

}
