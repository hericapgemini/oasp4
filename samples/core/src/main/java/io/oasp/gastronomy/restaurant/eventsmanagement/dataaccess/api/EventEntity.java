package io.oasp.gastronomy.restaurant.eventsmanagement.dataaccess.api;

import javax.persistence.Entity;
import javax.persistence.Table;

import io.oasp.gastronomy.restaurant.eventsmanagement.common.api.Event;
import io.oasp.gastronomy.restaurant.general.dataaccess.api.ApplicationPersistenceEntity;

/**
 * @author jalbenqu
 *
 */

@Entity
// Table is a reserved word in SQL/RDBMS and can not be used as table name
@Table(name = "evenement")
public class EventEntity extends ApplicationPersistenceEntity implements Event {
  private static final long serialVersionUID = 1L;

  private int session;

  private Double data;

  private String dateEvent;

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
  public int getSession() {

    return this.session;
  }

  /**
   * @param session new value of {@link #getsession}.
   */
  public void setSession(int session) {

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
   * @return dateEvent
   */
  public String getDateEvent() {

    return this.dateEvent;
  }

  /**
   * @param date new value of {@link #getdateEvent}.
   */
  public void setDateEvent(String dateEvent) {

    this.dateEvent = dateEvent;
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
