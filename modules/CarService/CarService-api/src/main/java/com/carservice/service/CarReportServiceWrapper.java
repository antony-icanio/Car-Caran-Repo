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
 * Provides a wrapper for {@link CarReportService}.
 *
 * @author Brian Wing Shun Chan
 * @see CarReportService
 * @generated
 */
public class CarReportServiceWrapper
	implements CarReportService, ServiceWrapper<CarReportService> {

	public CarReportServiceWrapper() {
		this(null);
	}

	public CarReportServiceWrapper(CarReportService carReportService) {
		_carReportService = carReportService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _carReportService.getOSGiServiceIdentifier();
	}

	@Override
	public CarReportService getWrappedService() {
		return _carReportService;
	}

	@Override
	public void setWrappedService(CarReportService carReportService) {
		_carReportService = carReportService;
	}

	private CarReportService _carReportService;

}