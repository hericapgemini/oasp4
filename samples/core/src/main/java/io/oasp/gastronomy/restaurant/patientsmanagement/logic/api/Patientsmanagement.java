package io.oasp.gastronomy.restaurant.patientsmanagement.logic.api;

import java.util.List;

import io.oasp.gastronomy.restaurant.patientsmanagement.logic.api.to.PatientEto;

/**
 * @author rgueye
 *
 */
public interface Patientsmanagement {
  /**
   * This method will return a {@link patienteto User} identified the given id.
   *
   * @param id is the {@link patienteto#getId() id} of the user to fetch.
   * @return the {@link patienteto user} for the given id.
   */
  PatientEto findPatient(long id);

  /**
   * @return {@link List} of all existing {@link Patienteto patients}.
   */

  List<PatientEto> findAllPatient();

  /**
   * @param patientId
   * @return
   */
  void deletePatient(long patientId);

  PatientEto addPatient(PatientEto patientEto);

}
