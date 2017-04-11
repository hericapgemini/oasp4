package io.oasp.gastronomy.restaurant.doctorsmanagement.dataaccess.api.dao;

import io.oasp.gastronomy.restaurant.doctorsmanagement.dataaccess.api.DoctorEntity;
import io.oasp.gastronomy.restaurant.general.dataaccess.api.dao.ApplicationRevisionedDao;
import io.oasp.module.jpa.dataaccess.api.MasterDataDao;

/**
 * {@link ApplicationRevisionedDao Data Access Object} for {@link DoctorEntity} entity.
 *
 */
public interface DoctorDao extends ApplicationRevisionedDao<DoctorEntity>, MasterDataDao<DoctorEntity> {

}
