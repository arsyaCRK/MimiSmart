alter table MIMISMART_ORDER_FROM_SUPPLIER alter column QTY_ID rename to QTY_ID__U84372 ^
alter table MIMISMART_ORDER_FROM_SUPPLIER drop constraint FK_MIMISMART_ORDER_FROM_SUPPLIER_ON_QTY ;
drop index IDX_MIMISMART_ORDER_FROM_SUPPLIER_ON_QTY ;
alter table MIMISMART_ORDER_FROM_SUPPLIER add column QTY_ID varchar(36) ;
