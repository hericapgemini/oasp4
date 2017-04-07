package io.oasp.gastronomy.restaurant.cpapmanagement.dataaccess.impl.dao;

import io.oasp.gastronomy.restaurant.cpapmanagement.dataaccess.api.EventEntity;
import io.oasp.gastronomy.restaurant.cpapmanagement.dataaccess.api.dao.EventDao;
import io.oasp.gastronomy.restaurant.general.dataaccess.base.dao.ApplicationMasterDataDaoImpl;
import io.oasp.gastronomy.restaurant.offermanagement.dataaccess.api.dao.DrinkDao;

/**
 * @author jalbenqu
 *
 */

/**
 * Implementation of {@link DrinkDao}.
 *
 */
public class EventDaoImpl extends ApplicationMasterDataDaoImpl<EventEntity> implements EventDao {
  /**
   * The constructor.
   */
  public EventDaoImpl() {

    super();
  }

  @Override
  protected Class<EventEntity> getEntityClass() {

    return EventEntity.class;
  }

}
