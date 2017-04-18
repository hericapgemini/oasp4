package io.oasp.gastronomy.restaurant.eventsmanagement.dataaccess.impl.dao;

import javax.inject.Named;

import io.oasp.gastronomy.restaurant.eventsmanagement.dataaccess.api.EventEntity;
import io.oasp.gastronomy.restaurant.eventsmanagement.dataaccess.api.dao.EventDao;
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
@Named
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
