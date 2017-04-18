package io.oasp.gastronomy.restaurant.eventsmanagement.logic.api;

import java.util.List;

import io.oasp.gastronomy.restaurant.eventsmanagement.logic.api.to.EventEto;

/**
 * @author jalbenqu
 *
 */
public interface Eventsmanagement {
  /**
   * This method will return a {@link eventeto User} identified the given id.
   *
   * @param id is the {@link eventeto#getId() id} of the user to fetch.
   * @return the {@link eventeto user} for the given id.
   */
  EventEto findEvent(long id);

  /**
   * @return {@link List} of all existing {@link Eventeto events}.
   */

  List<EventEto> findAllEvent();

}
