package io.oasp.gastronomy.restaurant.patientsmanagement.dataaccess.api.dao;

import io.oasp.gastronomy.restaurant.general.dataaccess.api.dao.ApplicationRevisionedDao;
import io.oasp.gastronomy.restaurant.patientsmanagement.dataaccess.api.PatientEntity;
import io.oasp.module.jpa.dataaccess.api.MasterDataDao;

/**
 * @author rgueye
 *
 */
public interface PatientDao extends ApplicationRevisionedDao<PatientEntity>, MasterDataDao<PatientEntity> {

}
