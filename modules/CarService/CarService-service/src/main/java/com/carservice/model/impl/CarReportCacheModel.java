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

package com.carservice.model.impl;

import com.carservice.model.CarReport;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing CarReport in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class CarReportCacheModel
	implements CacheModel<CarReport>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof CarReportCacheModel)) {
			return false;
		}

		CarReportCacheModel carReportCacheModel = (CarReportCacheModel)object;

		if (carReportId == carReportCacheModel.carReportId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, carReportId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(23);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", carReportId=");
		sb.append(carReportId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", carId=");
		sb.append(carId);
		sb.append(", dealerId=");
		sb.append(dealerId);
		sb.append(", viewDate=");
		sb.append(viewDate);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public CarReport toEntityModel() {
		CarReportImpl carReportImpl = new CarReportImpl();

		if (uuid == null) {
			carReportImpl.setUuid("");
		}
		else {
			carReportImpl.setUuid(uuid);
		}

		carReportImpl.setCarReportId(carReportId);
		carReportImpl.setGroupId(groupId);
		carReportImpl.setCompanyId(companyId);
		carReportImpl.setUserId(userId);

		if (userName == null) {
			carReportImpl.setUserName("");
		}
		else {
			carReportImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			carReportImpl.setCreateDate(null);
		}
		else {
			carReportImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			carReportImpl.setModifiedDate(null);
		}
		else {
			carReportImpl.setModifiedDate(new Date(modifiedDate));
		}

		carReportImpl.setCarId(carId);
		carReportImpl.setDealerId(dealerId);

		if (viewDate == Long.MIN_VALUE) {
			carReportImpl.setViewDate(null);
		}
		else {
			carReportImpl.setViewDate(new Date(viewDate));
		}

		carReportImpl.resetOriginalValues();

		return carReportImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		carReportId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();

		carId = objectInput.readLong();

		dealerId = objectInput.readLong();
		viewDate = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(carReportId);

		objectOutput.writeLong(groupId);

		objectOutput.writeLong(companyId);

		objectOutput.writeLong(userId);

		if (userName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(userName);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		objectOutput.writeLong(carId);

		objectOutput.writeLong(dealerId);
		objectOutput.writeLong(viewDate);
	}

	public String uuid;
	public long carReportId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public long carId;
	public long dealerId;
	public long viewDate;

}