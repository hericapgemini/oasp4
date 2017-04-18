package io.oasp.gastronomy.restaurant.general.common.base;

import javax.inject.Inject;

import io.oasp.gastronomy.restaurant.cpapmanagement.dataaccess.api.MedecinEntity;
import io.oasp.gastronomy.restaurant.cpapmanagement.logic.api.to.MedecinEto;
import io.oasp.module.beanmapping.common.api.BeanMapper;

/**
 * This abstract class provides {@link #getBeanMapper() access} to the {@link BeanMapper}.
 *
 */
public abstract class AbstractBeanMapperSupport {

  /** @see #getBeanMapper() */
  private BeanMapper beanMapper;

  /**
   * @param beanMapper is the {@link BeanMapper} to {@link Inject}
   */
  @Inject
  public void setBeanMapper(BeanMapper beanMapper) {

    this.beanMapper = beanMapper;
  }

  /**
   * @return the {@link BeanMapper} instance.
   */
  protected BeanMapper getBeanMapper() {

    return this.beanMapper;
  }

  /**
   * @param doctorID
   * @return
   */

  public MedecinEto addMedecin(MedecinEto doctorID) {

    return this.beanMapper.map(doctorID, MedecinEto.class);
  }

  /**
   * @param doctorID
   * @return
   */
  public MedecinEntity updateDoctor(MedecinEntity doctorID) {

    return this.beanMapper.map(doctorID, MedecinEntity.class);
  }

}
