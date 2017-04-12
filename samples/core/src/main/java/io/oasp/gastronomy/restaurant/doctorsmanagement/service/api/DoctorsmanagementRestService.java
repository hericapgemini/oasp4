package io.oasp.gastronomy.restaurant.doctorsmanagement.service.api;

import java.util.List;

import javax.inject.Named;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import io.oasp.gastronomy.restaurant.doctorsmanagement.logic.api.to.DoctorEto;
import io.oasp.gastronomy.restaurant.general.common.api.RestService;

/**
 * @author redjekou
 *
 */
@Path("/doctormanagement/v1/doctor")
@Named("DoctorsmanagementRestService")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public interface DoctorsmanagementRestService extends RestService {

  /**
   *
   *
   * @param doctorId specified for the doctor
   * @return the doctor
   */
  @Path("{doctorId}/")
  @GET
  DoctorEto findDoctor(@PathParam("doctorId") long doctorId);

  /**
   * @return a list of all {@link DoctorEto}
   *
   */
  @GET
  @Path("/")
  List<DoctorEto> getAllDoctor();

}
