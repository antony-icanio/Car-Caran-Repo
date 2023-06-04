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

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;Car_CarReport&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see CarReport
 * @generated
 */
public class CarReportTable extends BaseTable<CarReportTable> {

	public static final CarReportTable INSTANCE = new CarReportTable();

	public final Column<CarReportTable, String> uuid = createColumn(
		"uuid_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CarReportTable, Long> carReportId = createColumn(
		"carReportId", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<CarReportTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<CarReportTable, Long> companyId = createColumn(
		"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<CarReportTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<CarReportTable, String> userName = createColumn(
		"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<CarReportTable, Date> createDate = createColumn(
		"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<CarReportTable, Date> modifiedDate = createColumn(
		"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<CarReportTable, Long> carId = createColumn(
		"carId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<CarReportTable, Long> dealerId = createColumn(
		"dealerId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<CarReportTable, Date> viewDate = createColumn(
		"viewDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);

	private CarReportTable() {
		super("Car_CarReport", CarReportTable::new);
	}

}