package io.oasp.gastronomy.restaurant.patientsmanagement.service.impl;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import io.oasp.gastronomy.restaurant.patientsmanagement.logic.api.Patientsmanagement;
import io.oasp.gastronomy.restaurant.patientsmanagement.logic.api.to.PatientEto;
import io.oasp.gastronomy.restaurant.patientsmanagement.service.api.PatientmanagementRestService;

/**
 * @author rgueye
 *
 */

@Named("PatientsmanagementRestService")
public class PatientmanagementRestServiceImpl implements PatientmanagementRestService {

  private Patientsmanagement patientsmanagement;

  @Override
  public PatientEto findPatient(long patientId) {

    return this.patientsmanagement.findPatient(patientId);

  }

  /**
   * This method sets the field <tt>patientsmanagement</tt>.
   *
   * @param cpapmanagement the new value of the field patientsmanagement
   */
  @Inject
  public void setPatientsmanagement(Patientsmanagement patientsmanagement) {

    this.patientsmanagement = patientsmanagement;
  }

  @Override
  public List<PatientEto> getAllPatient() {

    return this.patientsmanagement.findAllPatient();
  }

}
