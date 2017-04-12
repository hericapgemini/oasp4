package io.oasp.gastronomy.restaurant.doctorsmanagement.dataaccess.impl.dao;

import javax.inject.Named;

import io.oasp.gastronomy.restaurant.doctorsmanagement.dataaccess.api.DoctorEntity;
import io.oasp.gastronomy.restaurant.doctorsmanagement.dataaccess.api.dao.DoctorDao;
import io.oasp.gastronomy.restaurant.general.dataaccess.base.dao.ApplicationMasterDataDaoImpl;
import io.oasp.gastronomy.restaurant.offermanagement.dataaccess.api.dao.DrinkDao;

/**
 * Implementation of {@link DrinkDao}.
 *
 */
@Named
public class DoctorDaoImpl extends ApplicationMasterDataDaoImpl<DoctorEntity> implements DoctorDao {

  /**
   * The constructor.
   */
  public DoctorDaoImpl() {

    super();
  }

  @Override
  protected Class<DoctorEntity> getEntityClass() {

    return DoctorEntity.class;
  }
}
