alter table MIMISMART_ORDER_FROM_SUPPLIER add constraint FK_MIMISMART_ORDER_FROM_SUPPLIER_ON_QTY foreign key (QTY_ID) references MIMISMART_NOMENCLATURE(ID);
create index IDX_MIMISMART_ORDER_FROM_SUPPLIER_ON_QTY on MIMISMART_ORDER_FROM_SUPPLIER (QTY_ID);
