package io.oasp.gastronomy.restaurant.cpapmanagement.dataaccess.api.dao;

import io.oasp.gastronomy.restaurant.cpapmanagement.dataaccess.api.MedecinEntity;
import io.oasp.gastronomy.restaurant.general.dataaccess.api.dao.ApplicationRevisionedDao;
import io.oasp.module.jpa.dataaccess.api.MasterDataDao;

/**
 * {@link ApplicationRevisionedDao Data Access Object} for {@link MedecinEntity} entity.
 *
 */
public interface MedecinDao extends ApplicationRevisionedDao<MedecinEntity>, MasterDataDao<MedecinEntity> {

}
