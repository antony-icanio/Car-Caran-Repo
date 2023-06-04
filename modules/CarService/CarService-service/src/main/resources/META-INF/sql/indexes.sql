create index IX_4ED7DF0B on Car_CarReport (dealerId);
create index IX_87D002F7 on Car_CarReport (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_7C9ADB39 on Car_CarReport (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_8534935E on Car_Dealer (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_DEE65960 on Car_Dealer (uuid_[$COLUMN_LENGTH:75$], groupId);