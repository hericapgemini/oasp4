package io.oasp.gastronomy.restaurant.eventsmanagement.service.api;

import java.util.List;

import javax.inject.Named;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import io.oasp.gastronomy.restaurant.eventsmanagement.logic.api.to.EventEto;
import io.oasp.gastronomy.restaurant.general.common.api.RestService;

/**
 * @author jalbenqu
 *
 */

@Path("/eventmanagement/v1/event")
@Named("EventsmanagementRestService")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public interface EventsmanagementRestService extends RestService {

  /**
   *
   *
   * @param eventId specified for the event
   * @return the event
   */
  @Path("{eventId}/")
  @GET
  EventEto findEvent(@PathParam("eventId") long eventId);

  /**
   * @return a list of all {@link EventEto}
   *
   */
  @GET
  @Path("/")
  List<EventEto> getAllEvent();

}
