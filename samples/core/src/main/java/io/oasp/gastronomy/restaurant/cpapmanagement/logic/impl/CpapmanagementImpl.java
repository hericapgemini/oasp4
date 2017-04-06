package io.oasp.gastronomy.restaurant.cpapmanagement.logic.impl;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;
import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.oasp.gastronomy.restaurant.cpapmanagement.logic.api.Cpapmanagement;
import io.oasp.gastronomy.restaurant.cpapmanagement.logic.api.to.UserEto;
import io.oasp.gastronomy.restaurant.cpapmanagement.logic.api.usecase.UcFindUser;
import io.oasp.gastronomy.restaurant.cpapmanagement.logic.api.usecase.UcSaveUser;
import io.oasp.gastronomy.restaurant.general.logic.api.UseCase;
import io.oasp.gastronomy.restaurant.general.logic.base.AbstractComponentFacade;

/**
 * Implementation class for {@link Cpapmanagement}.
 *
 */
@Named
@Transactional
public class CpapmanagementImpl extends AbstractComponentFacade implements Cpapmanagement {

  private static final Logger LOG = LoggerFactory.getLogger(CpapmanagementImpl.class);

  private UcFindUser ucFindUser;

  private UcSaveUser ucSaveUser;

  /**
   * The constructor.
   */
  public CpapmanagementImpl() {

    super();
  }

  @Override
  public void saveUser(UserEto user) {

    System.out.println(user);

    this.ucSaveUser.saveUser(user);

  }

  @Override
  public UserEto findUser(long id) {

    return this.ucFindUser.findUser(id);
  }

  /**
   * @param ucFindUser new value of {@link #getucFindUser}.
   */
  @Inject
  @UseCase
  public void setUcFindUser(UcFindUser ucFindUser) {

    this.ucFindUser = ucFindUser;
  }

  /**
   * @param ucSaveUser new value of {@link #getucSaveUser}.
   */
  @Inject
  @UseCase
  public void setUcSaveUser(UcSaveUser ucSaveUser) {

    this.ucSaveUser = ucSaveUser;
  }

  @Override
  public List<UserEto> findAllUser() {

    // TODO Auto-generated method stub
    return this.ucFindUser.findAllUser();
  }

}
