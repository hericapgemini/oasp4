package io.oasp.gastronomy.restaurant.patientsmanagement.dataaccess.impl.dao;

import javax.inject.Named;

import io.oasp.gastronomy.restaurant.general.dataaccess.base.dao.ApplicationMasterDataDaoImpl;
import io.oasp.gastronomy.restaurant.patientsmanagement.dataaccess.api.PatientEntity;
import io.oasp.gastronomy.restaurant.patientsmanagement.dataaccess.api.dao.PatientDao;

/**
 * @author rgueye
 *
 */
@Named
public class PatientDaoImpl extends ApplicationMasterDataDaoImpl<PatientEntity> implements PatientDao {

  /**
   * The constructor.
   */
  public PatientDaoImpl() {
    super();
  }

  /**
   * @return PatientEntity.class
   */
  @Override
  protected Class<PatientEntity> getEntityClass() {

    return PatientEntity.class;
  }

}
