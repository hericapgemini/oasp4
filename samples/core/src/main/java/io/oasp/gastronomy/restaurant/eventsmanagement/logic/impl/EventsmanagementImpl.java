package io.oasp.gastronomy.restaurant.eventsmanagement.logic.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.security.RolesAllowed;
import javax.inject.Inject;
import javax.inject.Named;
import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import io.oasp.gastronomy.restaurant.cpapmanagement.dataaccess.api.dao.UserDao;
import io.oasp.gastronomy.restaurant.eventsmanagement.dataaccess.api.EventEntity;
import io.oasp.gastronomy.restaurant.eventsmanagement.dataaccess.api.dao.EventDao;
import io.oasp.gastronomy.restaurant.eventsmanagement.logic.api.Eventsmanagement;
import io.oasp.gastronomy.restaurant.eventsmanagement.logic.api.to.EventEto;
import io.oasp.gastronomy.restaurant.general.common.api.constants.PermissionConstants;
import io.oasp.gastronomy.restaurant.general.logic.base.AbstractComponentFacade;

/**
 * @author jalbenqu
 *
 */

@Named
@Transactional
@Component
public class EventsmanagementImpl extends AbstractComponentFacade implements Eventsmanagement {

  private static final Logger LOG = LoggerFactory.getLogger(EventsmanagementImpl.class);

  private EventDao eventDao;

  @Override
  @RolesAllowed(PermissionConstants.FIND_TABLE)
  public EventEto findEvent(long id) {

    LOG.debug("Get User with id '" + id + "' from database.");

    return getBeanMapper().map(getEventDao().findOne(id), EventEto.class);

  }

  @Override
  @RolesAllowed(PermissionConstants.FIND_TABLE)
  public List<EventEto> findAllEvent() {

    List<EventEntity> events = getEventDao().findAll();
    List<EventEto> eventsBo = new ArrayList<>();

    for (EventEntity event : events) {
      eventsBo.add(getBeanMapper().map(event, EventEto.class));
    }

    return eventsBo;
  }

  /**
   * @return the {@link UserDao} instance.
   */

  public EventDao getEventDao() {

    return this.eventDao;
  }

  /**
   * Sets the field 'userDao'.
   *
   * @param eventDao New value for eventDao
   */

  @Inject
  public void setEventDao(EventDao eventDao) {

    this.eventDao = eventDao;
  }

  /**
   * The constructor.
   */
  public EventsmanagementImpl() {

    super();
  }

}