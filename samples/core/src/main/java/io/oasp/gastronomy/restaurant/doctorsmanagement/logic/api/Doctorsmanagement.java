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

  /**
   * Creates or updates a {@link DoctorEto}.
   *
   * @param staffMember The {@link DoctorEto} to create or update.
   * @return the saved {@link DoctorEto}
   */
  DoctorEto saveDoctor(DoctorEto doctor);

  /**
   * Delete a Doctor
   *
   * doctorId the {@link DoctorEto#getId() ID} of a {@link DoctorEto} to delete.
   */
  void deleteDoctor(long doctorId);

}
