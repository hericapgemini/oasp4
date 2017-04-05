package io.oasp.gastronomy.restaurant.cpapmanagement.logic.impl.usecase;

import java.util.Objects;

import javax.inject.Inject;
import javax.inject.Named;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.oasp.gastronomy.restaurant.cpapmanagement.dataaccess.api.UserEntity;
import io.oasp.gastronomy.restaurant.cpapmanagement.logic.api.Cpapmanagement;
import io.oasp.gastronomy.restaurant.cpapmanagement.logic.api.to.UserEto;
import io.oasp.gastronomy.restaurant.cpapmanagement.logic.api.usecase.UcFindUser;
import io.oasp.gastronomy.restaurant.cpapmanagement.logic.api.usecase.UcSaveUser;
import io.oasp.gastronomy.restaurant.cpapmanagement.logic.base.usecase.AbstractUserUc;
import io.oasp.gastronomy.restaurant.general.logic.api.UseCase;

/**
 * Implementation of {@link UcFindUser}.
 *
 */
@Named
@UseCase
public class UcSaveUserImpl extends AbstractUserUc implements UcSaveUser {

  private static final Logger LOG = LoggerFactory.getLogger(UcSaveUserImpl.class);

  private Cpapmanagement cpapmanagement;

  @Override
  // @RolesAllowed(PermissionConstants.SAVE_USER)
  public void saveUser(UserEto user) {

    Objects.requireNonNull(user, "user");

    UserEntity persistedUser = getUserDao().save(getBeanMapper().map(user, UserEntity.class));
    // return getBeanMapper().map(persistedUser, UserEto.class);
  }

  /**
   * @param cpapmanagement new value of {@link #getcpapmanagement}.
   */
  @Inject
  public void setCpapmanagement(Cpapmanagement cpapmanagement) {

    this.cpapmanagement = cpapmanagement;
  }

}
