/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.portlet.mobiledevicerules.service.base;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.bean.IdentifiableBean;
import com.liferay.portal.kernel.dao.db.DB;
import com.liferay.portal.kernel.dao.db.DBFactoryUtil;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.service.BaseServiceImpl;
import com.liferay.portal.service.persistence.SystemEventPersistence;
import com.liferay.portal.service.persistence.UserFinder;
import com.liferay.portal.service.persistence.UserPersistence;
import com.liferay.portal.util.PortalUtil;

import com.liferay.portlet.mobiledevicerules.model.MDRRule;
import com.liferay.portlet.mobiledevicerules.service.MDRRuleService;
import com.liferay.portlet.mobiledevicerules.service.persistence.MDRRuleGroupFinder;
import com.liferay.portlet.mobiledevicerules.service.persistence.MDRRuleGroupPersistence;
import com.liferay.portlet.mobiledevicerules.service.persistence.MDRRulePersistence;

import javax.sql.DataSource;

/**
 * Provides the base implementation for the m d r rule remote service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.liferay.portlet.mobiledevicerules.service.impl.MDRRuleServiceImpl}.
 * </p>
 *
 * @author Edward C. Han
 * @see com.liferay.portlet.mobiledevicerules.service.impl.MDRRuleServiceImpl
 * @see com.liferay.portlet.mobiledevicerules.service.MDRRuleServiceUtil
 * @generated
 */
public abstract class MDRRuleServiceBaseImpl extends BaseServiceImpl
	implements MDRRuleService, IdentifiableBean {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link com.liferay.portlet.mobiledevicerules.service.MDRRuleServiceUtil} to access the m d r rule remote service.
	 */

	/**
	 * Returns the m d r rule local service.
	 *
	 * @return the m d r rule local service
	 */
	public com.liferay.portlet.mobiledevicerules.service.MDRRuleLocalService getMDRRuleLocalService() {
		return mdrRuleLocalService;
	}

	/**
	 * Sets the m d r rule local service.
	 *
	 * @param mdrRuleLocalService the m d r rule local service
	 */
	public void setMDRRuleLocalService(
		com.liferay.portlet.mobiledevicerules.service.MDRRuleLocalService mdrRuleLocalService) {
		this.mdrRuleLocalService = mdrRuleLocalService;
	}

	/**
	 * Returns the m d r rule remote service.
	 *
	 * @return the m d r rule remote service
	 */
	public com.liferay.portlet.mobiledevicerules.service.MDRRuleService getMDRRuleService() {
		return mdrRuleService;
	}

	/**
	 * Sets the m d r rule remote service.
	 *
	 * @param mdrRuleService the m d r rule remote service
	 */
	public void setMDRRuleService(
		com.liferay.portlet.mobiledevicerules.service.MDRRuleService mdrRuleService) {
		this.mdrRuleService = mdrRuleService;
	}

	/**
	 * Returns the m d r rule persistence.
	 *
	 * @return the m d r rule persistence
	 */
	public MDRRulePersistence getMDRRulePersistence() {
		return mdrRulePersistence;
	}

	/**
	 * Sets the m d r rule persistence.
	 *
	 * @param mdrRulePersistence the m d r rule persistence
	 */
	public void setMDRRulePersistence(MDRRulePersistence mdrRulePersistence) {
		this.mdrRulePersistence = mdrRulePersistence;
	}

	/**
	 * Returns the counter local service.
	 *
	 * @return the counter local service
	 */
	public com.liferay.counter.service.CounterLocalService getCounterLocalService() {
		return counterLocalService;
	}

	/**
	 * Sets the counter local service.
	 *
	 * @param counterLocalService the counter local service
	 */
	public void setCounterLocalService(
		com.liferay.counter.service.CounterLocalService counterLocalService) {
		this.counterLocalService = counterLocalService;
	}

	/**
	 * Returns the system event local service.
	 *
	 * @return the system event local service
	 */
	public com.liferay.portal.service.SystemEventLocalService getSystemEventLocalService() {
		return systemEventLocalService;
	}

	/**
	 * Sets the system event local service.
	 *
	 * @param systemEventLocalService the system event local service
	 */
	public void setSystemEventLocalService(
		com.liferay.portal.service.SystemEventLocalService systemEventLocalService) {
		this.systemEventLocalService = systemEventLocalService;
	}

	/**
	 * Returns the system event persistence.
	 *
	 * @return the system event persistence
	 */
	public SystemEventPersistence getSystemEventPersistence() {
		return systemEventPersistence;
	}

	/**
	 * Sets the system event persistence.
	 *
	 * @param systemEventPersistence the system event persistence
	 */
	public void setSystemEventPersistence(
		SystemEventPersistence systemEventPersistence) {
		this.systemEventPersistence = systemEventPersistence;
	}

	/**
	 * Returns the user local service.
	 *
	 * @return the user local service
	 */
	public com.liferay.portal.service.UserLocalService getUserLocalService() {
		return userLocalService;
	}

	/**
	 * Sets the user local service.
	 *
	 * @param userLocalService the user local service
	 */
	public void setUserLocalService(
		com.liferay.portal.service.UserLocalService userLocalService) {
		this.userLocalService = userLocalService;
	}

	/**
	 * Returns the user remote service.
	 *
	 * @return the user remote service
	 */
	public com.liferay.portal.service.UserService getUserService() {
		return userService;
	}

	/**
	 * Sets the user remote service.
	 *
	 * @param userService the user remote service
	 */
	public void setUserService(
		com.liferay.portal.service.UserService userService) {
		this.userService = userService;
	}

	/**
	 * Returns the user persistence.
	 *
	 * @return the user persistence
	 */
	public UserPersistence getUserPersistence() {
		return userPersistence;
	}

	/**
	 * Sets the user persistence.
	 *
	 * @param userPersistence the user persistence
	 */
	public void setUserPersistence(UserPersistence userPersistence) {
		this.userPersistence = userPersistence;
	}

	/**
	 * Returns the user finder.
	 *
	 * @return the user finder
	 */
	public UserFinder getUserFinder() {
		return userFinder;
	}

	/**
	 * Sets the user finder.
	 *
	 * @param userFinder the user finder
	 */
	public void setUserFinder(UserFinder userFinder) {
		this.userFinder = userFinder;
	}

	/**
	 * Returns the m d r rule group local service.
	 *
	 * @return the m d r rule group local service
	 */
	public com.liferay.portlet.mobiledevicerules.service.MDRRuleGroupLocalService getMDRRuleGroupLocalService() {
		return mdrRuleGroupLocalService;
	}

	/**
	 * Sets the m d r rule group local service.
	 *
	 * @param mdrRuleGroupLocalService the m d r rule group local service
	 */
	public void setMDRRuleGroupLocalService(
		com.liferay.portlet.mobiledevicerules.service.MDRRuleGroupLocalService mdrRuleGroupLocalService) {
		this.mdrRuleGroupLocalService = mdrRuleGroupLocalService;
	}

	/**
	 * Returns the m d r rule group remote service.
	 *
	 * @return the m d r rule group remote service
	 */
	public com.liferay.portlet.mobiledevicerules.service.MDRRuleGroupService getMDRRuleGroupService() {
		return mdrRuleGroupService;
	}

	/**
	 * Sets the m d r rule group remote service.
	 *
	 * @param mdrRuleGroupService the m d r rule group remote service
	 */
	public void setMDRRuleGroupService(
		com.liferay.portlet.mobiledevicerules.service.MDRRuleGroupService mdrRuleGroupService) {
		this.mdrRuleGroupService = mdrRuleGroupService;
	}

	/**
	 * Returns the m d r rule group persistence.
	 *
	 * @return the m d r rule group persistence
	 */
	public MDRRuleGroupPersistence getMDRRuleGroupPersistence() {
		return mdrRuleGroupPersistence;
	}

	/**
	 * Sets the m d r rule group persistence.
	 *
	 * @param mdrRuleGroupPersistence the m d r rule group persistence
	 */
	public void setMDRRuleGroupPersistence(
		MDRRuleGroupPersistence mdrRuleGroupPersistence) {
		this.mdrRuleGroupPersistence = mdrRuleGroupPersistence;
	}

	/**
	 * Returns the m d r rule group finder.
	 *
	 * @return the m d r rule group finder
	 */
	public MDRRuleGroupFinder getMDRRuleGroupFinder() {
		return mdrRuleGroupFinder;
	}

	/**
	 * Sets the m d r rule group finder.
	 *
	 * @param mdrRuleGroupFinder the m d r rule group finder
	 */
	public void setMDRRuleGroupFinder(MDRRuleGroupFinder mdrRuleGroupFinder) {
		this.mdrRuleGroupFinder = mdrRuleGroupFinder;
	}

	public void afterPropertiesSet() {
	}

	public void destroy() {
	}

	/**
	 * Returns the Spring bean ID for this bean.
	 *
	 * @return the Spring bean ID for this bean
	 */
	@Override
	public String getBeanIdentifier() {
		return _beanIdentifier;
	}

	/**
	 * Sets the Spring bean ID for this bean.
	 *
	 * @param beanIdentifier the Spring bean ID for this bean
	 */
	@Override
	public void setBeanIdentifier(String beanIdentifier) {
		_beanIdentifier = beanIdentifier;
	}

	protected Class<?> getModelClass() {
		return MDRRule.class;
	}

	protected String getModelClassName() {
		return MDRRule.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) throws SystemException {
		try {
			DataSource dataSource = mdrRulePersistence.getDataSource();

			DB db = DBFactoryUtil.getDB();

			sql = db.buildSQL(sql);
			sql = PortalUtil.transformSQL(sql);

			SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(dataSource,
					sql, new int[0]);

			sqlUpdate.update();
		}
		catch (Exception e) {
			throw new SystemException(e);
		}
	}

	@BeanReference(type = com.liferay.portlet.mobiledevicerules.service.MDRRuleLocalService.class)
	protected com.liferay.portlet.mobiledevicerules.service.MDRRuleLocalService mdrRuleLocalService;
	@BeanReference(type = com.liferay.portlet.mobiledevicerules.service.MDRRuleService.class)
	protected com.liferay.portlet.mobiledevicerules.service.MDRRuleService mdrRuleService;
	@BeanReference(type = MDRRulePersistence.class)
	protected MDRRulePersistence mdrRulePersistence;
	@BeanReference(type = com.liferay.counter.service.CounterLocalService.class)
	protected com.liferay.counter.service.CounterLocalService counterLocalService;
	@BeanReference(type = com.liferay.portal.service.SystemEventLocalService.class)
	protected com.liferay.portal.service.SystemEventLocalService systemEventLocalService;
	@BeanReference(type = SystemEventPersistence.class)
	protected SystemEventPersistence systemEventPersistence;
	@BeanReference(type = com.liferay.portal.service.UserLocalService.class)
	protected com.liferay.portal.service.UserLocalService userLocalService;
	@BeanReference(type = com.liferay.portal.service.UserService.class)
	protected com.liferay.portal.service.UserService userService;
	@BeanReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;
	@BeanReference(type = UserFinder.class)
	protected UserFinder userFinder;
	@BeanReference(type = com.liferay.portlet.mobiledevicerules.service.MDRRuleGroupLocalService.class)
	protected com.liferay.portlet.mobiledevicerules.service.MDRRuleGroupLocalService mdrRuleGroupLocalService;
	@BeanReference(type = com.liferay.portlet.mobiledevicerules.service.MDRRuleGroupService.class)
	protected com.liferay.portlet.mobiledevicerules.service.MDRRuleGroupService mdrRuleGroupService;
	@BeanReference(type = MDRRuleGroupPersistence.class)
	protected MDRRuleGroupPersistence mdrRuleGroupPersistence;
	@BeanReference(type = MDRRuleGroupFinder.class)
	protected MDRRuleGroupFinder mdrRuleGroupFinder;
	private String _beanIdentifier;
}