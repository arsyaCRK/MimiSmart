alter table MIMISMART_ORDER_FROM_SUPPLIER add column UNIT varchar(5) ^
update MIMISMART_ORDER_FROM_SUPPLIER set UNIT = '' where UNIT is null ;
alter table MIMISMART_ORDER_FROM_SUPPLIER alter column UNIT set not null ;
alter table MIMISMART_ORDER_FROM_SUPPLIER add column QUANTITY decimal(19, 2) ^
update MIMISMART_ORDER_FROM_SUPPLIER set QUANTITY = 0 where QUANTITY is null ;
alter table MIMISMART_ORDER_FROM_SUPPLIER alter column QUANTITY set not null ;
