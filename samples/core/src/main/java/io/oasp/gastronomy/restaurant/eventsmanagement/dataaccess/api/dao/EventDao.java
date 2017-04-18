package io.oasp.gastronomy.restaurant.eventsmanagement.dataaccess.api.dao;

import io.oasp.gastronomy.restaurant.eventsmanagement.dataaccess.api.EventEntity;
import io.oasp.gastronomy.restaurant.general.dataaccess.api.dao.ApplicationRevisionedDao;
import io.oasp.module.jpa.dataaccess.api.MasterDataDao;

/**
 * @author jalbenqu
 *
 */

/**
 * {@link ApplicationRevisionedDao Data Access Object} for {@link EventEntity} entity.
 *
 */
public interface EventDao extends ApplicationRevisionedDao<EventEntity>, MasterDataDao<EventEntity> {

}
