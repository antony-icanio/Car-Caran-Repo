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

import com.carservice.model.Dealer;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Dealer in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class DealerCacheModel implements CacheModel<Dealer>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof DealerCacheModel)) {
			return false;
		}

		DealerCacheModel dealerCacheModel = (DealerCacheModel)object;

		if (dealerId == dealerCacheModel.dealerId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, dealerId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(17);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", dealerId=");
		sb.append(dealerId);
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
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Dealer toEntityModel() {
		DealerImpl dealerImpl = new DealerImpl();

		if (uuid == null) {
			dealerImpl.setUuid("");
		}
		else {
			dealerImpl.setUuid(uuid);
		}

		dealerImpl.setDealerId(dealerId);
		dealerImpl.setGroupId(groupId);
		dealerImpl.setCompanyId(companyId);
		dealerImpl.setUserId(userId);

		if (userName == null) {
			dealerImpl.setUserName("");
		}
		else {
			dealerImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			dealerImpl.setCreateDate(null);
		}
		else {
			dealerImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			dealerImpl.setModifiedDate(null);
		}
		else {
			dealerImpl.setModifiedDate(new Date(modifiedDate));
		}

		dealerImpl.resetOriginalValues();

		return dealerImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		dealerId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(dealerId);

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
	}

	public String uuid;
	public long dealerId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;

}