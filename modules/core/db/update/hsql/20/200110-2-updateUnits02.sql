alter table MIMISMART_UNITS alter column ORDER_FROM_SUPPLIER_ID rename to ORDER_FROM_SUPPLIER_ID__U66427 ^
alter table MIMISMART_UNITS drop constraint FK_MIMISMART_UNITS_ON_ORDER_FROM_SUPPLIER ;
drop index IDX_MIMISMART_UNITS_ON_ORDER_FROM_SUPPLIER ;
