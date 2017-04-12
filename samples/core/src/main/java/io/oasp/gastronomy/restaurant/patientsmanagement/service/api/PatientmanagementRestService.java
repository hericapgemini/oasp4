package io.oasp.gastronomy.restaurant.patientsmanagement.service.api;

import java.util.List;

import javax.inject.Named;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import io.oasp.gastronomy.restaurant.general.common.api.RestService;
import io.oasp.gastronomy.restaurant.patientsmanagement.logic.api.to.PatientEto;

/**
 * @author rgueye
 *
 */

@Path("/patientmanagement/v1/patient")
@Named("PatientmanagementRestService")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public interface PatientmanagementRestService extends RestService {

  /**
   *
   *
   * @param patientId specified for the patient
   * @return the patient
   */

  @GET
  @Path("/{patientId}/")
  PatientEto findPatient(@PathParam("patientId") long patientId);

  /**
   * @return a list of all {@link PatientEto}
   *
   */
  @GET
  @Path("/")
  List<PatientEto> getAllPatient();

}
