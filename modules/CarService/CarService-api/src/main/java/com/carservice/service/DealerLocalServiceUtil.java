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

package com.carservice.service;

import com.carservice.model.Dealer;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for Dealer. This utility wraps
 * <code>com.carservice.service.impl.DealerLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see DealerLocalService
 * @generated
 */
public class DealerLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.carservice.service.impl.DealerLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the dealer to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect DealerLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param dealer the dealer
	 * @return the dealer that was added
	 */
	public static Dealer addDealer(Dealer dealer) {
		return getService().addDealer(dealer);
	}

	/**
	 * Creates a new dealer with the primary key. Does not add the dealer to the database.
	 *
	 * @param dealerId the primary key for the new dealer
	 * @return the new dealer
	 */
	public static Dealer createDealer(long dealerId) {
		return getService().createDealer(dealerId);
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel createPersistedModel(
			Serializable primaryKeyObj)
		throws PortalException {

		return getService().createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the dealer from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect DealerLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param dealer the dealer
	 * @return the dealer that was removed
	 */
	public static Dealer deleteDealer(Dealer dealer) {
		return getService().deleteDealer(dealer);
	}

	/**
	 * Deletes the dealer with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect DealerLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param dealerId the primary key of the dealer
	 * @return the dealer that was removed
	 * @throws PortalException if a dealer with the primary key could not be found
	 */
	public static Dealer deleteDealer(long dealerId) throws PortalException {
		return getService().deleteDealer(dealerId);
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel deletePersistedModel(
			PersistedModel persistedModel)
		throws PortalException {

		return getService().deletePersistedModel(persistedModel);
	}

	public static <T> T dslQuery(DSLQuery dslQuery) {
		return getService().dslQuery(dslQuery);
	}

	public static int dslQueryCount(DSLQuery dslQuery) {
		return getService().dslQueryCount(dslQuery);
	}

	public static DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	public static <T> List<T> dynamicQuery(DynamicQuery dynamicQuery) {
		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.carservice.model.impl.DealerModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	public static <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.carservice.model.impl.DealerModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	public static <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<T> orderByComparator) {

		return getService().dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(DynamicQuery dynamicQuery) {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(
		DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static Dealer fetchDealer(long dealerId) {
		return getService().fetchDealer(dealerId);
	}

	/**
	 * Returns the dealer matching the UUID and group.
	 *
	 * @param uuid the dealer's UUID
	 * @param groupId the primary key of the group
	 * @return the matching dealer, or <code>null</code> if a matching dealer could not be found
	 */
	public static Dealer fetchDealerByUuidAndGroupId(
		String uuid, long groupId) {

		return getService().fetchDealerByUuidAndGroupId(uuid, groupId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	/**
	 * Returns the dealer with the primary key.
	 *
	 * @param dealerId the primary key of the dealer
	 * @return the dealer
	 * @throws PortalException if a dealer with the primary key could not be found
	 */
	public static Dealer getDealer(long dealerId) throws PortalException {
		return getService().getDealer(dealerId);
	}

	/**
	 * Returns the dealer matching the UUID and group.
	 *
	 * @param uuid the dealer's UUID
	 * @param groupId the primary key of the group
	 * @return the matching dealer
	 * @throws PortalException if a matching dealer could not be found
	 */
	public static Dealer getDealerByUuidAndGroupId(String uuid, long groupId)
		throws PortalException {

		return getService().getDealerByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the dealers.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.carservice.model.impl.DealerModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of dealers
	 * @param end the upper bound of the range of dealers (not inclusive)
	 * @return the range of dealers
	 */
	public static List<Dealer> getDealers(int start, int end) {
		return getService().getDealers(start, end);
	}

	/**
	 * Returns all the dealers matching the UUID and company.
	 *
	 * @param uuid the UUID of the dealers
	 * @param companyId the primary key of the company
	 * @return the matching dealers, or an empty list if no matches were found
	 */
	public static List<Dealer> getDealersByUuidAndCompanyId(
		String uuid, long companyId) {

		return getService().getDealersByUuidAndCompanyId(uuid, companyId);
	}

	/**
	 * Returns a range of dealers matching the UUID and company.
	 *
	 * @param uuid the UUID of the dealers
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of dealers
	 * @param end the upper bound of the range of dealers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching dealers, or an empty list if no matches were found
	 */
	public static List<Dealer> getDealersByUuidAndCompanyId(
		String uuid, long companyId, int start, int end,
		OrderByComparator<Dealer> orderByComparator) {

		return getService().getDealersByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of dealers.
	 *
	 * @return the number of dealers
	 */
	public static int getDealersCount() {
		return getService().getDealersCount();
	}

	public static com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return getService().getExportActionableDynamicQuery(portletDataContext);
	}

	public static
		com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
			getIndexableActionableDynamicQuery() {

		return getService().getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the dealer in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect DealerLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param dealer the dealer
	 * @return the dealer that was updated
	 */
	public static Dealer updateDealer(Dealer dealer) {
		return getService().updateDealer(dealer);
	}

	public static DealerLocalService getService() {
		return _service;
	}

	private static volatile DealerLocalService _service;

}