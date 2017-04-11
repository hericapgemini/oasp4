package io.oasp.gastronomy.restaurant.eventsmanagement.common.api;

import io.oasp.gastronomy.restaurant.general.common.api.ApplicationEntity;

/**
 * @author jalbenqu
 *
 */
public interface Event extends ApplicationEntity {
  /**
   * @return session
   */
  public int getSession();

  /**
   * @param session new value of {@link #getsession}.
   */
  public void setSession(int session);

  /**
   * @return data
   */
  public Double getData();

  /**
   * @param data new value of {@link #getdata}.
   */
  public void setData(Double data);

  /**
   * @return date
   */
  public String getDateEvent();

  /**
   * @param date new value of {@link #getedateEvent}.
   */
  public void setDateEvent(String dateEvent);

  /**
   * @return eventname
   */
  public String getEventname();

  /**
   * @param eventname new value of {@link #geteventname}.
   */
  public void setEventname(String eventname);

}
