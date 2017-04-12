package io.oasp.gastronomy.restaurant.cpapmanagement.dataaccess.impl.dao;

import javax.inject.Named;

import io.oasp.gastronomy.restaurant.cpapmanagement.dataaccess.api.MedecinEntity;
import io.oasp.gastronomy.restaurant.cpapmanagement.dataaccess.api.dao.MedecinDao;
import io.oasp.gastronomy.restaurant.general.dataaccess.base.dao.ApplicationMasterDataDaoImpl;
import io.oasp.gastronomy.restaurant.offermanagement.dataaccess.api.dao.DrinkDao;

/**
 * @author vanguyen
 *
 */

/**
 * Implementation of {@link DrinkDao}.
 *
 */
@Named
public class MedecinDaolmpl extends ApplicationMasterDataDaoImpl<MedecinEntity> implements MedecinDao {

  /**
   * The constructor.
   */
  public MedecinDaolmpl() {

    super();
  }

  @Override
  protected Class<MedecinEntity> getEntityClass() {

    return MedecinEntity.class;
  }

}
