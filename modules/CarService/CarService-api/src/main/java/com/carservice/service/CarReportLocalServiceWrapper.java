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

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link CarReportLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see CarReportLocalService
 * @generated
 */
public class CarReportLocalServiceWrapper
	implements CarReportLocalService, ServiceWrapper<CarReportLocalService> {

	public CarReportLocalServiceWrapper() {
		this(null);
	}

	public CarReportLocalServiceWrapper(
		CarReportLocalService carReportLocalService) {

		_carReportLocalService = carReportLocalService;
	}

	/**
	 * Adds the car report to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CarReportLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param carReport the car report
	 * @return the car report that was added
	 */
	@Override
	public com.carservice.model.CarReport addCarReport(
		com.carservice.model.CarReport carReport) {

		return _carReportLocalService.addCarReport(carReport);
	}

	@Override
	public com.carservice.model.CarReport addReport(long carId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _carReportLocalService.addReport(carId);
	}

	/**
	 * Creates a new car report with the primary key. Does not add the car report to the database.
	 *
	 * @param carReportId the primary key for the new car report
	 * @return the new car report
	 */
	@Override
	public com.carservice.model.CarReport createCarReport(long carReportId) {
		return _carReportLocalService.createCarReport(carReportId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _carReportLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the car report from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CarReportLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param carReport the car report
	 * @return the car report that was removed
	 */
	@Override
	public com.carservice.model.CarReport deleteCarReport(
		com.carservice.model.CarReport carReport) {

		return _carReportLocalService.deleteCarReport(carReport);
	}

	/**
	 * Deletes the car report with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CarReportLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param carReportId the primary key of the car report
	 * @return the car report that was removed
	 * @throws PortalException if a car report with the primary key could not be found
	 */
	@Override
	public com.carservice.model.CarReport deleteCarReport(long carReportId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _carReportLocalService.deleteCarReport(carReportId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _carReportLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _carReportLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _carReportLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _carReportLocalService.dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _carReportLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.carservice.model.impl.CarReportModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return _carReportLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.carservice.model.impl.CarReportModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return _carReportLocalService.dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _carReportLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return _carReportLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.carservice.model.CarReport fetchCarReport(long carReportId) {
		return _carReportLocalService.fetchCarReport(carReportId);
	}

	/**
	 * Returns the car report matching the UUID and group.
	 *
	 * @param uuid the car report's UUID
	 * @param groupId the primary key of the group
	 * @return the matching car report, or <code>null</code> if a matching car report could not be found
	 */
	@Override
	public com.carservice.model.CarReport fetchCarReportByUuidAndGroupId(
		String uuid, long groupId) {

		return _carReportLocalService.fetchCarReportByUuidAndGroupId(
			uuid, groupId);
	}

	@Override
	public java.util.List<com.carservice.model.CarReport> findByDealerId(
		long dealerId, int from, int to) {

		return _carReportLocalService.findByDealerId(dealerId, from, to);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _carReportLocalService.getActionableDynamicQuery();
	}

	/**
	 * Returns the car report with the primary key.
	 *
	 * @param carReportId the primary key of the car report
	 * @return the car report
	 * @throws PortalException if a car report with the primary key could not be found
	 */
	@Override
	public com.carservice.model.CarReport getCarReport(long carReportId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _carReportLocalService.getCarReport(carReportId);
	}

	/**
	 * Returns the car report matching the UUID and group.
	 *
	 * @param uuid the car report's UUID
	 * @param groupId the primary key of the group
	 * @return the matching car report
	 * @throws PortalException if a matching car report could not be found
	 */
	@Override
	public com.carservice.model.CarReport getCarReportByUuidAndGroupId(
			String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _carReportLocalService.getCarReportByUuidAndGroupId(
			uuid, groupId);
	}

	/**
	 * Returns a range of all the car reports.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.carservice.model.impl.CarReportModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of car reports
	 * @param end the upper bound of the range of car reports (not inclusive)
	 * @return the range of car reports
	 */
	@Override
	public java.util.List<com.carservice.model.CarReport> getCarReports(
		int start, int end) {

		return _carReportLocalService.getCarReports(start, end);
	}

	/**
	 * Returns all the car reports matching the UUID and company.
	 *
	 * @param uuid the UUID of the car reports
	 * @param companyId the primary key of the company
	 * @return the matching car reports, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<com.carservice.model.CarReport>
		getCarReportsByUuidAndCompanyId(String uuid, long companyId) {

		return _carReportLocalService.getCarReportsByUuidAndCompanyId(
			uuid, companyId);
	}

	/**
	 * Returns a range of car reports matching the UUID and company.
	 *
	 * @param uuid the UUID of the car reports
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of car reports
	 * @param end the upper bound of the range of car reports (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching car reports, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<com.carservice.model.CarReport>
		getCarReportsByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<com.carservice.model.CarReport> orderByComparator) {

		return _carReportLocalService.getCarReportsByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of car reports.
	 *
	 * @return the number of car reports
	 */
	@Override
	public int getCarReportsCount() {
		return _carReportLocalService.getCarReportsCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _carReportLocalService.getExportActionableDynamicQuery(
			portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _carReportLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _carReportLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _carReportLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the car report in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CarReportLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param carReport the car report
	 * @return the car report that was updated
	 */
	@Override
	public com.carservice.model.CarReport updateCarReport(
		com.carservice.model.CarReport carReport) {

		return _carReportLocalService.updateCarReport(carReport);
	}

	@Override
	public CarReportLocalService getWrappedService() {
		return _carReportLocalService;
	}

	@Override
	public void setWrappedService(CarReportLocalService carReportLocalService) {
		_carReportLocalService = carReportLocalService;
	}

	private CarReportLocalService _carReportLocalService;

}