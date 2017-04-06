package io.oasp.gastronomy.restaurant.cpapmanagement.logic.api.usecase;

import javax.validation.Valid;

import io.oasp.gastronomy.restaurant.cpapmanagement.logic.api.to.UserEto;

/**
 * Interface of {@link io.oasp.gastronomy.restaurant.general.logic.base.AbstractUc use case} to get specific or all
 * {@link UserEto users}.
 *
 */
public interface UcSaveUser {

  /**
   * This method save the user.
   *
   * @param user is the {@link UserEto#getId() id} of the user to fetch.
   *
   */
  void saveUser(@Valid UserEto user);
}
