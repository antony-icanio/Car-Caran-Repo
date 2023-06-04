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

package com.carservice.model;

import com.liferay.exportimport.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link CarReport}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CarReport
 * @generated
 */
public class CarReportWrapper
	extends BaseModelWrapper<CarReport>
	implements CarReport, ModelWrapper<CarReport> {

	public CarReportWrapper(CarReport carReport) {
		super(carReport);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("carReportId", getCarReportId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("carId", getCarId());
		attributes.put("dealerId", getDealerId());
		attributes.put("viewDate", getViewDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long carReportId = (Long)attributes.get("carReportId");

		if (carReportId != null) {
			setCarReportId(carReportId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		Long carId = (Long)attributes.get("carId");

		if (carId != null) {
			setCarId(carId);
		}

		Long dealerId = (Long)attributes.get("dealerId");

		if (dealerId != null) {
			setDealerId(dealerId);
		}

		Date viewDate = (Date)attributes.get("viewDate");

		if (viewDate != null) {
			setViewDate(viewDate);
		}
	}

	@Override
	public CarReport cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the car ID of this car report.
	 *
	 * @return the car ID of this car report
	 */
	@Override
	public long getCarId() {
		return model.getCarId();
	}

	/**
	 * Returns the car report ID of this car report.
	 *
	 * @return the car report ID of this car report
	 */
	@Override
	public long getCarReportId() {
		return model.getCarReportId();
	}

	/**
	 * Returns the company ID of this car report.
	 *
	 * @return the company ID of this car report
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this car report.
	 *
	 * @return the create date of this car report
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the dealer ID of this car report.
	 *
	 * @return the dealer ID of this car report
	 */
	@Override
	public long getDealerId() {
		return model.getDealerId();
	}

	/**
	 * Returns the group ID of this car report.
	 *
	 * @return the group ID of this car report
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this car report.
	 *
	 * @return the modified date of this car report
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this car report.
	 *
	 * @return the primary key of this car report
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the user ID of this car report.
	 *
	 * @return the user ID of this car report
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this car report.
	 *
	 * @return the user name of this car report
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this car report.
	 *
	 * @return the user uuid of this car report
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this car report.
	 *
	 * @return the uuid of this car report
	 */
	@Override
	public String getUuid() {
		return model.getUuid();
	}

	/**
	 * Returns the view date of this car report.
	 *
	 * @return the view date of this car report
	 */
	@Override
	public Date getViewDate() {
		return model.getViewDate();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the car ID of this car report.
	 *
	 * @param carId the car ID of this car report
	 */
	@Override
	public void setCarId(long carId) {
		model.setCarId(carId);
	}

	/**
	 * Sets the car report ID of this car report.
	 *
	 * @param carReportId the car report ID of this car report
	 */
	@Override
	public void setCarReportId(long carReportId) {
		model.setCarReportId(carReportId);
	}

	/**
	 * Sets the company ID of this car report.
	 *
	 * @param companyId the company ID of this car report
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this car report.
	 *
	 * @param createDate the create date of this car report
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the dealer ID of this car report.
	 *
	 * @param dealerId the dealer ID of this car report
	 */
	@Override
	public void setDealerId(long dealerId) {
		model.setDealerId(dealerId);
	}

	/**
	 * Sets the group ID of this car report.
	 *
	 * @param groupId the group ID of this car report
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this car report.
	 *
	 * @param modifiedDate the modified date of this car report
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this car report.
	 *
	 * @param primaryKey the primary key of this car report
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the user ID of this car report.
	 *
	 * @param userId the user ID of this car report
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this car report.
	 *
	 * @param userName the user name of this car report
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this car report.
	 *
	 * @param userUuid the user uuid of this car report
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this car report.
	 *
	 * @param uuid the uuid of this car report
	 */
	@Override
	public void setUuid(String uuid) {
		model.setUuid(uuid);
	}

	/**
	 * Sets the view date of this car report.
	 *
	 * @param viewDate the view date of this car report
	 */
	@Override
	public void setViewDate(Date viewDate) {
		model.setViewDate(viewDate);
	}

	@Override
	public String toXmlString() {
		return model.toXmlString();
	}

	@Override
	public StagedModelType getStagedModelType() {
		return model.getStagedModelType();
	}

	@Override
	protected CarReportWrapper wrap(CarReport carReport) {
		return new CarReportWrapper(carReport);
	}

}