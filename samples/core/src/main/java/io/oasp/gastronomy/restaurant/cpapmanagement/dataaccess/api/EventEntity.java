package io.oasp.gastronomy.restaurant.cpapmanagement.dataaccess.api;

import javax.persistence.Entity;
import javax.persistence.Table;

import io.oasp.gastronomy.restaurant.cpapmanagement.common.api.Event;
import io.oasp.gastronomy.restaurant.general.dataaccess.api.ApplicationPersistenceEntity;

/**
 * @author jalbenqu
 *
 */

@Entity
// Table is a reserved word in SQL/RDBMS and can not be used as table name
@Table(name = "Evenement")
public class EventEntity extends ApplicationPersistenceEntity implements Event {
  private static final long serialVersionUID = 1L;

  private String session;

  private Double data;

  private String date;

  private String eventname;

  /**
   * The constructor.
   */
  public EventEntity() {

    super();
  }

  /**
   * @return session
   */
  public String getSession() {

    return this.session;
  }

  /**
   * @param session new value of {@link #getsession}.
   */
  public void setSession(String session) {

    this.session = session;
  }

  /**
   * @return data
   */
  public Double getData() {

    return this.data;
  }

  /**
   * @param data new value of {@link #getdata}.
   */
  public void setData(Double data) {

    this.data = data;
  }

  /**
   * @return date
   */
  public String getDate() {

    return this.date;
  }

  /**
   * @param date new value of {@link #getedate}.
   */
  public void setDate(String date) {

    this.date = date;
  }

  /**
   * @return eventname
   */
  public String getEventname() {

    return this.eventname;
  }

  /**
   * @param eventname new value of {@link #geteventname}.
   */
  public void setEventname(String eventname) {

    this.eventname = eventname;
  }

}
