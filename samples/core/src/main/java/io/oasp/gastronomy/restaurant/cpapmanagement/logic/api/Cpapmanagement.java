package io.oasp.gastronomy.restaurant.cpapmanagement.logic.api;

import java.util.List;

import io.oasp.gastronomy.restaurant.cpapmanagement.dataaccess.api.MedecinEntity;
import io.oasp.gastronomy.restaurant.cpapmanagement.logic.api.to.MedecinEto;
import io.oasp.gastronomy.restaurant.cpapmanagement.logic.api.to.UserEto;

/**
 * Interface for CpapManagement.
 *
 */
public interface Cpapmanagement {

  /**
   * This method will return a {@link UserEto User} identified the given id.
   *
   * @param id is the {@link UserEto#getId() id} of the user to fetch.
   * @return the {@link UserEto user} for the given id.
   */
  UserEto findUser(long id);

  /**
   * @return {@link List} of all existing {@link UserEto users}.
   */

  List<UserEto> findAllUser();

  /**
   * This method will return a {@link MedecinEto Medecin} identified the given id.
   *
   * @param id is the {@link MedecinEto#getId() id} of the Medecin to fetch.
   * @return the {@link MedecinEto Medecin} for the given id.
   */
  MedecinEto findMedecin(long id);

  /**
   * @return {@link List} of all existing {@link MedecinEto Medecin}.
   */

  List<MedecinEto> findAllMedecin();

  /**
   * POST Create or autre
   *
   * @return new doctor
   */

  MedecinEto addMedecin(MedecinEto doctorID);

  /**
   * delete
   *
   */

  void deleteMedecin(long MedecinID);

  /**
   * update PUT update Doctors
   *
   */

  MedecinEntity updateDoctor(MedecinEntity DoctorID);

}
