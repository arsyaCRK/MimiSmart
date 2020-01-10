-- alter table MIMISMART_ORDER_LINE add column UNITS_ID varchar(36) ^
-- update MIMISMART_ORDER_LINE set UNITS_ID = <default_value> ;
-- alter table MIMISMART_ORDER_LINE alter column UNITS_ID set not null ;
alter table MIMISMART_ORDER_LINE add column UNITS_ID varchar(36) not null ;
alter table MIMISMART_ORDER_LINE add column QTYFACT integer ;
alter table MIMISMART_ORDER_LINE add column BALANCE integer ;
alter table MIMISMART_ORDER_LINE add column DESCRIPTION varchar(255) ;
alter table MIMISMART_ORDER_LINE add column QTY integer ^
update MIMISMART_ORDER_LINE set QTY = 0 where QTY is null ;
alter table MIMISMART_ORDER_LINE alter column QTY set not null ;
