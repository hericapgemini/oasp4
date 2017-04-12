package io.oasp.gastronomy.restaurant.doctorsmanagement.logic.api;

import java.util.List;

import io.oasp.gastronomy.restaurant.doctorsmanagement.logic.api.to.DoctorEto;

/**
 * Interface for DoctorManagement.
 *
 */
public interface Doctorsmanagement {
  /**
   * This method will return a {@link DoctorEto Doctor} identified the given id.
   *
   * @param id is the {@link DoctorEto#getId() id} of the doctor to fetch.
   * @return the {@link DoctorEto doctor} for the given id.
   */
  DoctorEto findDoctor(long id);

  /**
   * @return {@link List} of all existing {@link DoctorEto doctors}.
   */

  List<DoctorEto> findAllDoctor();
}
