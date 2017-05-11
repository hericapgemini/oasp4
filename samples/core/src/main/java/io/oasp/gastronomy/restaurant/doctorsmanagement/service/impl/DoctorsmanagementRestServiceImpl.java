package io.oasp.gastronomy.restaurant.doctorsmanagement.service.impl;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import io.oasp.gastronomy.restaurant.doctorsmanagement.logic.api.Doctorsmanagement;
import io.oasp.gastronomy.restaurant.doctorsmanagement.logic.api.to.DoctorEto;
import io.oasp.gastronomy.restaurant.doctorsmanagement.service.api.DoctorsmanagementRestService;

/**
 * @author redjekou
 *
 */
@Named("DoctorsmanagementRestService")
public class DoctorsmanagementRestServiceImpl implements DoctorsmanagementRestService {

  private Doctorsmanagement doctorsmanagement;

  @Override
  public DoctorEto findDoctor(long doctorId) {

    return this.doctorsmanagement.findDoctor(doctorId);

  }

  /**
   * This method sets the field <tt>doctorsmanagement</tt>.
   *
   * @param doctorsmanagement the new value of the field doctorsmanagement
   */
  @Inject
  public void setDoctorsmanagement(Doctorsmanagement doctorsmanagement) {

    this.doctorsmanagement = doctorsmanagement;
  }

  @Override
  public List<DoctorEto> getAllDoctor() {

    return this.doctorsmanagement.findAllDoctor();
  }

  @Override
  public DoctorEto saveDoctor(DoctorEto doctorEto) {

    return this.doctorsmanagement.saveDoctor(doctorEto);
  }

  @Override
  public void deleteDoctor(long doctorId) {

    this.doctorsmanagement.deleteDoctor(doctorId);
  }
}
