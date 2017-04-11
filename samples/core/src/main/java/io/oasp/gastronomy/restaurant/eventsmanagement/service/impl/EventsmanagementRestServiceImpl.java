package io.oasp.gastronomy.restaurant.eventsmanagement.service.impl;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import io.oasp.gastronomy.restaurant.eventsmanagement.logic.api.Eventsmanagement;
import io.oasp.gastronomy.restaurant.eventsmanagement.logic.api.to.EventEto;
import io.oasp.gastronomy.restaurant.eventsmanagement.service.api.EventsmanagementRestService;

/**
 * @author jalbenqu
 *
 */

@Named("EventsmanagementRestService")
public class EventsmanagementRestServiceImpl implements EventsmanagementRestService {

  private Eventsmanagement eventsmanagement;

  @Override
  public EventEto findEvent(long eventId) {

    return this.eventsmanagement.findEvent(eventId);

  }

  /**
   * This method sets the field <tt>eventsmanagement</tt>.
   *
   * @param cpapmanagement the new value of the field eventsmanagement
   */
  @Inject
  public void setEventsmanagement(Eventsmanagement eventsmanagement) {

    this.eventsmanagement = eventsmanagement;
  }

  @Override
  public List<EventEto> getAllEvent() {

    return this.eventsmanagement.findAllEvent();
  }

}
