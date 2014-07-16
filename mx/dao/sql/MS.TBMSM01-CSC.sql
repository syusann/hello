rem DAOTool Ver 5.1125
rem MS.TBMSM01 的 新增 Table 的 sql
rem 103/06/09
rem (INPUT FILE VERSION:2.0)

rem DROP TABLE MS.TBMSM01 ;
rem RENAME TABLE MS.TBMSM01 TO $TABLE_NAME_OLD;

CREATE TABLE MS.TBMSM01 (msM01Uid_MSM01 INT  NOT NULL GENERATED ALWAYS AS IDENTITY,msM00Uid_MSM01 INT  NOT NULL WITH DEFAULT 0 ,compId_MSM01 VARCHAR (4) WITH DEFAULT '',vendorNo_MSM01 VARCHAR (10) WITH DEFAULT '',adty_MSM01 VARCHAR (2) WITH DEFAULT '',isDefault_MSM01 VARCHAR (1) WITH DEFAULT '',areaId_MSM01 VARCHAR (50) WITH DEFAULT '',postCode_MSM01 VARCHAR (5) WITH DEFAULT '',addr_MSM01 VARCHAR (200) WITH DEFAULT '',addrAll_MSM01 VARCHAR (200) WITH DEFAULT '',tel_MSM01 VARCHAR (20) WITH DEFAULT '',fax_MSM01 VARCHAR (20) WITH DEFAULT '',telex_MSM01 VARCHAR (20) WITH DEFAULT '',contact_MSM01 VARCHAR (50) WITH DEFAULT '',mobile_MSM01 VARCHAR (20) WITH DEFAULT '',email_MSM01 VARCHAR (200) WITH DEFAULT '',web_MSM01 VARCHAR (200) WITH DEFAULT '',publicClass_MSM01 VARCHAR (20) WITH DEFAULT '',vendorType_MSM01 VARCHAR (2) WITH DEFAULT '',crcy_MSM01 VARCHAR (5) WITH DEFAULT '',paidType_MSM01 VARCHAR (2) WITH DEFAULT '',bankCode_MSM01 VARCHAR (20) WITH DEFAULT '',accountNo_MSM01 VARCHAR (100) WITH DEFAULT '',bankName_MSM01 VARCHAR (200) WITH DEFAULT '',bankAddr_MSM01 VARCHAR (200) WITH DEFAULT '',createDate_MSM01 CHAR (8) WITH DEFAULT '',createTime_MSM01 CHAR (6) WITH DEFAULT '',createEmplComp_MSM01 VARCHAR (4) WITH DEFAULT '',createEmpl_MSM01 VARCHAR (10) WITH DEFAULT '',updateDate_MSM01 CHAR (8) WITH DEFAULT '',updateTime_MSM01 CHAR (6) WITH DEFAULT '',updateEmplComp_MSM01 VARCHAR (4) WITH DEFAULT '',updateEmpl_MSM01 VARCHAR (10) WITH DEFAULT '', PRIMARY KEY(msM01Uid_MSM01,msM00Uid_MSM01) ) DATA CAPTURE NONE  ;

CREATE UNIQUE INDEX MS.TIMSM01 ON MS.TBMSM01 (COMPID_MSM01   ASC,vendorNo_MSM01	ASC,adty_MSM01	ASC) CLOSE NO;

GRANT  CONTROL ON TABLE MS.TBMSM01 TO USER JAVAUSER ;
GRANT  SELECT,INSERT,UPDATE,DELETE,ALTER,INDEX,REFERENCES ON TABLE MS.TBMSM01 TO USER JAVAUSER WITH GRANT OPTION ;
