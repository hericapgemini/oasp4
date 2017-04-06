package io.oasp.gastronomy.restaurant.cpapmanagement.logic.api.usecase;

import io.oasp.gastronomy.restaurant.cpapmanagement.logic.api.to.UserEto;

/**
 * Interface of {@link io.oasp.gastronomy.restaurant.general.logic.base.AbstractUc use case} to get specific or all
 * {@link UserEto users}.
 *
 */
public interface UcFindUser {

  /**
   * This method will return a {@link UserEto User} identified the given id.
   *
   * @param id is the {@link UserEto#getId() id} of the user to fetch.
   * @return the {@link UserEto user} for the given id.
   */
  UserEto findUser(long id);

}
