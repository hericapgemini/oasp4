package io.oasp.gastronomy.restaurant.cpapmanagement.service.api;

import java.util.List;

import javax.inject.Named;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import io.oasp.gastronomy.restaurant.cpapmanagement.logic.api.Cpapmanagement;
import io.oasp.gastronomy.restaurant.cpapmanagement.logic.api.to.UserEto;
import io.oasp.gastronomy.restaurant.general.common.api.RestService;
import io.oasp.gastronomy.restaurant.staffmanagement.logic.api.to.StaffMemberEto;

/**
 *
 * The service class for REST calls in order to execute the methods in {@link Cpapmanagement}.
 *
 */

@Path("/cpapmanagement/v1/user")
@Named("CpapmanagementRestService")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public interface CpapmanagementRestService extends RestService {

  /**
   * Delegates to {@link UcFindUser#findUser}.
   *
   * @param userId specified for the user
   * @return the user
   */
  @Path("{userId}/")
  @GET
  UserEto findUser(@PathParam("userId") long userId);

  /**
   * @return a list of all {@link StaffMemberEto}
   *
   */
  @GET
  @Path("/")
  List<UserEto> getAllUser();

}
