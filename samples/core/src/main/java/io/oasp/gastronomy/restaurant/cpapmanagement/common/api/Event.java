package io.oasp.gastronomy.restaurant.cpapmanagement.common.api;

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
  public String getDate();

  /**
   * @param date new value of {@link #getedate}.
   */
  public void setDate(String date);

  /**
   * @return eventname
   */
  public String getEventname();

  /**
   * @param eventname new value of {@link #geteventname}.
   */
  public void setEventname(String eventname);

}
