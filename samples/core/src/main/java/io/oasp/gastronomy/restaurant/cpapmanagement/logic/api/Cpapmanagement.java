package io.oasp.gastronomy.restaurant.cpapmanagement.logic.api;

import java.util.List;

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

}
