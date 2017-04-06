package io.oasp.gastronomy.restaurant.cpapmanagement.dataaccess.api.dao;

import io.oasp.gastronomy.restaurant.cpapmanagement.dataaccess.api.UserEntity;
import io.oasp.gastronomy.restaurant.general.dataaccess.api.dao.ApplicationRevisionedDao;
import io.oasp.module.jpa.dataaccess.api.MasterDataDao;

/**
 * {@link ApplicationRevisionedDao Data Access Object} for {@link UserEntity} entity.
 *
 */
public interface UserDao extends ApplicationRevisionedDao<UserEntity>, MasterDataDao<UserEntity> {

}
