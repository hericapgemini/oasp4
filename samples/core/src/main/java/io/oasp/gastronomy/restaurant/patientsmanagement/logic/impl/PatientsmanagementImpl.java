package io.oasp.gastronomy.restaurant.patientsmanagement.logic.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.security.RolesAllowed;
import javax.inject.Inject;
import javax.inject.Named;
import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import io.oasp.gastronomy.restaurant.cpapmanagement.dataaccess.api.dao.UserDao;
import io.oasp.gastronomy.restaurant.general.common.api.constants.PermissionConstants;
import io.oasp.gastronomy.restaurant.general.logic.base.AbstractComponentFacade;
import io.oasp.gastronomy.restaurant.patientsmanagement.dataaccess.api.PatientEntity;
import io.oasp.gastronomy.restaurant.patientsmanagement.dataaccess.api.dao.PatientDao;
import io.oasp.gastronomy.restaurant.patientsmanagement.logic.api.Patientsmanagement;
import io.oasp.gastronomy.restaurant.patientsmanagement.logic.api.to.PatientEto;

/**
 * @author rgueye
 *
 */

@Named
@Transactional
@Component
public class PatientsmanagementImpl extends AbstractComponentFacade implements Patientsmanagement {

  private static final Logger LOG = LoggerFactory.getLogger(PatientsmanagementImpl.class);

  private PatientDao patientDao;

  /**
   * The constructor.
   */
  public PatientsmanagementImpl() {

    super();
  }

  @Override
  @RolesAllowed(PermissionConstants.FIND_TABLE)
  public PatientEto findPatient(long id) {

    LOG.debug("Get User with id '" + id + "' from database.");

    return getBeanMapper().map(getPatientDao().findOne(id), PatientEto.class);

  }

  @Override
  public void deletePatient(long id) {

    LOG.debug("Get User with id '" + id + "' from database.");

    getPatientDao().delete(id);
  }

  @Override
  @RolesAllowed(PermissionConstants.FIND_TABLE)
  public List<PatientEto> findAllPatient() {

    List<PatientEntity> patients = getPatientDao().findAll();
    List<PatientEto> patientsBo = new ArrayList<>();

    for (PatientEntity patient : patients) {
      patientsBo.add(getBeanMapper().map(patient, PatientEto.class));
    }

    return patientsBo;
  }

  /**
   * @return the {@link UserDao} instance.
   */

  public PatientDao getPatientDao() {

    return this.patientDao;
  }

  /**
   * Sets the field 'userDao'.
   *
   * @param patientDao New value for patientDao
   */

  @Inject
  public void setPatientDao(PatientDao patientDao) {

    this.patientDao = patientDao;
  }
}
