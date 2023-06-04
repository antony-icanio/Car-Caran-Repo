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

import com.carservice.exception.NoSuchReportException;
import com.carservice.model.CarReport;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the car report service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CarReportUtil
 * @generated
 */
@ProviderType
public interface CarReportPersistence extends BasePersistence<CarReport> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link CarReportUtil} to access the car report persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the car reports where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching car reports
	 */
	public java.util.List<CarReport> findByUuid(String uuid);

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
	public java.util.List<CarReport> findByUuid(
		String uuid, int start, int end);

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
	public java.util.List<CarReport> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CarReport>
			orderByComparator);

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
	public java.util.List<CarReport> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CarReport>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first car report in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching car report
	 * @throws NoSuchReportException if a matching car report could not be found
	 */
	public CarReport findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<CarReport>
				orderByComparator)
		throws NoSuchReportException;

	/**
	 * Returns the first car report in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching car report, or <code>null</code> if a matching car report could not be found
	 */
	public CarReport fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<CarReport>
			orderByComparator);

	/**
	 * Returns the last car report in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching car report
	 * @throws NoSuchReportException if a matching car report could not be found
	 */
	public CarReport findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<CarReport>
				orderByComparator)
		throws NoSuchReportException;

	/**
	 * Returns the last car report in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching car report, or <code>null</code> if a matching car report could not be found
	 */
	public CarReport fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<CarReport>
			orderByComparator);

	/**
	 * Returns the car reports before and after the current car report in the ordered set where uuid = &#63;.
	 *
	 * @param carReportId the primary key of the current car report
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next car report
	 * @throws NoSuchReportException if a car report with the primary key could not be found
	 */
	public CarReport[] findByUuid_PrevAndNext(
			long carReportId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<CarReport>
				orderByComparator)
		throws NoSuchReportException;

	/**
	 * Removes all the car reports where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of car reports where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching car reports
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the car report where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchReportException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching car report
	 * @throws NoSuchReportException if a matching car report could not be found
	 */
	public CarReport findByUUID_G(String uuid, long groupId)
		throws NoSuchReportException;

	/**
	 * Returns the car report where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching car report, or <code>null</code> if a matching car report could not be found
	 */
	public CarReport fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the car report where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching car report, or <code>null</code> if a matching car report could not be found
	 */
	public CarReport fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the car report where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the car report that was removed
	 */
	public CarReport removeByUUID_G(String uuid, long groupId)
		throws NoSuchReportException;

	/**
	 * Returns the number of car reports where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching car reports
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the car reports where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching car reports
	 */
	public java.util.List<CarReport> findByUuid_C(String uuid, long companyId);

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
	public java.util.List<CarReport> findByUuid_C(
		String uuid, long companyId, int start, int end);

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
	public java.util.List<CarReport> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CarReport>
			orderByComparator);

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
	public java.util.List<CarReport> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CarReport>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first car report in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching car report
	 * @throws NoSuchReportException if a matching car report could not be found
	 */
	public CarReport findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<CarReport>
				orderByComparator)
		throws NoSuchReportException;

	/**
	 * Returns the first car report in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching car report, or <code>null</code> if a matching car report could not be found
	 */
	public CarReport fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<CarReport>
			orderByComparator);

	/**
	 * Returns the last car report in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching car report
	 * @throws NoSuchReportException if a matching car report could not be found
	 */
	public CarReport findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<CarReport>
				orderByComparator)
		throws NoSuchReportException;

	/**
	 * Returns the last car report in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching car report, or <code>null</code> if a matching car report could not be found
	 */
	public CarReport fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<CarReport>
			orderByComparator);

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
	public CarReport[] findByUuid_C_PrevAndNext(
			long carReportId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<CarReport>
				orderByComparator)
		throws NoSuchReportException;

	/**
	 * Removes all the car reports where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of car reports where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching car reports
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns all the car reports where dealerId = &#63;.
	 *
	 * @param dealerId the dealer ID
	 * @return the matching car reports
	 */
	public java.util.List<CarReport> findByDealerId(long dealerId);

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
	public java.util.List<CarReport> findByDealerId(
		long dealerId, int start, int end);

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
	public java.util.List<CarReport> findByDealerId(
		long dealerId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CarReport>
			orderByComparator);

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
	public java.util.List<CarReport> findByDealerId(
		long dealerId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CarReport>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first car report in the ordered set where dealerId = &#63;.
	 *
	 * @param dealerId the dealer ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching car report
	 * @throws NoSuchReportException if a matching car report could not be found
	 */
	public CarReport findByDealerId_First(
			long dealerId,
			com.liferay.portal.kernel.util.OrderByComparator<CarReport>
				orderByComparator)
		throws NoSuchReportException;

	/**
	 * Returns the first car report in the ordered set where dealerId = &#63;.
	 *
	 * @param dealerId the dealer ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching car report, or <code>null</code> if a matching car report could not be found
	 */
	public CarReport fetchByDealerId_First(
		long dealerId,
		com.liferay.portal.kernel.util.OrderByComparator<CarReport>
			orderByComparator);

	/**
	 * Returns the last car report in the ordered set where dealerId = &#63;.
	 *
	 * @param dealerId the dealer ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching car report
	 * @throws NoSuchReportException if a matching car report could not be found
	 */
	public CarReport findByDealerId_Last(
			long dealerId,
			com.liferay.portal.kernel.util.OrderByComparator<CarReport>
				orderByComparator)
		throws NoSuchReportException;

	/**
	 * Returns the last car report in the ordered set where dealerId = &#63;.
	 *
	 * @param dealerId the dealer ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching car report, or <code>null</code> if a matching car report could not be found
	 */
	public CarReport fetchByDealerId_Last(
		long dealerId,
		com.liferay.portal.kernel.util.OrderByComparator<CarReport>
			orderByComparator);

	/**
	 * Returns the car reports before and after the current car report in the ordered set where dealerId = &#63;.
	 *
	 * @param carReportId the primary key of the current car report
	 * @param dealerId the dealer ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next car report
	 * @throws NoSuchReportException if a car report with the primary key could not be found
	 */
	public CarReport[] findByDealerId_PrevAndNext(
			long carReportId, long dealerId,
			com.liferay.portal.kernel.util.OrderByComparator<CarReport>
				orderByComparator)
		throws NoSuchReportException;

	/**
	 * Removes all the car reports where dealerId = &#63; from the database.
	 *
	 * @param dealerId the dealer ID
	 */
	public void removeByDealerId(long dealerId);

	/**
	 * Returns the number of car reports where dealerId = &#63;.
	 *
	 * @param dealerId the dealer ID
	 * @return the number of matching car reports
	 */
	public int countByDealerId(long dealerId);

	/**
	 * Caches the car report in the entity cache if it is enabled.
	 *
	 * @param carReport the car report
	 */
	public void cacheResult(CarReport carReport);

	/**
	 * Caches the car reports in the entity cache if it is enabled.
	 *
	 * @param carReports the car reports
	 */
	public void cacheResult(java.util.List<CarReport> carReports);

	/**
	 * Creates a new car report with the primary key. Does not add the car report to the database.
	 *
	 * @param carReportId the primary key for the new car report
	 * @return the new car report
	 */
	public CarReport create(long carReportId);

	/**
	 * Removes the car report with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param carReportId the primary key of the car report
	 * @return the car report that was removed
	 * @throws NoSuchReportException if a car report with the primary key could not be found
	 */
	public CarReport remove(long carReportId) throws NoSuchReportException;

	public CarReport updateImpl(CarReport carReport);

	/**
	 * Returns the car report with the primary key or throws a <code>NoSuchReportException</code> if it could not be found.
	 *
	 * @param carReportId the primary key of the car report
	 * @return the car report
	 * @throws NoSuchReportException if a car report with the primary key could not be found
	 */
	public CarReport findByPrimaryKey(long carReportId)
		throws NoSuchReportException;

	/**
	 * Returns the car report with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param carReportId the primary key of the car report
	 * @return the car report, or <code>null</code> if a car report with the primary key could not be found
	 */
	public CarReport fetchByPrimaryKey(long carReportId);

	/**
	 * Returns all the car reports.
	 *
	 * @return the car reports
	 */
	public java.util.List<CarReport> findAll();

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
	public java.util.List<CarReport> findAll(int start, int end);

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
	public java.util.List<CarReport> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CarReport>
			orderByComparator);

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
	public java.util.List<CarReport> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CarReport>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the car reports from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of car reports.
	 *
	 * @return the number of car reports
	 */
	public int countAll();

}