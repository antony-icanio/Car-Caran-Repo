create table Car_CarReport (
	uuid_ VARCHAR(75) null,
	carReportId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	carId LONG,
	dealerId LONG,
	viewDate DATE null
);

create table Car_Dealer (
	uuid_ VARCHAR(75) null,
	dealerId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null
);