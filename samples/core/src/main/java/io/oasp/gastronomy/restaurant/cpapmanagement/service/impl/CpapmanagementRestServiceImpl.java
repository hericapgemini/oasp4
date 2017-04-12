package io.oasp.gastronomy.restaurant.cpapmanagement.service.impl;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import io.oasp.gastronomy.restaurant.cpapmanagement.logic.api.Cpapmanagement;
import io.oasp.gastronomy.restaurant.cpapmanagement.logic.api.to.MedecinEto;
import io.oasp.gastronomy.restaurant.cpapmanagement.logic.api.to.UserEto;
import io.oasp.gastronomy.restaurant.cpapmanagement.service.api.CpapmanagementRestService;

/**
 */
@Named("CpapmanagementRestService")
public class CpapmanagementRestServiceImpl implements CpapmanagementRestService {

  private Cpapmanagement cpapmanagement;

  @Override
  public UserEto findUser(long userId) {

    return this.cpapmanagement.findUser(userId);

  }

  /**
   * This method sets the field <tt>cpapmanagement</tt>.
   *
   * @param cpapmanagement the new value of the field cpapmanagement
   */
  @Inject
  public void setCpapmanagement(Cpapmanagement cpapmanagement) {

    this.cpapmanagement = cpapmanagement;
  }

  @Override
  public List<UserEto> getAllUser() {

    return this.cpapmanagement.findAllUser();
  }

  public MedecinEto findMedecin(long MedecinId) {

    return this.cpapmanagement.findMedecin(MedecinId);
  }

  @Override
  public List<MedecinEto> getAllMedecin() {

    return this.cpapmanagement.findAllMedecin();
  }

}
