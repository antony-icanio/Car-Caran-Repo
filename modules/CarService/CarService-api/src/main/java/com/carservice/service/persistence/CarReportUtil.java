/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
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

package com.carservice.service.persistence;

import com.carservice.model.CarReport;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the car report service. This utility wraps <code>com.carservice.service.persistence.impl.CarReportPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CarReportPersistence
 * @generated
 */
public class CarReportUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(CarReport carReport) {
		getPersistence().clearCache(carReport);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#fetchByPrimaryKeys(Set)
	 */
	public static Map<Serializable, CarReport> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<CarReport> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<CarReport> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<CarReport> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<CarReport> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static CarReport update(CarReport carReport) {
		return getPersistence().update(carReport);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static CarReport update(
		CarReport carReport, ServiceContext serviceContext) {

		return getPersistence().update(carReport, serviceContext);
	}

	/**
	 * Returns all the car reports where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching car reports
	 */
	public static List<CarReport> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the car reports where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CarReportModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of car reports
	 * @param end the upper bound of the range of car reports (not inclusive)
	 * @return the range of matching car reports
	 */
	public static List<CarReport> findByUuid(String uuid, int start, int end) {
		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the car reports where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CarReportModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of car reports
	 * @param end the upper bound of the range of car reports (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching car reports
	 */
	public static List<CarReport> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<CarReport> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the car reports where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CarReportModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of car reports
	 * @param end the upper bound of the range of car reports (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching car reports
	 */
	public static List<CarReport> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<CarReport> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first car report in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching car report
	 * @throws NoSuchReportException if a matching car report could not be found
	 */
	public static CarReport findByUuid_First(
			String uuid, OrderByComparator<CarReport> orderByComparator)
		throws com.carservice.exception.NoSuchReportException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first car report in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching car report, or <code>null</code> if a matching car report could not be found
	 */
	public static CarReport fetchByUuid_First(
		String uuid, OrderByComparator<CarReport> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last car report in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching car report
	 * @throws NoSuchReportException if a matching car report could not be found
	 */
	public static CarReport findByUuid_Last(
			String uuid, OrderByComparator<CarReport> orderByComparator)
		throws com.carservice.exception.NoSuchReportException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last car report in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching car report, or <code>null</code> if a matching car report could not be found
	 */
	public static CarReport fetchByUuid_Last(
		String uuid, OrderByComparator<CarReport> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the car reports before and after the current car report in the ordered set where uuid = &#63;.
	 *
	 * @param carReportId the primary key of the current car report
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next car report
	 * @throws NoSuchReportException if a car report with the primary key could not be found
	 */
	public static CarReport[] findByUuid_PrevAndNext(
			long carReportId, String uuid,
			OrderByComparator<CarReport> orderByComparator)
		throws com.carservice.exception.NoSuchReportException {

		return getPersistence().findByUuid_PrevAndNext(
			carReportId, uuid, orderByComparator);
	}

	/**
	 * Removes all the car reports where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of car reports where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching car reports
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the car report where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchReportException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching car report
	 * @throws NoSuchReportException if a matching car report could not be found
	 */
	public static CarReport findByUUID_G(String uuid, long groupId)
		throws com.carservice.exception.NoSuchReportException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the car report where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching car report, or <code>null</code> if a matching car report could not be found
	 */
	public static CarReport fetchByUUID_G(String uuid, long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the car report where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching car report, or <code>null</code> if a matching car report could not be found
	 */
	public static CarReport fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, useFinderCache);
	}

	/**
	 * Removes the car report where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the car report that was removed
	 */
	public static CarReport removeByUUID_G(String uuid, long groupId)
		throws com.carservice.exception.NoSuchReportException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of car reports where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching car reports
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the car reports where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching car reports
	 */
	public static List<CarReport> findByUuid_C(String uuid, long companyId) {
		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of all the car reports where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CarReportModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of car reports
	 * @param end the upper bound of the range of car reports (not inclusive)
	 * @return the range of matching car reports
	 */
	public static List<CarReport> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the car reports where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CarReportModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of car reports
	 * @param end the upper bound of the range of car reports (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching car reports
	 */
	public static List<CarReport> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<CarReport> orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the car reports where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CarReportModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of car reports
	 * @param end the upper bound of the range of car reports (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching car reports
	 */
	public static List<CarReport> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<CarReport> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first car report in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching car report
	 * @throws NoSuchReportException if a matching car report could not be found
	 */
	public static CarReport findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<CarReport> orderByComparator)
		throws com.carservice.exception.NoSuchReportException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first car report in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching car report, or <code>null</code> if a matching car report could not be found
	 */
	public static CarReport fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<CarReport> orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last car report in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching car report
	 * @throws NoSuchReportException if a matching car report could not be found
	 */
	public static CarReport findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<CarReport> orderByComparator)
		throws com.carservice.exception.NoSuchReportException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last car report in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching car report, or <code>null</code> if a matching car report could not be found
	 */
	public static CarReport fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<CarReport> orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the car reports before and after the current car report in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param carReportId the primary key of the current car report
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next car report
	 * @throws NoSuchReportException if a car report with the primary key could not be found
	 */
	public static CarReport[] findByUuid_C_PrevAndNext(
			long carReportId, String uuid, long companyId,
			OrderByComparator<CarReport> orderByComparator)
		throws com.carservice.exception.NoSuchReportException {

		return getPersistence().findByUuid_C_PrevAndNext(
			carReportId, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the car reports where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of car reports where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching car reports
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Returns all the car reports where dealerId = &#63;.
	 *
	 * @param dealerId the dealer ID
	 * @return the matching car reports
	 */
	public static List<CarReport> findByDealerId(long dealerId) {
		return getPersistence().findByDealerId(dealerId);
	}

	/**
	 * Returns a range of all the car reports where dealerId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CarReportModelImpl</code>.
	 * </p>
	 *
	 * @param dealerId the dealer ID
	 * @param start the lower bound of the range of car reports
	 * @param end the upper bound of the range of car reports (not inclusive)
	 * @return the range of matching car reports
	 */
	public static List<CarReport> findByDealerId(
		long dealerId, int start, int end) {

		return getPersistence().findByDealerId(dealerId, start, end);
	}

	/**
	 * Returns an ordered range of all the car reports where dealerId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CarReportModelImpl</code>.
	 * </p>
	 *
	 * @param dealerId the dealer ID
	 * @param start the lower bound of the range of car reports
	 * @param end the upper bound of the range of car reports (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching car reports
	 */
	public static List<CarReport> findByDealerId(
		long dealerId, int start, int end,
		OrderByComparator<CarReport> orderByComparator) {

		return getPersistence().findByDealerId(
			dealerId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the car reports where dealerId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CarReportModelImpl</code>.
	 * </p>
	 *
	 * @param dealerId the dealer ID
	 * @param start the lower bound of the range of car reports
	 * @param end the upper bound of the range of car reports (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching car reports
	 */
	public static List<CarReport> findByDealerId(
		long dealerId, int start, int end,
		OrderByComparator<CarReport> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByDealerId(
			dealerId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first car report in the ordered set where dealerId = &#63;.
	 *
	 * @param dealerId the dealer ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching car report
	 * @throws NoSuchReportException if a matching car report could not be found
	 */
	public static CarReport findByDealerId_First(
			long dealerId, OrderByComparator<CarReport> orderByComparator)
		throws com.carservice.exception.NoSuchReportException {

		return getPersistence().findByDealerId_First(
			dealerId, orderByComparator);
	}

	/**
	 * Returns the first car report in the ordered set where dealerId = &#63;.
	 *
	 * @param dealerId the dealer ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching car report, or <code>null</code> if a matching car report could not be found
	 */
	public static CarReport fetchByDealerId_First(
		long dealerId, OrderByComparator<CarReport> orderByComparator) {

		return getPersistence().fetchByDealerId_First(
			dealerId, orderByComparator);
	}

	/**
	 * Returns the last car report in the ordered set where dealerId = &#63;.
	 *
	 * @param dealerId the dealer ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching car report
	 * @throws NoSuchReportException if a matching car report could not be found
	 */
	public static CarReport findByDealerId_Last(
			long dealerId, OrderByComparator<CarReport> orderByComparator)
		throws com.carservice.exception.NoSuchReportException {

		return getPersistence().findByDealerId_Last(
			dealerId, orderByComparator);
	}

	/**
	 * Returns the last car report in the ordered set where dealerId = &#63;.
	 *
	 * @param dealerId the dealer ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching car report, or <code>null</code> if a matching car report could not be found
	 */
	public static CarReport fetchByDealerId_Last(
		long dealerId, OrderByComparator<CarReport> orderByComparator) {

		return getPersistence().fetchByDealerId_Last(
			dealerId, orderByComparator);
	}

	/**
	 * Returns the car reports before and after the current car report in the ordered set where dealerId = &#63;.
	 *
	 * @param carReportId the primary key of the current car report
	 * @param dealerId the dealer ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next car report
	 * @throws NoSuchReportException if a car report with the primary key could not be found
	 */
	public static CarReport[] findByDealerId_PrevAndNext(
			long carReportId, long dealerId,
			OrderByComparator<CarReport> orderByComparator)
		throws com.carservice.exception.NoSuchReportException {

		return getPersistence().findByDealerId_PrevAndNext(
			carReportId, dealerId, orderByComparator);
	}

	/**
	 * Removes all the car reports where dealerId = &#63; from the database.
	 *
	 * @param dealerId the dealer ID
	 */
	public static void removeByDealerId(long dealerId) {
		getPersistence().removeByDealerId(dealerId);
	}

	/**
	 * Returns the number of car reports where dealerId = &#63;.
	 *
	 * @param dealerId the dealer ID
	 * @return the number of matching car reports
	 */
	public static int countByDealerId(long dealerId) {
		return getPersistence().countByDealerId(dealerId);
	}

	/**
	 * Caches the car report in the entity cache if it is enabled.
	 *
	 * @param carReport the car report
	 */
	public static void cacheResult(CarReport carReport) {
		getPersistence().cacheResult(carReport);
	}

	/**
	 * Caches the car reports in the entity cache if it is enabled.
	 *
	 * @param carReports the car reports
	 */
	public static void cacheResult(List<CarReport> carReports) {
		getPersistence().cacheResult(carReports);
	}

	/**
	 * Creates a new car report with the primary key. Does not add the car report to the database.
	 *
	 * @param carReportId the primary key for the new car report
	 * @return the new car report
	 */
	public static CarReport create(long carReportId) {
		return getPersistence().create(carReportId);
	}

	/**
	 * Removes the car report with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param carReportId the primary key of the car report
	 * @return the car report that was removed
	 * @throws NoSuchReportException if a car report with the primary key could not be found
	 */
	public static CarReport remove(long carReportId)
		throws com.carservice.exception.NoSuchReportException {

		return getPersistence().remove(carReportId);
	}

	public static CarReport updateImpl(CarReport carReport) {
		return getPersistence().updateImpl(carReport);
	}

	/**
	 * Returns the car report with the primary key or throws a <code>NoSuchReportException</code> if it could not be found.
	 *
	 * @param carReportId the primary key of the car report
	 * @return the car report
	 * @throws NoSuchReportException if a car report with the primary key could not be found
	 */
	public static CarReport findByPrimaryKey(long carReportId)
		throws com.carservice.exception.NoSuchReportException {

		return getPersistence().findByPrimaryKey(carReportId);
	}

	/**
	 * Returns the car report with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param carReportId the primary key of the car report
	 * @return the car report, or <code>null</code> if a car report with the primary key could not be found
	 */
	public static CarReport fetchByPrimaryKey(long carReportId) {
		return getPersistence().fetchByPrimaryKey(carReportId);
	}

	/**
	 * Returns all the car reports.
	 *
	 * @return the car reports
	 */
	public static List<CarReport> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the car reports.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CarReportModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of car reports
	 * @param end the upper bound of the range of car reports (not inclusive)
	 * @return the range of car reports
	 */
	public static List<CarReport> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the car reports.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CarReportModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of car reports
	 * @param end the upper bound of the range of car reports (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of car reports
	 */
	public static List<CarReport> findAll(
		int start, int end, OrderByComparator<CarReport> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the car reports.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CarReportModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of car reports
	 * @param end the upper bound of the range of car reports (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of car reports
	 */
	public static List<CarReport> findAll(
		int start, int end, OrderByComparator<CarReport> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the car reports from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of car reports.
	 *
	 * @return the number of car reports
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static CarReportPersistence getPersistence() {
		return _persistence;
	}

	private static volatile CarReportPersistence _persistence;

}