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

package com.carservice.service.impl;

import com.carservice.model.CarReport;
import com.carservice.model.impl.CarReportImpl;
import com.carservice.service.base.CarReportLocalServiceBaseImpl;

import com.liferay.portal.aop.AopService;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.service.UserServiceUtil;
import org.osgi.service.component.annotations.Component;

import java.util.List;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=com.carservice.model.CarReport",
	service = AopService.class
)
public class CarReportLocalServiceImpl extends CarReportLocalServiceBaseImpl {
	public CarReport addReport(long carId) throws PortalException {
		User user = UserServiceUtil.getCurrentUser();
		CarReport carReport = new CarReportImpl();
		long carReportId = counterLocalService.increment(CarReport.class.getName());
		carReport.setCarReportId(carReportId);
		carReport.setUserId(user.getUserId());
		carReport.setUserName(user.getFullName());
		carReport.setCarId(carId);
		carReport.setDealerId(0);
		return carReportLocalService.addCarReport(carReport);
	}

	public List<CarReport> findByDealerId(long dealerId, int from, int to) {
		return carReportPersistence.findByDealerId(dealerId,from,to);
	}
}